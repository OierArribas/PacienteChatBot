package furhatos.app.pacientehospital.nlu.intents

import furhatos.nlu.Intent


class Despedida: Intent(){

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}