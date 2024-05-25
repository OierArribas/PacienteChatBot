package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Cantidad
import furhatos.app.pacientehospital.nlu.entities.Habito
import furhatos.nlu.Intent

class Habito_Describir (
    val Habito : Habito? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Habito_Adiccion_Describir () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Habito_Si_No (
    val Habito : Habito? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Habito_Pasado_Si_No (
    val Habito : Habito? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Habito_Cantidad_Describir (
    val Habito : Habito? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Habito_Cantidad_Si_No (
    val Habito : Habito? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Habito_Duracion (
    val Habito : Habito? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Habito_Duracion_Sin (
    val Habito : Habito? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}