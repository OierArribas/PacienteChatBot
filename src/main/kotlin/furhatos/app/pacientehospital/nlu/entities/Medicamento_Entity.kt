package furhatos.app.pacientehospital.nlu.entities

import furhatos.nlu.EnumEntity
import furhatos.util.Language

class Medicamento : EnumEntity() {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "antidoto: antidoto, antidotos",
            "analgesico: analgesico, analgesicos",
            "analgesico opioide: analgesico opioide, analgesicos opioides",
            "analgesico antipireptico: analgesico antipireptico, analgesicos antipirepticos",
            "antiepileptico: antiepileptico, antipilepticos",
            "antiparkinsoniano: antiparkinsoniano, antiparkinsonianos",
            "ansiolitico: ansiolitico, ansioliticos",
            "antidepresivo: antidepresivo, antidepresivos",
            "sedante: sedante, sedantes, hipnotico, hipnoticos",
            "anestesico: anestesico, anestesicos",
            "anestesico local: anestesico local, anestesicos locales",
            "antiacido: antiacido, antiacidos",
            "antiulcero: antiulcero, antiulceros, protector gastrico, protectores gastricos",
            "diuretico: diuretico, diureticos",
            "mucloticos: mucloticos, mucloticos",
            "antitusivo: antitusivo, antitusivos",
            "antidiabetico: antiabetico, antiabeticos",
            "antianemico: antianemico, antianemicos",
            "antibiotico: antibiotico, antibioticos",
            "antidiarreico: antiarreico, antiarreicos",
            "laxante: laxante, laxantes",
            "antiemetico: antiemetico, antiemeticos",
            "antifungico: antifungico, antifungicos",
            "antigotoso: antigotoso, antigotosos",
            "antihemorragico: antihemorragico, antihemorragicos",
            "antihistaminico: antihistaminico, antihistaminicos",
            "antiseptico: antiseptico, antisepticos",
            "desinfectante: desinfectante, desinfectantes",
            "antiinflamatorio: antiinflamatorio, antiinflamatorios",
            "antireumatico: antireumatico, antireumaticos",
            "tratamiento para la tuberculosis: tratamiento para la tuberculosis, tratamientoa para la tuberculosis",
            "antiaginoso: antiaginoso, antiaginosos",
            "antitrombotico: antitrombotico, antitromboticos",
            "trombolitico: trombolitico, tromboliticos",
            "antiagregante: antiagregante, antiagregantes",
            "antiviral: antiviral, antivirales",
            "antieespasmodico: antieespasmodico, antieespasmodicos",
            "corticoide: corticoide, corticoides",
            "hipolipemiante: hipolipemiante, hipolipemiantes",
            "relajante: relajante, relajantes",
            "relajante muscular: relajante muscular, relajantes musculares",
            "terapia tiroidea: terapia tiroidea, terapias tiroideas",
            "antiasmatico: antiasmatico, antiasmaticos",
            "broncodilatador: broncodilatador, broncodilatadores",
            "inductor de parto: inductor de parto, inductores de parto",
            "inhibidor de parto: inhibidor de parto, inhibidores de parto",
            "anticonceptivo: anticonceptivo, anticonceptivos",
            "factor vitaminico: factor vitaminico, factor vitaminicos",
            "cariotonico: cardiotonico, cardiotonicos",
            "antiarrimicos: antiarrimicos, antiarrimicos",
            "inmunosupresor: inmunosupresor, inmunosupresores",

        )
    }
}
