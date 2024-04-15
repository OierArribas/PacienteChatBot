package furhatos.app.pacientehospital.utils

class EntityHelper {

    fun obtenerTermino(entrada: String): String {
        return when (entrada) {

            // SINTOMAS
            "herida", "heridas" -> "herida"
            "dolor", "dolores", "daño" -> "dolor"
            "debilidad muscular" -> "debilidad"
            "falta de equilibrio", "problema de equilibrio", "problemas de equilibrio" -> "falta de equilibrio"
            "fiebre", "dolor de cabeza", "dolores de cabeza" -> "fiebre"
            "escalofríos" -> "escalofríos"
            "entumecimiento" -> "entumecimiento"
            "sudor nocturno", "sudores nocturnos" -> "sudor nocturno"
            "cambios sensoriales", "cambio sensorial" -> "cambios sensoriales"
            "dolor de garganta" -> "dolor de garganta"
            "tos" -> "tos"
            "sibilancia", "sibilancias" -> "sibilancia"
            "mareo", "vertigo" -> "mareo"
            "vomito", "vomitos", "nauseas" -> "vomito"
            "diarrea" -> "diarrea"
            "estreñiniemto" -> "estreñiniemto"
            "problema urinario", "problemas urinarios" -> "problema urinario"
            "torpeza" -> "torpeza"
            "dolor articular", "dolor en las articulaciones" -> "dolor articular"
            "cambio de temperatura", "cambios de temperatura" -> "cambio de temperatura"
            "confusion", "cambios de memoria" -> "confusion"
            "hipertension" -> "hipertension"
            "hipercolesterolemia" -> "hipercolesterolemia"

            // ZONAS
            "el pie", "los pies" -> "pie"
            "la cabeza" -> "cabeza"

            // SUCESOS
            "caida", "golpe", "caido", "golpeado" -> "golpe"


            else -> entrada
        }
    }
}