package furhatos.app.pacientehospital.utils

import org.example.utils.CustomMutableList
import java.io.File
import kotlin.random.Random

fun findFileByName(dir: File, fileName: String): File? {
    if (!dir.isDirectory) {
        return null
    }

    val files = dir.listFiles() ?: return null

    for (file in files) {
        if (file.isDirectory) {
            val found = findFileByName(file, fileName)
            if (found != null) {
                return found
            }
        } else if (file.name == fileName) {
            return file
        }
    }

    return null
}

fun importResponseMap(): MutableMap<List<String>, String> {

    val fileNameToFind = "configFile"
    val startingDir = File(".")

    val foundFile = findFileByName(startingDir, fileNameToFind)

    if (foundFile != null) {
        println("Archivo encontrado en: ${foundFile.absolutePath}")
    } else {
        println("Archivo no encontrado.")
    }

    val filepath = "./configFile"

    val currentDir = File(".")

    // Construir la ruta relativa desde el directorio de trabajo actual
    val relativeFilePath = "configFile"
    val filePath = File(currentDir, relativeFilePath)

    val mapa = mutableMapOf<List<String>, String>()

    val key = mutableListOf("")

    var intent = ""

    foundFile?.forEachLine { linea ->

        if (linea.isNotBlank()) {

            val divisor = CustomMutableList<String>()
            divisor.addAll(linea.split(":"))

            when (divisor[0]) {
                "Intent" -> {
                    key[0] = divisor[1]
                    intent = divisor[1]
                }

                "Entities" -> {

                    for (e in divisor[1].split(",")) {
                        key.add(e)
                    }
                }

                else -> {
                    mapa[key.toList()] = divisor[0]

                    key.clear()
                    key.add(intent)
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

fun buscarEnMapa(mapa: MutableMap<List<String>, String>, lista: List<String>): String? {
    // Generamos todas las permutaciones posibles de la lista de entrada
    val permutaciones = lista.permutations()

    // Iteramos sobre las permutaciones y buscamos si alguna está en el mapa
    for (permutacion in permutaciones) {
        if (mapa.containsKey(permutacion)) {
            return mapa[permutacion]
        }
    }
    val frases = listOf(
        "No lo se",
        "No tengo esa información",
        "Ahora mismo no sabría responderte",
        "Disculpa, no se que decirte",
        "Perdona, pero no te se decir"
    )

    val indiceAleatorio = Random.nextInt(frases.size)
    return frases[indiceAleatorio]
}

// Extensión para generar todas las permutaciones de una lista
fun <T> List<T>.permutations(): List<List<T>> {
    if (size <= 1) return listOf(this)
    val element = first()
    val subList = drop(1)
    val subListPermutations = subList.permutations()
    return subListPermutations.flatMap { sublistPermutation ->
        (0..sublistPermutation.size).map { i ->
            sublistPermutation.toMutableList().apply { add(i, element) }
        }
    }
}


