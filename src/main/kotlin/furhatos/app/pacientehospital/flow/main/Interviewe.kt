package furhatos.app.pacientehospital.flow.main


import furhatos.app.newskill.nlu.entities.Sintoma
import furhatos.app.newskill.nlu.entities.Zona
import furhatos.app.newskill.nlu.intents.Sintoma_Cuando
import furhatos.app.newskill.nlu.intents.Sintoma_Zona_Describir
import furhatos.app.newskill.nlu.intents.Sintoma_Zona_Si_No
import furhatos.app.newskill.nlu.intents.Suceso_Si_No
import furhatos.app.pacientehospital.flow.Parent
import furhatos.app.pacientehospital.utils.EntityHelper
import furhatos.flow.kotlin.*
import furhatos.nlu.Intent


val Interviewe: State = state(Parent) {

    val helper = EntityHelper()
    var sintoma = ""
    var zona = ""
    var suceso = ""

    var lastIntent : Intent = Sintoma_Zona_Si_No()


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
        }

        if(it.intent.Zona != null) {
            zona = helper.obtenerTermino(it.intent.Zona.toString())
        }

        if (helper.obtenerTermino(it.intent.Zona.toString()) == "pie") {
            if (sintoma == "dolor"){
                furhat.say("Mmm no, mas bien siento entumecimiento en el pie")
            }else if (sintoma == "entumecimiento"){
                furhat.say("Si, eso es")
            } else {
                furhat.say("No, no siento ese $sintoma en el pie")
            }
        } else {
            when(sintoma) {
                "escalofríos", "fiebre" -> furhat.say("no, no he sufrido fiebre o escalofrios")
                "torpeza" -> furhat.say("Si! Noto las manos debiles, por ejemplo me cuesta abrir latas")
                "hipertension" , "hipercolesterolemia"-> furhat.say("Si, he sufrido $sintoma")


                else ->  furhat.say("No" )
            }
        }


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


