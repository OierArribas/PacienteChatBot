package furhatos.app.pacientehospital.nlu.intents

import furhatos.nlu.Intent

class Edad () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Peso () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}