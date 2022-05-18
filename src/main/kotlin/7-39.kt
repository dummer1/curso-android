/*
1 Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).
2 Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo.
Informar se é um triângulo equilátero (todos os lados iguais).
3 Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
fun qualASaida(num: Int) {
 if (num >= 0) {
 if (num == 0)
 println("Primeira string")
 else println("Segunda string")
 }
 println("Terceira string")
}
4 Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não
seja nenhum destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam
com “XT”. Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite
inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
 */

fun main() {
    //ex39_1()
    //ex39_2()
    //ex39_3(4)
}

fun ex39_1() {
    println("digite um numero inteiro: ")
    val int1 = readln().toInt()
    println("digite um numero inteiro: ")
    val int2 = readln().toInt()
    if (int1 > 0 && int2 > 0) {
        if (int1 == int2) {
            println("é um quadrado")
        } else {
            println("não é um quadrado")
        }
    }
}

fun ex39_2() {
    val totalNumbers = 3
    var numbers: ArrayList<Int> = arrayListOf()
    for (index in 1..totalNumbers) {
        println("digite um numero inteiro: ")
        val side = readln().toInt()
        numbers.add(side)
    }
    val equilatero = numbers.distinct().count() == 1
    val isosceles = numbers.distinct().count() == 2
    if (equilatero) {
        println("equilatero")
    } else if (isosceles) {
        println("isosceles")
    } else {
        println("escaleno")
    }
}

fun ex39_3(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

fun ex39_4() {

    print("Digite a idade: ")
    val age = readln().toInt()
    if (age < 18) {
        println("Negado. Menores de idade não são permitidos.")
        return
    }
    print("Digite o tipo do convite: ")
    val invitationType = readln()
    val types: ArrayList<String> = arrayListOf("comum", "premium", "luxo")

    if (!types.contains(invitationType)) {
        println("Negado. Convite inválido.")
        return
    }
    print("Digite o código do convite: ")
    val invitationCode = readln()

    if (!invitationCode.startsWith("XL") || !invitationCode.startsWith("XT")) {
        println("Negado. Convite inválido.")
        return
    }


}