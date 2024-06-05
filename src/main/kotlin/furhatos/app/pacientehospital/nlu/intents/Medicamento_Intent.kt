package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Medicamento
import furhatos.app.pacientehospital.nlu.entities.Sintoma
import furhatos.app.pacientehospital.nlu.entities.Zona
import furhatos.nlu.Intent

class Medicamento_Describir () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Medicamento_Si_No (
    val Medicamento : Medicamento? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Medicamento_Cantidad (
    val Medicamento : Medicamento? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Medicamento_Antecedente_Si_No (
    val Medicamento : Medicamento? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Medicamento_Duracion (
    val Medicamento : Medicamento? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Medicamento_Relacion_Sintoma_Si_No (
    val Medicamento : Medicamento? = null,
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}