package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Enfermedad : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "enfermedad cardiaca: enfermedad cardiaca, enfermedades cardacas, enfermedad del corazon, enfermedades del corazon, enfermedad cardiovascular",
            "enfermedad cronica",
            "cancer de piel",
            "leucodema oral",
            "salmonela",
            "fractura",
            "obstrucción del conducto pancreático",
            "tumor de la médula espinal",
            "alzheimer",
            "hipofosfatasia",
            "melanocitoma",
            "neuralgia",
            "poliposis",
            "miopatía",
            "alergia",
            "alergia alimentaria",
            "Abrasión corneal",
            "Accidentes de tráfico",
            "Accidentes eléctricos",
            "Accidentes en el agua",
            "Accidentes químicos",
            "Acné",
            "Aftas bucales",
            "Albinismo",
            "Alcoholismo",
            "Alergia",
            "Alergia al níquel",
            "Alergia al sol", "Alud",
            "Alzhéimer",
            "Amenorrea",
            "Ampollas",
            "Anemia",
            "Aneurisma",
            "Angina de pecho",
            "Anisakiasis",
            "Anorexia",
            "Ansiedad",
            "Apendicitis",
            "Apnea del sueño",
            "Arritmia",
            "Arteriosclerosis",
            "Artritis reumatoide",
            "Artrosis",
            "Ascitis",
            "Asma",
            "Astigmatismo",
            "Ataxia",
            "Atragantamiento",
            "Atrofia vaginal",
            "Autismo",
            "Balanitis",
            "Bartolinitis",
            "Bocio",
            "Botulismo",
            "Bronquiectasias",
            "Bronquiolitis obliterante",
            "Bronquitis",
            "Brucelosis",
            "Bruxismo",
            "Bulimia",
            "Campylobacter",
            "Cáncer",
            "Cáncer de cabeza y cuello",
            "Cáncer de colon",
            "Cáncer de cuello de útero",
            "Cáncer de esófago",
            "Cáncer de estómago",
            "Cáncer de hígado",
            "Cáncer de laringe",
            "Cáncer de mama",
            "Cáncer de ovario",
            "Cáncer de páncreas",
            "Cáncer de pene",
            "Cáncer de piel",
            "Cáncer de próstata",
            "Cáncer de pulmón",
            "Cáncer de riñón",
            "Cáncer de testículo",
            "Cáncer de tiroides",
            "Cáncer de vejiga",
            "Cáncer oral",
            "Cáncer óseo",
            "Candidiasis",
            "Carbunco",
            "Cataratas",
            "Catarro",
            "Celiaquía",
            "Chancroide",
            "Chikungunya",
            "Ciática",
            "Cirrosis",
            "Cistitis",
            "Citomegalovirus",
            "Clamidia",
            "Cólera",
            "Colesteatoma",
            "Cólico nefrítico",
            "Colitis ulcerosa",
            "Colon irritable",
            "Congelamiento",
            "Congestión nasal",
            "Conjuntivitis",
            "Contusiones",
            "Corte de digestión",
            "Crisis de pánico",
            "Cuerpos extraños",
            "Daltonismo",
            "Déficit de la hormona del crecimiento",
            "Degeneración macular",
            "Demencia",
            "Demencia con cuerpos de Lewy",
            "Demencia vascular",
            "Dengue",
            "Depresión",
            "Dermatitis atópica",
            "Derrame ocular",
            "Deterioro cognitivo leve",
            "Diabetes",
            "Diabetes gestacional",
            "Diabetes insípida",
            "Difteria",
            "Diplopía",
            "Disfunción eréctil",
            "Dislexia",
            "Dismenorrea",
            "Dispepsia",
            "Distonía",
            "Distrofia muscular de Duchenne",
            "Diverticulosis",
            "Ébola",
            "Edema pulmonar",
            "Elefantiasis",
            "Encefalitis",
            "Endocarditis",
            "Endometriosis",
            "Enfermedad de Addison",
            "Enfermedad de Behçet",
            "Enfermedad de Chagas",
            "Enfermedad de Crohn",
            "Enfermedad de Huntington",
            "Enfermedad de Kawasaki",
            "Enfermedad de La Peyronie",
            "Enfermedad de Lyme",
            "Enfermedad de Paget",
            "Enfermedad de Wilson",
            "Enfermedad inflamatoria pélvica",
            "Enfermedades de Transmisión Sexual",
            "Enfermedades raras",
            "Epilepsia",
            "EPOC",
            "Escleritis",
            "Esclerodermia",
            "Esclerosis lateral amiotrófica",
            "Esclerosis múltiple",
            "Escoliosis",
            "Esófago de Barrett",
            "Espondilitis anquilosante",
            "Esquizofrenia",
            "Esteatosis hepática",
            "Estrabismo",
            "Estreñimiento",
            "Eyaculación precoz",
            "Faringitis",
            "Fascitis plantar",
            "Fenilcetonuria",
            "Fenómeno de Raynaud",
            "Fibrilación auricular",
            "Fibromialgia",
            "Fibrosis quística",
            "Fiebre amarilla",
            "Fiebre de Lassa",
            "Fiebre de Oropouche",
            "Fiebre del valle del Rift",
            "Fiebre hemorrágica de Crimea-Congo",
            "Fiebre tifoidea",
            "Fístula anal",
            "Fractura de dedo",
            "Fractura nasal",
            "Galactorrea",
            "Galactosemia",
            "Gastritis",
            "Gastroenteritis",
            "Giardiasis",
            "Glaucoma",
            "Golpe de calor",
            "Gonorrea",
            "Gota",
            "Gripe",
            "Hantavirus",
            "Hemocromatosis",
            "Hemofilia",
            "Hemorragia nasal",
            "Hemorroides",
            "Hepatitis",
            "Herida por arma de fuego",
            "Heridas",
            "Hernia de hiato",
            "Hernia discal",
            "Hernia inguinal",
            "Herpes",
            "Herpes zóster",
            "Hidatidosis",
            "Hiperactividad",
            "Hipercolesterolemia",
            "Hipermetropía",
            "Hiperplasia benigna de próstata",
            "Hipertensión arterial",
            "Hipertiroidismo",
            "Hipoacusia",
            "Hipocalcemia",
            "Hipoglucemia",
            "Hipogonadismo",
            "Hipotensión arterial",
            "Hipotermia",
            "Hipotiroidismo",
            "Hirsutismo",
            "Ictus",
            "Impétigo",
            "Incendios",
            "Incontinencia urinaria",
            "Infarto de miocardio",
            "Infecciones urinarias",
            "Insomnio",
            "Insomnio familiar fatal",
            "Insuficiencia cardiaca",
            "Insuficiencia hepática",
            "Insuficiencia mitral",
            "Insuficiencia renal crónica",
            "Intolerancia a la histamina",
            "Intoxicación etílica",
            "Intoxicación por monóxido de carbono",
            "Intoxicaciones",
            "Juanetes",
            "Ladillas",
            "Laringitis",
            "Legionella",
            "Leishmaniasis",
            "Lepra",
            "Leptospirosis",
            "Lesiones maxilares",
            "Leucemia",
            "Lipodistrofia",
            "Lipotimia",
            "Listeriosis",
            "Litiasis biliar",
            "Lumbalgia",
            "Lupus",
            "Luxaciones",
            "Mal agudo de montaña",
            "Malaria",
            "Melanoma",
            "Melasma",
            "Melioidosis",
            "Meningitis",
            "Menopausia",
            "MERS",
            "Mesotelioma",
            "Miastenia gravis",
            "Micoplasma genital",
            "Microcefalia",
            "Mieloma múltiple",
            "Migraña",
            "Miomatosis uterina",
            "Miopía",
            "Molusco contagioso",
            "Mononucleosis",
            "Mordeduras de animales",
            "Narcolepsia",
            "Neumonía",
            "Neumotórax",
            "Neuralgia del trigémino",
            "Neurofibromatosis",
            "Nistagmo",
            "Norovirus",
            "Obesidad",
            "Obesidad infantil",
            "Ojo seco",
            "Oncocercosis",
            "Onicomicosis",
            "Orquitis",
            "Osteomalacia",
            "Osteomielitis",
            "Osteonecrosis",
            "Osteoporosis",
            "Otitis",
            "Palpitaciones cardíacas",
            "Pancreatitis",
            "Paperas",
            "Parálisis cerebral",
            "Párkinson",
            "Patologías benignas de mama",
            "Pericarditis",
            "Peritonitis",
            "Peste",
            "Pian",
            "Picaduras de insectos",
            "Pie de atleta",
            "Pielonefritis",
            "Pitiriasis versicolor",
            "Policitemia vera",
            "Poliomielitis",
            "Pólipos uterinos",
            "Prediabetes",
            "Presbiacusia",
            "Presbicia",
            "Priapismo",
            "Prostatitis",
            "Psoriasis",
            "PTI (trombocitopenia inmune primaria)",
            "Quemaduras",
            "Rabia",
            "Raspaduras y laceraciones",
            "Reacciones alérgicas a medicamentos",
            "Reanimación cardiopulmonar",
            "Reflujo gastroesofágico",
            "Rescate en montaña",
            "Resistencia a la insulina",
            "Retinosis pigmentaria",
            "Rinitis",
            "Rizartrosis",
            "Rosácea",
            "Rubéola",
            "Salmonelosis",
            "Sarampión",
            "Sarcoidosis",
            "Sarcoma de tejidos blandos",
            "Sarna",
            "Sensibilidad química múltiple",
            "Sepsis",
            "Shigelosis",
            "Shock",
            "SIBO",
            "SIDA",
            "Sífilis",
            "Silicosis",
            "Síndrome de Angelman",
            "Síndrome de Cushing",
            "Síndrome de Down",
            "Síndrome de Ehlers-Danlos",
            "Rabia",
            "Raspaduras y laceraciones",
            "Reacciones alérgicas a medicamentos",
            "Reanimación cardiopulmonar",
            "Reflujo gastroesofágico",
            "Rescate en montaña",
            "Resistencia a la insulina",
            "Retinosis pigmentaria",
            "Rinitis",
            "Rizartrosis",
            "Rosácea",
            "Rubéola",
            "Salmonelosis",
            "Sarampión",
            "Sarcoidosis",
            "Sarcoma de tejidos blandos",
            "Sarna",
            "Sensibilidad química múltiple",
            "Sepsis",
            "Shigelosis",
            "Shock",
            "SIBO",
            "SIDA",
            "Sífilis",
            "Silicosis",
            "Síndrome de Angelman",
            "Síndrome de Cushing",
            "Síndrome de Down",
            "Síndrome de Ehlers-Danlos",
            "Síndrome de fatiga crónica",
            "Síndrome de Guillain-Barré",
            "Síndrome de Klinefelter",
            "Síndrome de Lynch",
            "Síndrome de Marfan",
            "Síndrome de Menkes",
            "Síndrome de Noonan",
            "Síndrome de Ovario Poliquístico (SOP)",
            "Síndrome de Patau",
            "Síndrome de piernas inquietas",
            "Síndrome de Rett",
            "Síndrome de Reye",
            "Síndrome de Sanfilippo",
            "Síndrome de Sjögren",
            "Síndrome de Tourette",
            "Síndrome de Turner",
            "Síndrome de Usher",
            "Síndrome de Williams",
            "Síndrome de X Frágil",
            "Síndrome del túnel carpiano",
            "Síndrome metabólico",
            "Sinusitis",
            "Siringomielia",
            "Sobredosis",
            "Talasemia",
            "Telangiectasias",
            "Tendinitis",
            "Teniasis",
            "Terremotos",
            "Tétanos",
            "Tinnitus",
            "Tortícolis",
            "Tos ferina",
            "Toxicodermias",
            "Toxoplasmosis",
            "Tracoma",
            "Traqueítis",
            "Trastorno bipolar",
            "Trastorno obsesivo compulsivo",
            "Traumatismo craneal",
            "Tricomoniasis",
            "Tripanosomiasis africana",
            "Tromboembolismo pulmonar",
            "Trombosis venosa",
            "Tuberculosis",
            "Tularemia",
            "Tumores cerebrales",
            "Úlcera",
            "Uretritis",
            "Urticaria",
            "Uveítis",
            "Vaginitis",
            "Vaginosis bacteriana",
            "Varicela",
            "Varices",
            "Varicocele",
            "Vértigo",
            "Viruela del mono",
            "Virus del Nilo Occidental",
            "Virus Mayaro",
            "Virus Nipah",
            "Virus Usutu",
            "Virus Zika",
            "Vitíligo",
            "VPH",




        )
    }
}
