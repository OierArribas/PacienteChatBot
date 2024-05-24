package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Sintoma : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("herida: herida, heridas",
            "dolor: dolor, dolores, daño",
            "debilidad: debilidad muscular, debilidad",
            "falta de equilibrio: problema de equilibrio, falta de equilibrio, problemas de equilibrio",
            "fiebre: fiebre, dolor de cabeza, dolores de cabeza",
            "escalofrios",
            "entumecimiento",
            "sudor nocturno: sudor nocturno, sudores nocturnos",
            "cambios sensoriales: cambios sensoriales, cambio sensorial",
            "dolor de garganta",
            "tos",
            "sibilancia: sibilancia, sibilancias",
            "mareo: mareo, vertigo",
            "vomito: vomito, vomitos, nauseas",
            "dolor de pecho",
            "diarrea",
            "estreñiniemto",
            "problema urinario: problema urinario, problemas urinarios",
            "torpeza",
            "dolor articular: dolor articular, dolor en las articulaciones",
            "cambio de temperatura: cambio de temperatura, cambios de temperatura",
            "confusion: confusion, cambios de memoria",
            "hipertension",
            "hipercolesterolemia",


            )
    }




}

class Zona : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("pie: pie, el pie, los pies",
            "cabeca: la cabeza",
            "espalda",
            "pecho",
            "lumbar"

        )
    }



}