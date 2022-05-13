/*
1- Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”
2- Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
“50 49 48 47 .. .. .. 2 1”
3- Usando a resolução do exercício 1, não imprima os números múltiplos de 5.
4- Faça a soma de todos os números no intervalo de 1 a 500.
5- Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N
usando o caracter #.
Se a entrada do programa for 3, teremos:
#
##
###
Se a entrada do programa for 5, teremos:
#
##
###
####
#####
*/

fun main() {
    //exercicio1()
    //exercicio1_1()
    //exercicio2()
    //exercicio3()
    //exercicio4()
    //exercicio5()
    exercicio5_1()
}

fun exercicio1() {
    for (number in 1..50) {
        print("$number ")
    }
}


fun exercicio1_1() {
    var index = 0
    while (index < 50) {
        index++
        print("$index ")
    }
}


fun exercicio2() {
    for (number in 50 downTo 1) {
        print("$number ")
    }
}


fun exercicio3() {
    for (number in 1..50) {
        if (number % 5 != 0) {
            print("$number ")
        }
    }
}

fun exercicio4() {
    var total = 0
    for (index in 1..500) {
        total += index
    }
    print("total: $total")
}

fun exercicio5() {
    val steps = getSteps()
    printNormalSteps(steps)
}

fun exercicio5_1() {
    val steps = getSteps()
    val type = getType()
    if (type == "normal") {
        printNormalSteps(steps)
    } else {
        printInvertedSteps(steps)
    }
}


fun getSteps(): Int {
    print("digite a quantidade de degraus: ")
    return readLine()?.toInt()!!
}

fun getType(): String {
    print("digite o tipo (normal/invertido): ")
    return readln()
}

fun printNormalSteps(steps: Int) {
    for (index in 1..steps) {
        for (i in 1..index) {
            print("#")
        }
        println("")
    }
}

fun printInvertedSteps(steps: Int) {
    for (index in steps downTo 1) {
        for (i in 1..index) {
            print("#")
        }
        println("")
    }
}