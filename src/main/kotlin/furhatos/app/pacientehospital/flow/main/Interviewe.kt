package furhatos.app.pacientehospital.flow.main


import furhatos.app.pacientehospital.flow.Parent
import furhatos.app.pacientehospital.nlu.entities.Sintoma
import furhatos.app.pacientehospital.nlu.entities.Zona
import furhatos.app.pacientehospital.nlu.intents.*
import furhatos.app.pacientehospital.utils.*
import furhatos.flow.kotlin.*
import furhatos.nlu.Intent
import furhatos.nlu.IntentInstance
import furhatos.nlu.Response


val Interviewe: State = state(Parent) {

    //*--------------------------------------------------*//
    //*------------------- VARIABLES --------------------*//
    //*--------------------------------------------------*//

    //*----- Clase con Utilidades
    val helper = EntityHelper()

    //*----- Memoria de Entidades
    var sintoma = ""
    var habito = ""
    var zona = ""
    var suceso = ""
    var cantidad = ""
    var tipoAlimento = ""

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
        furhat.say("Interviewe")
        furhat.listen(timeout = 15000)



    }
    /*
    fun  <T : IntentInstance?> Furhat.procesarEntrada(listaEntidades: List<String>, entrada: Response<T>) {

        intent = entrada.intent.toString().split("{")[0]
        clave.add(intent)
        say(intent)


        for (entidad in listaEntidades) {
            if (entidad != "null"){
                say(entidad)
                clave.add(entidad)
            }

        }

        valor = buscarEnMapa(mapaRespuestas,clave).toString()
        say(valor)



    }

     */

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

            else -> furhat.say("Desde cuando que?")
        }

        reentry()

    }

    //*--------------------------------------------------*//
    //*------------------- PERSONAL ---------------------*//
    //*--------------------------------------------------*//

    onResponse<Peso>{

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Edad>{

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Altura>{

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Hijos_Si_No>{

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<EstadoPsicologico_Describir>{

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    //*--------------------------------------------------*//
    //*------------------- SINTOMAS ---------------------*//
    //*--------------------------------------------------*//

    onResponse<Sintoma_Zona_Si_No> {

        lastIntent = Sintoma_Zona_Si_No()

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)

        reentry()
    }

    onResponse<Sintoma_Cuando> {

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)

        reentry()

    }

    onResponse<Sintoma_Zona_Extender> {

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())
        furhat.procesarEntrada(listOf(sintoma, zona),it.intent)

        reentry()
    }

    //*--------------------------------------------------*//
    //*------------------- HÁBITOS ----------------------*//
    //*--------------------------------------------------*//


    onResponse<Habito_Describir>{

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)

        reentry()

    }


    onResponse<Habito_Si_No>{

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)

        reentry()
    }


    onResponse<Habito_Pasado_Si_No>{

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)
        reentry()
    }


    onResponse<Habito_Cantidad_Describir>{

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)

        reentry()
    }


    onResponse<Habito_Cantidad_Si_No>{

        habito = obtenerTermino(it.intent.Habito.toString())
        cantidad = obtenerTermino(it.intent.Cantidad.toString())
        furhat.procesarEntrada(listOf(habito,cantidad), it.intent)

        reentry()
    }


    onResponse<Habito_Duracion>{

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)

        reentry()
    }

    onResponse<Habito_Duracion_Sin>{

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)

        reentry()

    }

    onResponse<Habito_Relacion_Sintoma_Si_No>{

        habito = obtenerTermino(it.intent.Habito.toString())
        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        furhat.procesarEntrada(listOf(habito), it.intent)

        reentry()

    }



    //*--------------------------------------------------*//
    //*----------------- ALIMENTACION -------------------*//
    //*--------------------------------------------------*//

    onResponse<Alimentacion_Describir>{

        furhat.procesarEntrada(listOf(), it.intent)
        reentry()

    }

    onResponse<Alimento_Si_No>{

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Cantidad_Describir>{

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Cantidad_Si_No>{

        cantidad = obtenerTermino(it.intent.Cantidad.toString())
        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento, cantidad), it.intent)
        reentry()

    }

    onResponse<Alimento_Duracion>{

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Duracion_Sin>{

        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento), it.intent)
        reentry()

    }

    onResponse<Alimento_Cantidad_Duracion>{

        cantidad = obtenerTermino(it.intent.Cantidad.toString())
        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento, cantidad), it.intent)
        reentry()

    }

    onResponse<Alimento_Cantidad_Duracion_Sin>{

        cantidad = obtenerTermino(it.intent.Cantidad.toString())
        tipoAlimento = obtenerTermino(it.intent.Alimento.toString())
        furhat.procesarEntrada(listOf(tipoAlimento, cantidad), it.intent)
        reentry()

    }



    //*--------------------------------------------------*//
    //*----------------- ENFERMEDADES -------------------*//
    //*--------------------------------------------------*//



    //*--------------------------------------------------*//
    //*------------------- SUCESOS ----------------------*//
    //*--------------------------------------------------*//

    onResponse<Suceso_Si_No> {
        furhat.say(it.intent.Suceso.toString())


        if (it.intent.Suceso != null){
            suceso = it.intent.Suceso.toString()
        }

        if (suceso == "golpe"){
            furhat.say("No que yo recuerde")
        } else {
            furhat.say("No")
        }

        reentry()
    }



}


