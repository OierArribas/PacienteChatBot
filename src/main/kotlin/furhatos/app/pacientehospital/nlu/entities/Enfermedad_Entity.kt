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
            "Alzheimer",
            "hipofosfatasia",
            "melanocitoma",
            "neuralgia",
            "poliposis",
            "miopatía",
            "alergia",
            "alergia alimentaria"


        )
    }
}