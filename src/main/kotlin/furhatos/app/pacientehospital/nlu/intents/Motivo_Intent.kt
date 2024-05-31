package furhatos.app.pacientehospital.nlu.intents

import furhatos.nlu.Intent

class Motivo_De_Consulta: Intent(){

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

