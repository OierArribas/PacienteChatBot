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

            // MEDICAMENTOS
            "antidoto", "antidotos" -> "antidoto"
            "analgesico", "analgesicos" -> "analgesico"
            "analgesico opioide", "analgesicos opioides" -> "analgesico opioide"
            "analgesico antipireptico", "analgesicos antipirepticos" -> "analgesico antipireptico"
            "antiepileptico", "antiepilepticos" -> "antiepileptico"
            "antiparkinsoniano", "antiparkinsonianos" -> "antiparkinsoniano"
            "ansiolitico", "ansioliticos" -> "ansiolitico"
            "antidepresivo", "antidepresivos" -> "antidepresivo"
            "sedante", "sedantes", "hipnotico", "hipnoticos" -> "sedante"
            "anestesico", "anestesicos" -> "anestesico"
            "anestesico local", "anestesicos locales" -> "anestesico local"
            "antiacido", "antiacidos" -> "antiacido"
            "antiulcero", "antiulceros", "protector gastrico", "protectores gastricos" -> "antiulcero"
            "diuretico", "diureticos" -> "diuretico"
            "mucloticos" -> "mucloticos"
            "antitusivo", "antitusivos" -> "antitusivo"
            "antidiabetico", "antiabetico", "antiabeticos" -> "antidiabetico"
            "antianemico", "antianemicos" -> "antianemico"
            "antibiotico", "antibioticos" -> "antibiotico"
            "antidiarreico", "antiarreico", "antiarreicos" -> "antidiarreico"
            "laxante", "laxantes" -> "laxante"
            "antiemetico", "antiemeticos" -> "antiemetico"
            "antifungico", "antifungicos" -> "antifungico"
            "antigotoso", "antigotosos" -> "antigotoso"
            "antihemorragico", "antihemorragicos" -> "antihemorragico"
            "antihistaminico", "antihistaminicos" -> "antihistaminico"
            "antiseptico", "antisepticos" -> "antiseptico"
            "desinfectante", "desinfectantes" -> "desinfectante"
            "antiinflamatorio", "antiinflamatorios" -> "antiinflamatorio"
            "antireumatico", "antireumaticos" -> "antireumatico"
            "tratamiento para la tuberculosis", "tratamientoa para la tuberculosis" -> "tratamiento para la tuberculosis"
            "antiaginoso", "antiaginosos" -> "antiaginoso"
            "antitrombotico", "antitromboticos" -> "antitrombotico"
            "trombolitico", "tromboliticos" -> "trombolitico"
            "antiagregante", "antiagregantes" -> "antiagregante"
            "antiviral", "antivirales" -> "antiviral"
            "antieespasmodico", "antieespasmodicos" -> "antieespasmodico"
            "corticoide", "corticoides" -> "corticoide"
            "hipolipemiante", "hipolipemiantes" -> "hipolipemiante"
            "relajante", "relajantes" -> "relajante"
            "relajante muscular", "relajantes musculares" -> "relajante muscular"
            "terapia tiroidea", "terapias tiroideas" -> "terapia tiroidea"
            "antiasmatico", "antiasmaticos" -> "antiasmatico"
            "broncodilatador", "broncodilatadores" -> "broncodilatador"
            "inductor de parto", "inductores de parto" -> "inductor de parto"
            "inhibidor de parto", "inhibidores de parto" -> "inhibidor de parto"
            "anticonceptivo", "anticonceptivos" -> "anticonceptivo"
            "factor vitaminico", "factor vitaminicos" -> "factor vitaminico"
            "cariotonico", "cardiotonicos" -> "cariotonico"
            "antiarrimicos" -> "antiarrimicos"
            "inmunosupresor", "inmunosupresores" -> "inmunosupresor"


            // SUCESOS
            "caida", "golpe", "caido", "golpeado" -> "golpe"



            else -> entrada
        }
    }
}

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