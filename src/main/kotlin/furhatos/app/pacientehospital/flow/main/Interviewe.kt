package furhatos.app.pacientehospital.flow.main


import furhatos.app.pacientehospital.flow.Parent
import furhatos.app.pacientehospital.nlu.entities.Zona
import furhatos.app.pacientehospital.nlu.intents.*
import furhatos.app.pacientehospital.utils.*
import furhatos.flow.kotlin.*
import furhatos.nlu.Intent


val Interviewe: State = state(Parent) {

    //*--------------------------------------------------*//
    //*------------------- VARIABLES --------------------*//
    //*--------------------------------------------------*//

    //*----- Clase con Utilidades
    //val helper = EntityHelper()

    //*----- Memoria de Entidades
    var sintoma = ""
    var habito = ""
    var zona = ""
    var suceso = ""
    var tipoAlimento = ""
    var enfermedad = ""
    var medicamento = ""
    var medida = ""

    //*----- Obtención de Respuestas
    val clave = mutableListOf<String>()
    var valor: String
    var intent: String

    //*----- Mapa de Respuestas
    var mapaRespuestas: MutableMap<List<String>, String> =  mutableMapOf(
    listOf("") to "")

    //*----- Último Intent
    var lastIntent : Intent = Sintoma_Zona_Si_No()


    //*--------------------------------------------------*//
    //*-------------------- INICIO ----------------------*//
    //*--------------------------------------------------*//

    init {
        mapaRespuestas = importResponseMap()
        imprimirMapa(mapaRespuestas)
    }


    //*--------------------------------------------------*//
    //*------------------- ENTRADA ----------------------*//
    //*--------------------------------------------------*//

    onEntry {
        clave.clear()
        furhat.listen(timeout = 15000)



    }

    //*--------------------------------------------------*//
    //*-------------- FUNCION DE RECEPCION --------------*//
    //*--------------------------------------------------*//

    fun  Furhat.procesarEntrada(listaEntidades: List<String>, entrada: Intent) {

        intent = entrada.toString().split("{")[0]
        clave.add(intent)
        say(intent)


        for (entidad in listaEntidades) {
            if (entidad != "null"){
                say(entidad)
                clave.add(entidad)
            }

        }
        println(clave.joinToString() )
        valor = buscarEnMapa(mapaRespuestas,clave).toString()
        say(valor)

    }


    // FLUJO PRINCIPAL

    onResponse<Desde_Cuando>{

        when(lastIntent){
            Sintoma_Zona_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Cuando())}
            Habito_Si_No() -> { furhat.procesarEntrada(listOf(habito),Habito_Duracion())}
            Habito_Cantidad_Describir() -> { furhat.procesarEntrada(listOf(habito),Habito_Cantidad_Duracion())}
            Alimento_Si_No() -> { furhat.procesarEntrada(listOf(tipoAlimento),Alimento_Duracion())}
            Alimento_Cantidad_Describir() -> { furhat.procesarEntrada(listOf(habito),Alimento_Cantidad_Duracion())}
            Enfermedad_Si_No() -> { furhat.procesarEntrada(listOf(enfermedad),Enfermedad_Duracion())}
            Antecedente_Familia_Si_No() -> { furhat.procesarEntrada(listOf(enfermedad),Antecedente_Familia_Cuando())}
            Antecedente_Contacto_Si_No() -> { furhat.procesarEntrada(listOf(enfermedad),Antecedente_Contacto_Cuando())}
            Medicamento_Si_No() -> { furhat.procesarEntrada(listOf(medicamento),Medicamento_Duracion())}
            else -> furhat.say("Desde cuando que?")
        }

        reentry()

    }

    onResponse<Anteriormente_Pregunta>{

        when(lastIntent){
            Sintoma_Zona_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Antecedente_Si_No())}
            Habito_Si_No() -> { furhat.procesarEntrada(listOf(habito),Habito_Pasado_Si_No())}
            Enfermedad_Si_No() -> { furhat.procesarEntrada(listOf(enfermedad),Antecedente_Si_No())}
            Enfermedad_Describir() -> { furhat.procesarEntrada(listOf(),Antecedente_Describir())}
            Medicamento_Si_No() -> { furhat.procesarEntrada(listOf(medicamento),Medicamento_Antecedente_Si_No())}
            else -> furhat.say("No te entiendo")
        }

        reentry()

    }

    onResponse<Actualmente_Pregunta>{

        when(lastIntent){
            Sintoma_Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Zona_Si_No())}
            Habito_Pasado_Si_No() -> { furhat.procesarEntrada(listOf(habito),Habito_Si_No())}
            Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(enfermedad),Enfermedad_Si_No())}
            Antecedente_Describir() -> { furhat.procesarEntrada(listOf(),Enfermedad_Describir())}
            Medicamento_Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(medicamento),Medicamento_Si_No())}
            else -> furhat.say("No te entiendo")
        }

        reentry()

    }

    onResponse<Cantidad_Pregunta>{

        when(lastIntent){
            Sintoma_Zona_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Cantidad_Describir())}
            Sintoma_Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Cantidad_Describir())}
            Alimento_Si_No() -> { furhat.procesarEntrada(listOf(tipoAlimento),Alimento_Duracion())}
            Habito_Si_No() -> { furhat.procesarEntrada(listOf(habito),Habito_Cantidad_Describir())}
            Habito_Pasado_Si_No() -> { furhat.procesarEntrada(listOf(habito),Habito_Cantidad_Describir())}
            Medicamento_Si_No() -> { furhat.procesarEntrada(listOf(medicamento),Medicamento_Cantidad())}
            Medicamento_Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(medicamento),Medicamento_Cantidad())}
            else -> furhat.say("No te entiendo")
        }

        reentry()

    }

    onResponse<Relacion_Sintoma_Pregunta>{

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())

        when(lastIntent){
            Sintoma_Zona_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Cantidad_Describir())}
            Sintoma_Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Cantidad_Describir())}
            Alimento_Si_No() -> { furhat.procesarEntrada(listOf(tipoAlimento, sintoma, zona),Alimento_Sintoma_Relacion())}
            Habito_Si_No() -> { furhat.procesarEntrada(listOf(habito, sintoma, zona),Habito_Relacion_Sintoma_Si_No())}
            Habito_Pasado_Si_No() -> { furhat.procesarEntrada(listOf(habito, sintoma, zona),Habito_Relacion_Sintoma_Si_No())}
            Medicamento_Si_No() -> { furhat.procesarEntrada(listOf(medicamento),Medicamento_Relacion_Sintoma_Si_No())}
            Medicamento_Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(medicamento),Medicamento_Relacion_Sintoma_Si_No())}
            else -> furhat.say("No te entiendo")
        }

        reentry()


    }

    onResponse<Extender>{
        when(lastIntent){
            Sintoma_Zona_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Zona_Extender())}
            Sintoma_Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Zona_Extender())}
            Habito_Si_No() -> { furhat.procesarEntrada(listOf(habito),Habito_Extender())}
            Habito_Pasado_Si_No() -> { furhat.procesarEntrada(listOf(habito),Habito_Extender())}
            Enfermedad_Si_No() -> { furhat.procesarEntrada(listOf(enfermedad),Enfermedad_Extender())}
            Antecedente_Si_No() -> { furhat.procesarEntrada(listOf(enfermedad),Enfermedad_Extender())}
            else -> furhat.say("No te entiendo")
        }

        reentry()

    }

    onResponse<Intensidad>{
        when(lastIntent){
            Sintoma_Zona_Si_No() -> { furhat.procesarEntrada(listOf(sintoma,zona),Sintoma_Intensidad_Describir())}
            else -> furhat.say("No te entiendo")
        }

        reentry()
    }





    //*--------------------------------------------------*//
    //*------------------- PERSONAL ---------------------*//
    //*--------------------------------------------------*//

    onResponse<Peso>{

        lastIntent = Peso()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Edad>{

        lastIntent = Edad()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Altura>{

        lastIntent = Altura()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Hijos_Si_No>{

        lastIntent = Hijos_Si_No()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<EstadoPsicologico_Describir>{

        lastIntent = EstadoPsicologico_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Relaciones_Sociales_Describir>{

        lastIntent = Relaciones_Sociales_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }
    //*--------------------------------------------------*//
    //*------------------- SINTOMAS ---------------------*//
    //*--------------------------------------------------*//

    onResponse<Sintoma_Describir>{

        lastIntent = Sintoma_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Sintoma_Zona_Si_No> {

        lastIntent = Sintoma_Zona_Si_No()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    onResponse<Sintoma_Antecedente_Si_No> {

        lastIntent = Sintoma_Antecedente_Si_No()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    onResponse<Sintoma_Cuando> {

        lastIntent = Sintoma_Cuando()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    onResponse<Sintoma_Zona_Extender> {

        lastIntent = Sintoma_Zona_Extender()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    onResponse<Sintoma_Cantidad_Describir> {

        lastIntent = Sintoma_Cantidad_Describir()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    onResponse<Sintoma_Intensidad_Describir> {

        lastIntent = Sintoma_Intensidad_Describir()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    onResponse<Sintoma_Relacion_Describir> {

        lastIntent = Sintoma_Relacion_Describir()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    onResponse<Sintoma_Evolucion_Describir> {

        lastIntent = Sintoma_Evolucion_Describir()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }


    onResponse<Sintoma_Familia_Si_No> {

        lastIntent = Sintoma_Familia_Si_No()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }


    onResponse<Zona_Extender> {

        lastIntent = Zona_Extender()

        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }


    //*--------------------------------------------------*//
    //*------------------- HÁBITOS ----------------------*//
    //*--------------------------------------------------*//


    onResponse<Habito_Extender>{

        lastIntent = Habito_Extender()

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)
        reentry()

    }

    onResponse<Habito_Hobbie_Describir>{

        lastIntent = Habito_Hobbie_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Habito_Adiccion_Describir>{

        lastIntent = Habito_Adiccion_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }


    onResponse<Habito_Si_No>{

        lastIntent = Habito_Si_No()

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)
        reentry()
    }


    onResponse<Habito_Pasado_Si_No>{

        lastIntent = Habito_Pasado_Si_No()

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)
        reentry()
    }


    onResponse<Habito_Cantidad_Describir>{

        lastIntent = Habito_Cantidad_Describir()

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)
        reentry()
    }

    onResponse<Habito_Duracion>{

        lastIntent = Habito_Duracion()

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)
        reentry()
    }

    onResponse<Habito_Relacion_Sintoma_Si_No>{

        lastIntent = Habito_Relacion_Sintoma_Si_No()

        habito = obtenerTermino(it.intent.Habito.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        furhat.procesarEntrada(listOf(habito, sintoma, zona), it.intent)
        reentry()

    }

    onResponse<Sintoma_Dificulta_Habito_Si_No>{

        lastIntent = Sintoma_Dificulta_Habito_Si_No()

        habito = obtenerTermino(it.intent.Habito.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        furhat.procesarEntrada(listOf(habito, sintoma, zona), it.intent)
        reentry()

    }

    //*--------------------------------------------------*//
    //*----------------- ALIMENTACION -------------------*//
    //*--------------------------------------------------*//

    onResponse<Alimentacion_Describir>{

        lastIntent = Alimentacion_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Alimento_Si_No>{

        lastIntent = Alimento_Si_No()

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Cantidad_Describir>{

        lastIntent = Alimento_Cantidad_Describir()

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Duracion>{

        lastIntent = Alimento_Duracion()

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Cantidad_Duracion>{

        lastIntent = Alimento_Cantidad_Duracion()

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Sintoma_Relacion>{

        lastIntent = Alimento_Sintoma_Relacion()

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Sintoma_Mejora_Describir> {

        lastIntent = Alimento_Sintoma_Mejora_Describir()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }
    onResponse<Alimento_Sintoma_Empeora_Describir> {

        lastIntent = Alimento_Sintoma_Empeora_Describir()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)
        reentry()

    }

    //*--------------------------------------------------*//
    //*----------------- ENFERMEDADES -------------------*//
    //*--------------------------------------------------*//

    onResponse<Enfermedad_Describir>{

        lastIntent = Enfermedad_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Enfermedad_Si_No>{

        lastIntent = Enfermedad_Si_No()

        enfermedad = obtenerTermino(it.intent.Enfermedad.toString())
        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Enfermedad_Extender>{

        lastIntent = Enfermedad_Extender()

        enfermedad = obtenerTermino(it.intent.Enfermedad.toString())
        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Enfermedad_Duracion>{

        lastIntent = Enfermedad_Duracion()

        enfermedad = obtenerTermino(it.intent.Enfermedad.toString())
        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Antecedente_Familia_Describir>{

        lastIntent = Antecedente_Describir()

        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Antecedente_Familia_Si_No>{

        lastIntent = Antecedente_Si_No()

        enfermedad = obtenerTermino(it.intent.Enfermedad.toString())
        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Antecedente_Familia_Cuando>{

        lastIntent = Antecedente_Cuando()

        enfermedad = obtenerTermino(it.intent.Enfermedad.toString())
        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Antecedente_Contacto_Describir>{

        lastIntent = Antecedente_Describir()

        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Antecedente_Contacto_Si_No>{

        lastIntent = Antecedente_Si_No()

        enfermedad = obtenerTermino(it.intent.Enfermedad.toString())
        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    onResponse<Antecedente_Contacto_Cuando>{

        lastIntent = Antecedente_Cuando()

        enfermedad = obtenerTermino(it.intent.Enfermedad.toString())
        furhat.procesarEntrada(listOf(enfermedad), it.intent)
        reentry()

    }

    //*--------------------------------------------------*//
    //*----------------- MEDICAMENTOS -------------------*//
    //*--------------------------------------------------*//

    onResponse<Medicamento_Describir>{

        lastIntent = Medicamento_Describir()

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Medicamento_Si_No>{

        lastIntent = Medicamento_Si_No()

        medicamento = obtenerTermino(it.intent.Medicamento.toString())
        furhat.procesarEntrada(listOf(medicamento), it.intent)
        reentry()

    }

    onResponse<Medicamento_Antecedente_Si_No>{

        lastIntent = Medicamento_Antecedente_Si_No()

        medicamento = obtenerTermino(it.intent.Medicamento.toString())
        furhat.procesarEntrada(listOf(medicamento), it.intent)
        reentry()

    }

    onResponse<Medicamento_Si_No>{

        lastIntent = Medicamento_Si_No()

        medicamento = obtenerTermino(it.intent.Medicamento.toString())
        furhat.procesarEntrada(listOf(medicamento), it.intent)
        reentry()

    }

    onResponse<Medicamento_Duracion>{

        lastIntent = Medicamento_Duracion()

        medicamento = obtenerTermino(it.intent.Medicamento.toString())
        furhat.procesarEntrada(listOf(medicamento), it.intent)
        reentry()

    }

    onResponse<Medicamento_Cantidad>{

        lastIntent = Medicamento_Cantidad()

        medicamento = obtenerTermino(it.intent.Medicamento.toString())
        furhat.procesarEntrada(listOf(medicamento), it.intent)
        reentry()

    }

    //*--------------------------------------------------*//
    //*------------------- MEDIDAS ----------------------*//
    //*--------------------------------------------------*//


    onResponse<Medida_Describir>{

        lastIntent = Medida_Describir()

        medida = obtenerTermino(it.intent.Medida.toString())
        furhat.procesarEntrada(listOf(medida), it.intent)
        reentry()

    }

    //*--------------------------------------------------*//
    //*------------------- SUCESOS ----------------------*//
    //*--------------------------------------------------*//

    onResponse<Suceso_Si_No> {

        suceso = obtenerTermino(it.intent.Suceso.toString())
        furhat.procesarEntrada(listOf(suceso), it.intent)

        reentry()
    }



}


