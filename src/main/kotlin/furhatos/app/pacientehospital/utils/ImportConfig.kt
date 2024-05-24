import org.example.utils.CustomMutableList
import java.io.File

fun importResponseMap(): MutableMap<List<String>, String> {

    val filepath = "src/main/ResponseConfig/"

    val mapa = mutableMapOf<List<String>, String>()

    val key = mutableListOf<String>("","")

    File(filepath).forEachLine { linea ->

        if (linea.isNotBlank()){

            // println(linea)

            val divisor = CustomMutableList<String>()
            divisor.addAll(linea.split(":"))

            when (divisor[0]) {
                "Intent" -> key[0] = divisor[1]
                "Entities" -> {
                    for (i in 1..key.size-1){
                        //println(i)
                        key[i] = divisor[i]
                    }
                }
                else -> {
                    mapa[key.toList()]=divisor[0]

                }
            }

        }

    }


    return mapa
}

fun imprimirMapa(mapa: MutableMap<List<String>, String>) {
    for ((clave, valor) in mapa) {
        println("Clave: ${clave.joinToString()} - Valor: $valor")


    }
}

