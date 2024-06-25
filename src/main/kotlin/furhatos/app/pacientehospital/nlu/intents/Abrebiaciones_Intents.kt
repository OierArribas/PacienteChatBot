package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Sintoma
import furhatos.app.pacientehospital.nlu.entities.Zona
import furhatos.nlu.Intent

class Desde_Cuando (
) : Intent() {



}

class Actualmente_Pregunta (
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}

class Anteriormente_Pregunta (
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}


class Cantidad_Pregunta (
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}

class Relacion_Sintoma_Pregunta (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}

class Extender (
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}

class Intensidad (
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}