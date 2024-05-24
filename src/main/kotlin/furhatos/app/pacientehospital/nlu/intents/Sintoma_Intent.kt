package furhatos.app.newskill.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Cantidad
import furhatos.app.pacientehospital.nlu.entities.InfluenciaSintoma
import furhatos.app.pacientehospital.nlu.entities.Sintoma
import furhatos.app.pacientehospital.nlu.entities.Zona
import furhatos.nlu.Intent


class Sintoma_Zona_Si_No (
        val Sintoma : Sintoma? = null,
        val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Sintoma_Zona_Describir (
        val Sintoma : Sintoma? = null,
        val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Sintoma_Cuando (
        val Sintoma : Sintoma? = null,
        val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Cantidad (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Intensidad (
    val Sintoma : Sintoma? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Evolucion_Describir (
    val Sintoma : Sintoma? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Sintoma_Evolucion_Si_No (
    val Sintoma : Sintoma? = null,
    val InfluenciaSintoma : InfluenciaSintoma? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

