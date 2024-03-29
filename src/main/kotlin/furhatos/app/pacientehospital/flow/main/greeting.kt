package furhatos.app.pacientehospital.flow.main

import furhatos.app.newskill.nlu.intents.BuyFruit
import furhatos.app.newskill.nlu.intents.Motivo_De_Consulta
import furhatos.app.pacientehospital.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes
import furhatos.util.Language

val Greeting: State = state(Parent) {
    onEntry {
        furhat.setInputLanguage(Language.SPANISH_ES, Language.ENGLISH_US)
        furhat.say("Entering ")
        furhat.listen()
    }


    onResponse<BuyFruit> {
        furhat.say(it.intent.Fruit.toString())
    }

    onResponse<Motivo_De_Consulta> {
        furhat.say("Mi problema es blablabla")
        goto(Interviewe)

    }

}

