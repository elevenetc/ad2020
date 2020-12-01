import java.io.File

fun readLines(fileName: String): List<String> = File(fileName).useLines { it.toList() }