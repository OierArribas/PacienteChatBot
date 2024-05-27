package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Alimento : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "alcohol",
            "vino",
            "aditivos alimentarios",
            "patatas",
            "nutrientes",
            "chocolate",
            "comida rapida",
            "agua",
            "judias",
            "queso",
            "embutidos",
            "comida picante",
            "frutos secos",
            "queso"
        )
    }
}