fun main() {
    var nomeCompleto = "Rafael Menezes"
    val texto = ""
    var tamanhoDoCalcado: Short = 40
    val pibBrasil: Long = 1869000000000
    val popBrasil = 21000000

    println("PIB per capta: ${calcularPIB(pibBrasil, popBrasil)}")
    transformarAno()
    stringSize()
    cubo()
    conversaoMilhasKm()
    println("Digite uma string:")
    substituir("texto aqui")


}

/*
Crie um programa capaz de atender os requisitos abaixo:
a. Crie um novo arquivo com uma função main.
b. Declare uma variável mutável capaz de armazenar seu nome completo.
c. Declare uma variável de texto sem valor algum.
d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que
você calça.
e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000).
f. Declare uma variável capaz de armazenar a população do Brasil (211.000.000).
g. Imprima o valor do PIB per capita.
h. Rode seu programa de maneira que não possua erros de compilação ou execução.

 */

fun calcularPIB(pibBrasil: Long, popBrasil: Int): Long {
    return pibBrasil / popBrasil
}
/*
Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos.
 */

fun transformarAno() {
    println("Digite a quantidade de anos:")
    val anos = readln().toInt()
    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos anos equivalem a:\n$meses meses\n$dias dias\n$horas horas\n$minutos minutos\n$segundos segundos")

}

/*
Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
 */

fun stringSize() {
    println("Digite uma palavra:")
    val string = readln()

    println("$string tem ${string.length} letras.")

}

/*
Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
 */

fun cubo() {
    println("Digite um valor para n:")
    val n = readln().toDouble()

    println("O cubo de $n é ${n * n * n}")

}

/*
Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
 */

fun conversaoMilhasKm() {
    println("Digite um valor para 'x' em milhas:")
    val x = readln().toDouble()

    println("$x equivalem a ${x * 1.6}Km")
}

/*
Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A”
por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.
 */

fun substituir(texto: String) {
    println(texto.lowercase().replace("a", "x"))
}