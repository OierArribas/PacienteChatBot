package furhatos.app.newskill.nlu.intents

import furhatos.app.newskill.nlu.entities.Sintoma
import furhatos.app.newskill.nlu.entities.Tiempo
import furhatos.app.newskill.nlu.entities.Zona
import furhatos.nlu.Intent
import furhatos.util.Language



class Sintoma_Zona_Si_No (
        val Sintoma : Sintoma? = null,
        val Zona : Zona? = null,
        val Tiempo: Tiempo? = null
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