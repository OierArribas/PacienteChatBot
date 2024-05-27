package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Medida
import furhatos.nlu.Intent

class Medida_Describir (
    val Medida : Medida? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}