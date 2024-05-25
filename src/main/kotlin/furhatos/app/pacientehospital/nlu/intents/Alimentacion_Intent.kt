package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Cantidad
import furhatos.app.pacientehospital.nlu.entities.InfluenciaSintoma
import furhatos.app.pacientehospital.nlu.entities.Sintoma
import furhatos.app.pacientehospital.nlu.entities.Alimento
import furhatos.nlu.Intent

class Alimentacion_Describir () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Alimento_Si_No (
    val Alimento : Alimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Cantidad_Describir (
    val Alimento : Alimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Cantidad_Si_No (
    val Alimento : Alimento? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Duracion (
    val Alimento : Alimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Duracion_Sin (
    val Alimento : Alimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Cantidad_Duracion (
    val Alimento : Alimento? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Canntidad_Duracion_Sin (
    val Alimento : Alimento? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Sintoma_Relacion (
    val Alimento : Alimento? = null,
    val Sintoma : Sintoma? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Sintoma_Relacion_Si_no (
    val Alimento : Alimento? = null,
    val Sintoma : Sintoma? = null,
    val InfluenciaSintoma : InfluenciaSintoma? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}