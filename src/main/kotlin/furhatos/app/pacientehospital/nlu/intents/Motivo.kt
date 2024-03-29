package furhatos.app.newskill.nlu.intents

import furhatos.app.newskill.nlu.entities.Fruit
import furhatos.nlu.Intent
import furhatos.util.Language

class Motivo_De_Consulta: Intent()

class BuyFruit(val Fruit : Fruit? = null) : Intent() {

    //override fun getExamples(lang: Language): List<String> {
      //  return listOf( "te gusta la @Fruit", "quieres una @Fruit")
    //}
}