package furhatos.app.newskill.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language



class Sintoma : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("herida: herida, heridas",
                "dolor: dolor, dolores, daño",
                "debilidad: debilidad muscular",
                "falta de equilibrio: problema de equilibrio",
                "fiebre: dolor de cabeza",
                "escalofrios",
                "entumecimiento",


                )
    }
}


class Tiempo : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
                "recientemenre: ultimamente, hace poco, en la ultima semana"
        )
    }
}


class Zona : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("pie: pies, el pie, los pies",
                "cabeca: la cabeza",

        )
    }
}

class Habito : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
        )
    }
}

class Medicamento : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
        )
    }
}

class Suceso : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
                "golpe: caida, caido, golpeado"
        )
    }
}

class Fruit : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
                "banana", "naranja", "manzana", "pina", "pera"
        )
    }
}
