package furhatos.app.newskill.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.Suceso
import furhatos.nlu.Intent


class Suceso_Describir () : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}

class Suceso_Si_No (
        val Suceso: Suceso? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }

}