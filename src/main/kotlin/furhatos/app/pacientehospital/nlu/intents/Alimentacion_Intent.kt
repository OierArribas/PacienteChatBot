package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Cantidad
import furhatos.app.pacientehospital.nlu.entities.InfluenciaSintoma
import furhatos.app.pacientehospital.nlu.entities.Sintoma
import furhatos.app.pacientehospital.nlu.entities.TipoAlimento
import furhatos.nlu.Intent

class Alimentacion_Describir (
    val TipoAlimento : TipoAlimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}


class Alimento_Si_No (
    val TipoAlimento : TipoAlimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Cantidad (
    val TipoAlimento : TipoAlimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Cantidad_Si_No (
    val TipoAlimento : TipoAlimento? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Duracion (
    val TipoAlimento : TipoAlimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Duracion_Sin (
    val TipoAlimento : TipoAlimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Cantidad_Duracion (
    val TipoAlimento : TipoAlimento? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Canntidad_Duracion_Sin (
    val TipoAlimento : TipoAlimento? = null,
    val Cantidad : Cantidad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Sintoma_Relacion (
    val TipoAlimento : TipoAlimento? = null,
    val Sintoma : Sintoma? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Sintoma_Relacion_Si_no (
    val TipoAlimento : TipoAlimento? = null,
    val Sintoma : Sintoma? = null,
    val InfluenciaSintoma : InfluenciaSintoma? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}