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
            "ulceras",
            "Dolor en el pecho",
            "Falta de aliento",
            "Mareo",
            "Astenia",
            "Síncope (pérdida repentina de conciencia)",
            "Vértigo",
            "Sudoración",
            "Palpitaciones",
            "Náuseas",
            "Angina de pecho",
            "Presión en el pecho",
            "Poliuria (micción excesiva)",
            "Polidipsia (sed excesiva)",
            "Ortopnea (dificultad para respirar mientras se está acostado)",
            "Rales (ruidos anormales en los pulmones)",
            "Falta de respuesta",
            "Cambios en el estado mental",
            "Vómitos",
            "Respiración dificultosa",
            "Sentimiento suicida",
            "Suicida",
            "Alucinaciones auditivas",
            "Sentimiento de desesperanza",
            "Llanto",
            "Insomnio",
            "Retardo motor",
            "Mal humor",
            "Desmayo",
            "Estado de ánimo deprimido",
            "Alucinaciones visuales",
            "Preocupación",
            "Agitación",
            "Temblor",
            "Intoxicación",
            "Alucinaciones verbales auditivas",
            "Aumento de energía",
            "Dificultad",
            "Pesadillas",
            "Incapacidad para concentrarse",
            "Sin hogar",
            "Hipokinesia (movimientos corporales lentos)",
            "Disnea al esfuerzo",
            "Opresión en el pecho",
            "Tos",
            "Fiebre",
            "Disminución de la translucidez",
            "Tos productiva",
            "Dolor pleurítico",
            "Esputo amarillo",
            "Sonidos respiratorios disminuidos",
            "Escalofríos",
            "Roncus",
            "Esputo verde",
            "Tos no productiva",
            "Sibilancias",
            "Hemoptisis",
            "Dificultad respiratoria",
            "Taquipnea",
            "Malestar general",
            "Sudor nocturno",
            "Distensión venosa yugular",
            "Disnea",
            "Disartria",
            "Habla arrastrada",
            "Parálisis facial",
            "Hemiplejia",
            "Convulsión",
            "Entumecimiento",
            "Factores que agravan los síntomas",
            "Elevación del segmento ST",
            "Depresión del segmento ST",
            "Inversión de la onda T",
            "Presencia de onda Q",
            "Malestar en el pecho",
            "Bradicardia",
            "No fumador",
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
            "Monoclonal",
            "Equimosis",
            "Invasión de células tumorales",
            "Hemorragia",
            "Palidez",
            "Positivo para hemo en heces",
            "Dolor de espalda",
            "Ortostatismo",
            "Artralgia",
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
            "Dolor de cabeza",
            "Mareos",
            "Intolerancia alimentaria",
            "Entumecimiento de la mano",
            "Malestar general",
            "Somnolencia",
            "Rigidez",
            "Prostatismo",
            "Ganancia de peso",
            "Fatiga",
            "Masa en una estructura corporal",
            "Tiene creencias religiosas",
            "Nerviosismo",
            "Formicación (sensación de hormigueo)",
            "Sofocos",
            "Lesión",
            "Cara cushingoide",
            "Cambios enfisematosos",
            "Disminución del peso corporal",
            "Ronquera",
            "Engrosamiento",
            "Ruptura espontánea de membranas",
            "Hipotonía muscular",
            "Enrojecimiento",
            "Hipestesia",
            "Hiperacusia",
            "Marcas de arañazos",
            "Dolor al tacto",
            "Sensación de quemazón",
            "Saciedad temprana",
            "Sensación de pulsación",
            "Malestar sensorial",
            "Estreñimiento",
            "Dolor abdominal",
            "Acidez estomacal",
            "Presentación de nalgas",
            "Cianosis",
            "Dolor en el miembro inferior",
            "Cardiomegalia",
            "Clonus (contracciones musculares involuntarias)",
            "Malestar",
            "Anorexia",
            "Sincope",
            "Anosmia",
            "Lesión metastásica",
            "Hemianopsia homónima (pérdida de la mitad del campo visual en ambos ojos)",
            "Hematocrito disminuido",
            "Rigidez del cuello",
            "Cicatrización",
            "Hipometabolismo",
            "Aura",
            "Mioclonías (contracciones musculares repentinas e involuntarias)",
            "Gorgoteo",
            "Confinado a una silla de ruedas",
            "Hipertrofia de la aurícula izquierda",
            "Oliguria",
            "Catatonía",
            "Infeliz",
            "Parestesia",
            "Nulípara ",
            "Nodulo pulmonar",
            "Abdomen distendido",
            "Dolor",
            "Piel macerada",
            "Sensación de pesadez",
            "Enfermedad vascular periférica",
            "Dolor en reposo",
            "Ritmo sinusal",
            "Retirada",
            "Comportamiento hiperactivo",
            "Aterrorizado",
            "Fotopsias",
            "Estado de ánimo alegre",
            "Familia alterada",
            "Hipersomnia",
            "Trastorno de hiperhidrosis",
            "Midriasis (pupilas dilatadas)",
            "Signo extrapiramidal",
            "Asociaciones laxas",
            "Agotamiento",
            "Ronquidos",
            "Característica de la onda R",
            "Sobrepeso",
            "Soplo sistólico",
            "Asintomático",
            "Esplenomegalia",
            "Sangrado vaginal",
            "Mácula",
            "Fotofobia",
            "Dolor al tragar",
            "Caquexia",
            "Resultado de hipocalcemia",
            "Hipotermia natural",
            "Atipia",
            "Inestabilidad general",
            "Dolor de garganta",
            "Resfriado",
            "Tos perruna",
            "Estridor",
            "Parálisis parcial",
            "Afagia (dificultad para tragar)",
            "Convulsiones focales",
            "Sensación anormal",
            "Estupor",
            "Frémito (vibración palpable producida por la resonancia de la voz)",
            "Línea de Stahli (línea horizontal de pigmentación en la piel)",
            "Sensación de picazón",
            "Parálisis",
            "Hirsutismo (crecimiento excesivo de vello en mujeres)",
            "Resoplido nasal",
            "Bradicinesia (movimientos lentos)",
            "Sin aliento",
            "Incontinencia urinaria de urgencia",
            "Visión borrosa",
            "Sensación de giro de la habitación",
            "Habla confusa",
            "Torpeza",
            "Calibre disminuido de las heces",
            "Hematoquecia (sangre en las heces)",
            "Egofonía (aumento de la resonancia de la voz)",
            "Neologismo (palabra nueva inventada por el paciente)",
            "Descompensación",
            "Color de las heces amarillo",
            "Rigor asociado a la temperatura",
            "Paraparesia (debilidad en ambas piernas)",
            "Malhumorado",
            "Miedo a caer",
            "Espasmo",
            "Hiperventilación",
            "Dolor agudo",
            "Gag",
            "Postura",
            "Pulso ausente",
            "Disestes",
            "Polimialgia",
            "Cálculos pasados",
            "Intervalo QT prolongado",
            "Ataxia",
            "Nodo de Heberden",
            "Hepatomegalia",
            "Ciática",
            "Esputo espumoso",
            "Masa en el seno",
            "Retropulsión",
            "Uso de estrógenos",
            "Hipersomnolencia",
            "Bajo peso",
            "Opacidad",
            "Manchas rojas",
            "Cólico abdominal",
            "Hipokalemia",
            "Hambre",
            "Próstata sensible",
            "Dolor en el pie",
            "Hesitación urinaria",
            "Desequilibrio",
            "Sofoco",
            "Estado de ánimo indiferente",
            "Urinoma",
            "Hipoalbuminemia",
            "Pústula",
            "Ralentización del flujo urinario",
            "Agotamiento extremo",
            "Sin cambio de estado",
            "Dolor de aparición súbita",
            "Soplo pansistólico",
            "Soplo de eyección sistólica",
            "Congestión nasal",
            "Tos perruna",
            "Respiración rápida y superficial",
            "Respiración ruidosa",
            "Secreción nasal presente",
            "Frágil",
            "Lesión quística",
            "Vómitos en proyectil",
            "Piernas pesadas",
            "Titubación",
            "Disdiadococinesia",
            "Acalasia",
            "Dolor en el costado",
            "Monocitosis",
            "Rinorrea posterior",
            "Incoherente",
            "Cojera",
            "Piel húmeda y pegajosa",
            "Desplazamiento mediastinal",
            "Náuseas y vómitos",
            "Despertar temprano",
            "Tenesmo",
            "Fecaluria",
            "Neumatouria",
            "Parálisis de Todd",
            "Síntomas de abstinencia alcohólica",
            "Mialgia",
            "Dispareunia",
            "Mala dentadura",
            "Flojo",
            "Afecto inapropiado",
            "Alimentación deficiente",
            "Gruñido",
            "Roncha",
            "Zumbido en los oídos",
            "Hidroneumotórax",
            "Superposición",
            "Sensación extraña",
            "Falta de coordinación",
            "Ausencias",
            "Convulsiones tónicas",
            "Debilitación",
            "Cognición deteriorada",
            "Babeo",
            "Pupilas puntiformes",
            "Temblor en reposo",
            "Somnoliento",
            "Reacción adversa",
            "Distensión abdominal",
            "Fatigabilidad",
            "Para 2 (dos partos)",
            "Aborto",
            "Sangrado menstrual intermenstrual abundante",
            "Embarazos previos 2",
            "Primigesta (primer embarazo)",
            "Consistencia anormalmente dura",
            "Proteinemia",
            "Dolor de cuello",
            "Mareos",
            "Dolor punzante",
            "Hiperémesis",
            "Lechoso",
            "Regurgita después de tragar",
            "Chasquear los labios",
            "Fonofobia",
            "Rodar los ojos",
            "Ambidestreza",
            "Pulso paradójico",
            "Gravida 10 (diez embarazos)",
            "Soplo",
            "Hechizo de retención de la respiración",
            "Ictericia escleral",
            "Arcada",
            "Palidez",
            "Euforia",
            "Comportamiento verbalmente abusivo",
            "Transexual",
            "Comportamiento con aumento de la actividad motora",
            "Tejido cicatricial",
            "Coordinación anormal",
            "Ahogo",
            "Disminución de los sonidos intestinales",
            "Sin alergias conocidas a medicamentos",
            "Dolor lumbar",
            "Calambre",
            "Sedentario",
            "Se siente caliente/con fiebre",
            "Agravamiento",
            "Roce pericárdico",
            "Acumulación",
            "Pánico",
            "Hallazgo cardiovascular",
            "Hinchazón de los tejidos blandos",
            "RHD positivo (Factor Rh positivo)",
            "Para 1 (un parto)",
            "Dilatación nasal",
            "Estornudo",
            "Hipertonicidad",
            "Signo de Murphy",
            "Flatulencia",
            "Jadeo",
            "Heces en el recto",
            "Prodromo",
            "Hipoproteinemia",
            "Episodio de consumo excesivo de alcohol",
            "Abdomen agudo",
            "Nivel de aire/fluido",
            "Respiración entrecortada",


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