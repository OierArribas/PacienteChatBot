package furhatos.app.pacientehospital.flow.main

import furhatos.app.pacientehospital.nlu.intents.Motivo_De_Consulta
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
        furhat.say("Hola, Buenos dias! ")
        furhat.listen()
    }



    onResponse<Motivo_De_Consulta> {
        //furhat.say("Buenas, soy un estudiante de ingeniería que vive actualmente en su casa con su madre, también trabajo a tiempo parcial como cartero. He venido porque últimamente estaba notando un dolor en el pecho que me preocupa bastante.")
        goto(Interviewe)

    }

}

