package furhatos.app.pacientehospital.nlu.intents

import furhatos.app.pacientehospital.nlu.entities.*
import furhatos.nlu.Intent
import furhatos.util.Language

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


class Alimento_Duracion (
    val Alimento : Alimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Cuando (
    val Alimento : Alimento? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
    override fun getNegativeExamples(language: Language): List<String> {
        return listOf("desde cuándo @Alimento" ,
            " desde cuándo come @Alimento ",
            " desde cuándo consume @Alimento ",
            " desde cuándo bebe @Alimento ",
        )
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


class Alimento_Sintoma_Relacion (
    val Alimento : Alimento? = null,
    val Sintoma : Sintoma? = null,
    val Zona: Zona? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Sintoma_Mejora_Describir (
    val Sintoma : Sintoma? = null,
    val Zona: Zona? = null,
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

class Alimento_Sintoma_Empeora_Describir (
    val Sintoma : Sintoma? = null,
    val Zona: Zona? = null
) : Intent() {

    override fun getConfidenceThreshold(): Double {
        return 0.3
    }
}

