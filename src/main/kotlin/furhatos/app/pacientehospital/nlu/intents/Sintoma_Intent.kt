package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.*
import furhatos.nlu.Intent



class Sintoma_Zona_Si_No (
        val Sintoma : Sintoma? = null,
        val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Antecedente_Si_No (
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

class Sintoma_Extender (
    val Sintoma : Sintoma? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Relacion_Describir () : Intent() {

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

class Sintoma_Familia_Familia (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Sintoma_Familia_Si_No (
    val Sintoma : Sintoma? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Progresion_Describir (
    val Sintoma: Sintoma? = null
): Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

