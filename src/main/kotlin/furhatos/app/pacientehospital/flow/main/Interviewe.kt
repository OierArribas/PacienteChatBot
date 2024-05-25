package furhatos.app.pacientehospital.flow.main


import furhatos.app.newskill.nlu.intents.Sintoma_Cuando
import furhatos.app.newskill.nlu.intents.Sintoma_Zona_Describir
import furhatos.app.newskill.nlu.intents.Sintoma_Zona_Si_No
import furhatos.app.newskill.nlu.intents.Suceso_Si_No
import furhatos.app.pacientehospital.flow.Parent
import furhatos.app.pacientehospital.utils.EntityHelper
import furhatos.flow.kotlin.*
import furhatos.nlu.Intent
import importResponseMap
import imprimirMapa


val Interviewe: State = state(Parent) {

    val helper = EntityHelper()
    var sintoma = ""
    var zona = ""
    var suceso = ""

    val clave = listOf<String>()
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

        furhat.say("Interviewe")

        furhat.listen(timeout = 15000)

    }

    // FLUJO PRINCIPAL

    //*------------------- Sintomas ---------------------*//

    onResponse<Sintoma_Zona_Si_No> {

        lastIntent = Sintoma_Zona_Si_No()

        furhat.say(helper.obtenerTermino(it.intent.Zona.toString()))
        furhat.say(it.intent.Sintoma.toString())
        //furhat.say(it.intent.Tiempo.toString())

        if (it.intent.Sintoma != null){
            sintoma = helper.obtenerTermino(it.intent.Sintoma.toString())
            //print(sintoma)
            //println("hola")
            clave.plus(sintoma)
        }

        if(it.intent.Zona != null) {
            zona = helper.obtenerTermino(it.intent.Zona.toString())
            clave.plus(zona)
        }

        for (v in clave){
            println(v)
        }
        //println(clave)
        valor = mapaRespuestas[clave].toString()
        print(mapaRespuestas[clave].toString())
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

    onResponse {
        raise(it, lastIntent)
    }


}


