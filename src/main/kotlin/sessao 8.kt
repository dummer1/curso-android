fun main() {
    tryCatch()
    elvis()
    funcLet()
}

fun elvis() {
    val string: String? = readLine()
    if (string == null) {
        println("nulo")
    } else {
        println(string)
    }
    println(string ?: "nulo")
}

fun funcLet() {
    val string: String? = readLine()
    if (string != null) {
        println(string)
    }
    string?.let {
        println("caiu no $it")
    }
}

fun tryCatch() {
    try {
        val name: String? = null
        name!!.uppercase()
        println("digite um valor inteiro: ")
        val number = readln().toInt()
        val division = number / 0
        println(division)
    } catch (error: java.lang.NumberFormatException) {
        println("numero invalido")
    } catch (error: java.lang.ArithmeticException) {
        println("impossivel dividir por 0")
    }catch (error: java.lang.NullPointerException) {
        println("o nome esta nulo")
    }
}