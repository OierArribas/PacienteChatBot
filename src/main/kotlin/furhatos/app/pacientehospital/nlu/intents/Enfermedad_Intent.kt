package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Enfermedad
import furhatos.nlu.Intent

class Antecedente_Describir () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Antecedente_Si_No (
    val Enfermedad : Enfermedad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Antecedente_Cuando (
    val Enfermedad : Enfermedad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Antecedente_Familia_Describir () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Antecedente_Familia_Si_No (
    val Enfermedad : Enfermedad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Antecedente_Familia_Cuando (
    val Enfermedad : Enfermedad? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}