package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Cantidad
import furhatos.app.pacientehospital.nlu.entities.Evento
import furhatos.app.pacientehospital.nlu.entities.Sintoma
import furhatos.nlu.Intent


class Evento_Describir (
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Cantidad (
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Cantidad_Si_No (
    val Evento : Evento? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Cantidad_Duracion (
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Cantidad_Duracion_Sin (
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Molestia (
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Molestia_Duracion (
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Evento_Afecta_Si_No (
    val Sintoma : Sintoma? = null,
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Evento_Afecta_Duracion (
    val Sintoma : Sintoma? = null,
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Influencia_Sintoma (
    val Sintoma : Sintoma? = null,
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Evento_Influencia_Sintoma_Si_No (
    val Sintoma : Sintoma? = null,
    val Evento : Evento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}



