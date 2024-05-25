package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Habito : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "alcohol",
            "fumar",
            "drogas",
            "cocaína",
            "drogas por inyeccion",
            "deporte",
            "nadar",
            "correr",
            "entrenar",
            "actividad fisica",
            "baloncesto",
            "bicicleta",
            "tennis",
            "comer",
            "actividades de ocio",
            "dormir: dormir, duermes, duerme",
            "siesta",
            "trabajar: trabajar, trabajas, trabajo, trabaja"
        )
    }
}