package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class RelacionTemporal : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "antes",
            "despues",
            "durante"
        )
    }
}