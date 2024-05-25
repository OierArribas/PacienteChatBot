package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Evento : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "dormir"
        )
    }
}