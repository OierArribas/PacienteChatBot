package furhatos.app.pacientehospital

import furhatos.app.pacientehospital.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class PacientehospitalSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
