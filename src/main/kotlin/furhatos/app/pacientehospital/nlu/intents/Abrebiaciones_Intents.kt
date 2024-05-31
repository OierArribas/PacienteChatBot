package furhatos.app.pacientehospital.nlu.intents

import furhatos.nlu.Intent

class Desde_Cuando (
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}