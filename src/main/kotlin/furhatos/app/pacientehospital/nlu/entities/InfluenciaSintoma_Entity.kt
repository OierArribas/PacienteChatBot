package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class InfluenciaSintoma : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "mejorar",
            "empeorar"
        )
    }
}