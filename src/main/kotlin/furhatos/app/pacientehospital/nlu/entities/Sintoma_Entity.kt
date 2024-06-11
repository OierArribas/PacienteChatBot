package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Sintoma : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf("herida: herida, heridas",
            "dolor: dolor, dolores, daño",
            "roncar: roncar, ronca, roncas",
            "debilidad: debilidad muscular, debilidad",
            "falta de equilibrio: problema de equilibrio, falta de equilibrio, problemas de equilibrio",
            "fiebre: fiebre, dolor de cabeza, dolores de cabeza",
            "escalofrios",
            "entumecimiento",
            "sudor nocturno: sudor nocturno, sudores nocturnos",
            "cambios sensoriales: cambios sensoriales, cambio sensorial",
            "tos",
            "sibilancia: sibilancia, sibilancias",
            "mareo: mareo, vertigo",
            "vomito: vomito, vomitos, nauseas",
            "diarrea",
            "estreñiniemto",
            "problema urinario: problema urinario, problemas urinarios",
            "torpeza",
            "dolor articular: dolor articular, dolor en las articulaciones",
            "cambio de temperatura: cambio de temperatura, cambios de temperatura",
            "confusion: confusion, cambios de memoria",
            "hipertension",
            "hipercolesterolemia",
            "ulceras",
            "Falta de aliento: falta de aliento, falta de aire",
            "Mareo: mareo, mareos",
            "Astenia",
            "Síncope: sincope, sincopes",
            "Vértigo: vertigo, vertigos",
            "Sudoración",
            "Palpitaciones",
            "Náuseas",
            "Angina de pecho",
            "Presión",
            "Poliuria",
            "Polidipsia",
            "Ortopnea ",
            "Rales",
            "Falta de respuesta",
            "Cambios en el estado mental: cambios de animo, cambio de animo, cambio de humor, cambios de humor",
            "Respiración dificultosa: respiracion dificultosam, dificultad respiratoria, dificultades respiratorias",
            "Sentimiento suicida: sentimiento suicida, sentimientos suicida",
            "Alucinaciones auditivas",
            "Sentimiento de desesperanza: sentimiento desesperanza, desesperanza",
            "Llanto: llanto, llantos",
            "Insomnio",
            "Retardo motor",
            "Mal humor",
            "Desmayo: desmayo, desmayos",
            "Estado de ánimo deprimido: estado de animo deprimido, depresion, deprimido",
            "Alucinaciones visuales",
            "Preocupación",
            "Agitación",
            "Temblor",
            "Intoxicación",
            "Alucinaciones auditivas",
            "Aumento de energía: aumento de energia, aumentos de energia, subidon de energia, subidones de enrgia",
            "Pesadillas",
            "desconcentracion: desconcentracion, incapacidad para concentrarse",
            "Hipokinesia",
            "Disnea al esfuerzo",
            "Opresión",
            "Disminución de la translucidez",
            "Tos productiva",
            "Dolor pleurítico",
            "Esputo amarillo",
            "Sonidos respiratorios disminuidos",
            "Escalofríos",
            "Roncus",
            "Esputo verde",
            "Hemoptisis",
            "Taquipnea",
            "Malestar general",
            "Sudor nocturno",
            "Distensión venosa yugular",
            "Disnea",
            "Disartria",
            "Habla arrastrada",
            "Parálisis facial",
            "paralisis",
            "Hemiplejia",
            "Convulsión",
            "Entumecimiento",
            "Bradicardia",
            "Eritema",
            "Hepatoesplenomegalia",
            "Prurito",
            "Diarrea",
            "Absceso bacteriano",
            "Hinchazón",
            "Afebril",
            "Disuria",
            "Hematuria",
            "Sensibilidad",
            "Sensibilidad en el ángulo renal",
            "Letargia",
            "Hiponatremia",
            "Hemodinámicamente estable",
            "Dificultad para orinar",
            "Conciencia clara",
            "Equimosis",
            "Hemorragia",
            "Palidez",
            "Positivo para hemo en heces",
            "Transaminasas elevadas",
            "Esputo purulento",
            "Hipoxemia",
            "Hipercapnia",
            "No cumplimiento del paciente",
            "Estado inconsciente",
            "Postrado en cama",
            "Ternura abdominal",
            "Marcha inestable",
            "Hipercalemia",
            "Urgencia para orinar",
            "Ascitis",
            "Hipotensión",
            "Enuresis",
            "Asterixis",
            "Espasmo muscular",
            "Somnolencia",
            "Somnolencia",
            "Rigidez",
            "Prostatismo",
            "Fatiga: fatiga, cansancio",
            "Nerviosismo",
            "Sofocos",
            "Cara cushingoide",
            "bajada de peso: bajada de peso, bajadas de peso, disminucion del peso, disminución del peso corporal",
            "Ronquera",
            "Hipotonía muscular: hipotonia muscular, bajada muscular",
            "Enrojecimiento",
            "Hipestesia",
            "Hiperacusia",
            "Dolor al tacto",
            "quemazon: quemazon, sensación de quemazón",
            "Saciedad temprana",
            "Sensación de pulsación",
            "Malestar sensorial",
            "Estreñimiento",
            "Acidez estomacal",
            "acidez",
            "Cianosis",
            "Cardiomegalia",
            "Clonus",
            "Malestar",
            "Sincope: sincope, sincopes",
            "Anosmia",
            "Lesión metastásica",
            "Hemianopsia homónima",
            "Hematocrito disminuido",
            "Rigidez",
            "Mioclonías",
            "Oliguria",
            "Parestesia",
            "Nulípara ",
            "Nodulo pulmonar",
            "Abdomen distendido",
            "Sensación de pesadez",
            "Dolor en reposo",
            "Comportamiento hiperactivo",
            "Fotopsias",
            "alegria",
            "Hipersomnia",
            "Midriasis: midrasis, pupilas dilatadas",
            "Agotamiento",
            "Ronquidos",
            "Esplenomegalia",
            "Sangrado vaginal",
            "Mácula",
            "Fotofobia",
            "Dolor al tragar",
            "Caquexia",
            "Hipotermia",
            "Atipia",
            "Inestabilidad general",
            "Resfriado",
            "Estridor",
            "Parálisis parcial",
            "Afagia",
            "Estupor",
            "Frémito",
            "Sensación de picazón",
            "Parálisis",
            "Hirsutismo",
            "Resoplido nasal",
            "Bradicinesia",
            "Incontinencia urinaria de urgencia: Incontinencia urinaria de urgencia, urgencias orinarias, incontinencia urinaria, incontinencia de urgencia",
            "Visión borrosa",
            "disminucion de heces: disminucion de heces, calibre disminuido de las heces",
            "Hematoquecia",
            "Egofonía",
            "heces amarillas: heces amarillas, heces amarillentas, color amarillo en las heces, color amarillento en las heces, Color de las heces amarillo",
            "Paraparesia",
            "Mal humor",
            "Espasmos: espasmos, espasmo",
            "Hiperventilación",
            "Dolor agudo",
            "Gag",
            "Pulso ausente",
            "Disestes",
            "Polimialgia",
            "Ataxia",
            "Hepatomegalia",
            "Ciática",
            "Esputo espumoso",
            "Masa en el seno",
            "Retropulsión",
            "Hipersomnolencia",
            "Manchas rojas",
            "Cólico abdominal: colico abdominal, colicos abdominales",
            "Hipokalemia",
            "Hambre",
            "Próstata sensible",
            "Desequilibrio",
            "Sofoco: sofoco, sofocos",
            "Urinoma",
            "Hipoalbuminemia",
            "Pústula",
            "dolor subito: dolor subito, dolores subitos",
            "Congestión nasal",
            "Respiración ruidosa",
            "Piernas pesadas",
            "Titubación",
            "Disdiadococinesia",
            "Acalasia",
            "Monocitosis",
            "Cojera",
            "Despertar temprano",
            "Tenesmo",
            "Fecaluria",
            "Neumatouria",
            "Mialgia",
            "Dispareunia",
            "Zumbido en los oídos: zumbido en los oidos, zumbidos en los oidos",
            "Hidroneumotórax",
            "Sensación extraña",
            "Falta de coordinación",
            "Convulsiones",
            "Debilidad",
            "Cognición deteriorada",
            "Babeo",
            "Temblor en reposo: temblor en reposo",
            "somnoliencia",
            "Distensión abdominal",
            "Proteinemia",
            "Hiperémesis",
            "Fonofobia",
            "Ambidestreza",
            "Ictericia escleral",
            "Arcada",
            "Palidez",
            "Euforia",
            "Ahogo: ahogo, ahogamiento",
            "Disminución de los sonidos intestinales",
            "Calambres: calambres, calambre",
            "Pánico",
            "Hinchazón de los tejidos blandos",
            "Dilatación nasal",
            "Estornudos: estornudos, estornudos, estornudo",
            "Hipertonicidad",
            "Flatulencias: flatulencias, flatulencia, flatulencias",
            "Jadeo",


            )
    }




}

class Zona : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "cabeza",
            "cráneo",
            "cara: cara, rostro",
            "ojos: ojos, ojo",
            "nariz",
            "boca",
            "dientes: dientes, diente",
            "lengua",
            "paladar",
            "orejas: orejas oreja",
            "mandíbula",
            "cuero cabelludo",
            "cuello",
            "garganta",
            "laringe",
            "tráquea",
            "glándulas tiroides",
            "tronco",
            "hombros: hombros, hombro",
            "clavícula",
            "pecho",
            "esternón",
            "costillas",
            "columna vertebral: columna vertebral, columna",
            "omóplatos",
            "abdomen",
            "ombligo",
            "pelvis",
            "cadera",
            "lumbar",
            "trapecios: trapecio, trapecios",
            "glúteos",
            "brazo: brazo, brazos, extremidades superiores",
            "triceps",
            "biceps",
            "húmero",
            "codo",
            "antebrazo",
            "radio",
            "cúbito",
            "muñeca",
            "mano: mano, manos",
            "palma",
            "dedos: dedos, dedo",
            "pulgar: pulgar, dedo pulgar",
            "índice: indice, dedo indice",
            "medio: medio, dedo medio",
            "anular: anular, dedo anular",
            "meñique: meñique, dedo meñique",
            "uñas: uñas, uña",
            "piernas: piernas, pierna, extremidades inferiores",
            "muslo",
            "cuadriceps",
            "fempral",
            "gemelo",
            "fémur",
            "rodilla",
            "rótula",
            "pierna",
            "genitales",
            "tibia",
            "peroné",
            "tobillo",
            "pie: pie, pies",
            "planta del pie",
            "talón",
            "dedos del pie, dedos del pie, dedo del pie",
            "uñas del pie, uñas del pie, uña del pie",
            "órganos internos",
            "cerebro",
            "corazón",
            "pulmones: pulmones, pulmon",
            "hígado",
            "riñones",
            "estómago",
            "intestino delgado",
            "intestino grueso",
            "páncreas",
            "vesícula biliar",
            "bazo",
            "vejiga",
            "útero",
            "ovarios",
            "próstata",
            "testículos",
            "sistema nervioso",
            "sistema circulatorio",
            "sistema respiratorio",
            "sistema digestivo",
            "sistema endocrino",
            "sistema inmunológico",
            "sistema linfático",
            "sistema muscular",
            "sistema esquelético",
            "sistema reproductor",

        )
    }



}
