package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.*
import furhatos.nlu.Intent
import furhatos.util.Language

class Habito_Extender (
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


class Habito_Hobbie_Describir () : Intent() {

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

    override fun getNegativeExamples(language: Language): List<String> {
        return listOf("Cuanto @Habito haces" ,
                " Cuanto tiempo @Habito, cuanto "
        )
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

class Habito_Cantidad_Duracion (
    val Habito : Habito? = null,
    val Cantidad: Cantidad? = null
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


class Habito_Relacion_Sintoma_Si_No (
    val Habito : Habito? = null,
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Sintoma_Dificulta_Habito_Si_No (
    val Habito : Habito? = null,
    val Sintoma : Sintoma? = null,
    val Zona : Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}