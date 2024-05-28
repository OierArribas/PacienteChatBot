package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Alimento : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "Proteínas",
            "Carbohidratos",
            "Grasas",
            "Fibra dietética",
            "Vitaminas",
            "Minerales",
            "Agua",
            "Ácidos grasos",
            "Antioxidantes",
            "Aminoácidos esenciales",
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