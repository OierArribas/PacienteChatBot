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



    // FLUJO PRINCIPAL


    //*--------------------------------------------------*//
    //*------------------- SINTOMAS ---------------------*//
    //*--------------------------------------------------*//

    onResponse<Sintoma_Zona_Si_No> {

        sintoma = obtenerTermino(it.intent.Sintoma.toString())
        zona = obtenerTermino(it.intent.Zona.toString())

        furhat.procesarEntrada(listOf(sintoma, zona),it)

        reentry()
    }

    onResponse<Sintoma_Cuando> {
        furhat.say(it.intent.Sintoma.toString())
        furhat.say(it.intent.Zona.toString())

        if (it.intent.Sintoma != null){
            sintoma = helper.obtenerTermino(it.intent.Sintoma.toString())
        }

        if(it.intent.Zona != null) {
            zona = helper.obtenerTermino(it.intent.Zona.toString())
        }



        if (sintoma == "entumecimiento"){
            furhat.say("Empezé a notarlo hace dos dias")
        } else {
            furhat.say("No, no he tenido $sintoma ultimamente")
        }




        reentry()
    }

    onResponse<Sintoma_Zona_Describir> {
        furhat.say(it.intent.Sintoma.toString())


        if (it.intent.Sintoma != null){
            sintoma = helper.obtenerTermino(it.intent.Sintoma.toString())
        }



        if (sintoma == "entumecimiento"){
            furhat.say("Lo noto en los pies")
        } else {
            furhat.say("No he tenido $sintoma")
        }

        reentry()
    }

    //*--------------------------------------------------*//
    //*------------------- HÁBITOS ----------------------*//
    //*--------------------------------------------------*//


    onResponse<Habito_Describir>{

        intent = it.intent.toString().split("{")[0]
        furhat.say(intent)
        clave.add(intent)

        cantidad = obtenerTermino(it.intent.Habito.toString())
        furhat.say(cantidad)
        clave.add(cantidad)

        valor = buscarEnMapa(mapaRespuestas,clave).toString()

        furhat.say(valor)
        reentry()

    }

    onResponse<Habito_Si_No>{

        habito = obtenerTermino(it.intent.Habito.toString())
        furhat.procesarEntrada(listOf(habito), it)

        reentry()
    }

    /*

    onResponse<Habito_Pasado_Si_No>{

    }

    onResponse<Habito_Cantidad_Describir>{

    }
    */


    onResponse<Habito_Cantidad_Si_No>{
        lastIntent = Habito_Cantidad_Si_No()

        intent = it.intent.toString().split("{")[0]
        clave.add(intent)
        furhat.say(helper.obtenerTermino(it.intent.Habito.toString()))
        furhat.say(it.intent.Cantidad.toString())
        //furhat.say(it.intent.Tiempo.toString())



        habito = helper.obtenerTermino(it.intent.Habito.toString())
        println("habito $habito")
        clave.add(habito)


        cantidad = helper.obtenerTermino(it.intent.Cantidad.toString())
        clave.add(cantidad)



        println(clave.joinToString() )
        //println(clave)
        valor = mapaRespuestas[clave].toString()
        println(mapaRespuestas[clave].toString())


        println(buscarEnMapa(mapaRespuestas,clave))
        furhat.say(valor)
        reentry()
    }

    /*
    onResponse<Habito_Duracion>{

    }

    onResponse<Habito_Duracion_Sin>{

    }

    onResponse<Habito_Relacion_Sintoma_Si_No>{

    }
    */


    //*--------------------------------------------------*//
    //*----------------- ALIMENTACION -------------------*//
    //*--------------------------------------------------*//

    //*--------------------------------------------------*//
    //*----------------- ENFERMEDADES -------------------*//
    //*--------------------------------------------------*//

    //*--------------------------------------------------*//
    //*------------------- PERSONAL ---------------------*//
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



    /*
            onResponse {
                raise(it, lastIntent)
            }
        */



}


