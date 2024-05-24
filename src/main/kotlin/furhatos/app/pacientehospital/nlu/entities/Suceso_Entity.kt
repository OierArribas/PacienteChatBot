package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Suceso : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "golpe: caida, caido, golpeado",
            "perida de peso: perdida de peso, bajada de peso",
        )
    }
}
