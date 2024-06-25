package furhatos.app.pacientehospital.flow

import furhatos.app.pacientehospital.flow.main.Idle
import furhatos.app.pacientehospital.flow.main.Greeting
import furhatos.app.pacientehospital.setting.DISTANCE_TO_ENGAGE
import furhatos.app.pacientehospital.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users
import furhatos.util.Gender
import furhatos.util.Language

val Init: State = state {
    init {
        // CONFIGURATION

        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)

        // Set input language as spanish
        furhat.setInputLanguage(Language.SPANISH_ES)

        // Set dafault confidence threshold
        furhat.param.intentConfidenceThreshold = 0.8

        // Set Output voice as spanish
        furhat.setVoice(Language.SPANISH_ES, Gender.MALE, false)

        // Alternative clasification
        // LogisticMultiIntentClassifier.setAsDefault()
    }
    onEntry {
        /** start interaction */
        when {
            furhat.isVirtual() -> goto(Greeting) // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                goto(Greeting)
            }
            else -> goto(Idle)
        }
    }

}
