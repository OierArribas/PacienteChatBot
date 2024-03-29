package furhatos.app.newskill.nlu.intents

import furhatos.app.newskill.nlu.entities.Suceso
import furhatos.nlu.Intent
import furhatos.util.Language

class Suceso_Si_No (
        val Suceso: Suceso? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}