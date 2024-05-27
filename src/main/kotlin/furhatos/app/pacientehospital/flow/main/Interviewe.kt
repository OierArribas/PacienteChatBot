package furhatos.app.pacientehospital.flow.main


import buscarEnMapa
import furhatos.app.pacientehospital.nlu.intents.Sintoma_Cuando
import furhatos.app.pacientehospital.nlu.intents.Sintoma_Zona_Describir
import furhatos.app.pacientehospital.nlu.intents.Sintoma_Zona_Si_No
import furhatos.app.pacientehospital.nlu.intents.Suceso_Si_No
import furhatos.app.pacientehospital.flow.Parent
import furhatos.app.pacientehospital.nlu.intents.Habito_Cantidad_Si_No
import furhatos.app.pacientehospital.utils.EntityHelper
import furhatos.flow.kotlin.*
import furhatos.nlu.Intent
import importResponseMap
import imprimirMapa


val Interviewe: State = state(Parent) {

    val helper = EntityHelper()
    var sintoma = ""
    var habito = ""
    var zona = ""
    var suceso = ""
    var cantidad = ""

    val clave = mutableListOf<String>()
    var valor: String

    var mapaRespuestas: MutableMap<List<String>, String> =  mutableMapOf(
    listOf("") to ""
)

    var lastIntent : Intent = Sintoma_Zona_Si_No()

    init {
        mapaRespuestas = importResponseMap()
        imprimirMapa(mapaRespuestas)
    }



    onEntry {
        clave.clear()
        furhat.say("Interviewe")
        furhat.listen(timeout = 15000)


    }

    // FLUJO PRINCIPAL

    //*------------------- Sintomas ---------------------*//

    onResponse<Sintoma_Zona_Si_No> {

        lastIntent = Sintoma_Zona_Si_No()

        val intent = it.intent.toString().split("{")[0]
        clave.add(intent)
        furhat.say(helper.obtenerTermino(it.intent.Zona.toString()))
        furhat.say(it.intent.Sintoma.toString())
        //furhat.say(it.intent.Tiempo.toString())

        if (it.intent.Sintoma != null){
            sintoma = helper.obtenerTermino(it.intent.Sintoma.toString())

            clave.add(sintoma)
        }

        if(it.intent.Zona != null) {
            zona = helper.obtenerTermino(it.intent.Zona.toString())
            clave.add(zona)
        }

        println(clave.joinToString() )
        print(it.intent.toString())
        //println(clave)
        valor = mapaRespuestas[clave].toString()
        println(mapaRespuestas[clave].toString())
        furhat.say(valor)


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

    //*------------------- Sucesos ---------------------*//

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

    onResponse<Habito_Cantidad_Si_No>{
        lastIntent = Habito_Cantidad_Si_No()

        val intent = it.intent.toString().split("{")[0]
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
            onResponse {
                raise(it, lastIntent)
            }
        */



}


