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


class Sintoma_Zona_Extender (
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


class Sintoma_Cantidad_Describir (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}



class Sintoma_Intensidad_Describir (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Sintoma_Relacion_Describir (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Sintoma_Evolucion_Describir (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}




class Sintoma_Familia_Si_No (
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
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


class Zona_Extender (
    val Zona: Zona? = null
): Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

