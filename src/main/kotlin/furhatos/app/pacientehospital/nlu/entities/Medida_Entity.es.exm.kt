package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Medida : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "temperatura",
            "colesterol",
            "Temperatura corporal",
            "Presión arterial",
            "Niveles de colesterol ",
            "Niveles de glucosa en sangre ",
            "Índice de masa corporal",
            "Frecuencia cardíaca",
            "Niveles de hemoglobina",
            "Niveles de hemoglobina glucosilada",
            "Niveles de hormonas",
            "Función pulmonar",
            "Niveles de vitaminas y minerales",
            "Función renal",
            "Densidad ósea",
            "Función hepática ",
            "Niveles de electrolitos",
            "Niveles de oxígeno en sangre ",
            "Pruebas de función tiroidea ",
            "Pruebas de función cardíaca ",
            "Pruebas de función cerebral ",
            "Pruebas de función muscular"
        )
    }
}