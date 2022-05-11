/*
1-Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no
final do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00

2-Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$
3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$
1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
*/
fun main() {
    val cargo = lerCargo()
    val tempoDeExp = lerTempoDeExp()
    val bonus = bonus(cargo, tempoDeExp)
    println("o bonus é $bonus")
}

fun bonus(cargo: String, tempoDeExp: Int): Double {
    return when {
        cargo.equals("gerente", ignoreCase = true) -> if (tempoDeExp < 2) 2000.0 else 3000.0
        cargo.equals("coordenador", ignoreCase = true) -> if (tempoDeExp < 1) 1500.0 else 1800.0
        cargo.equals("engenheiro", ignoreCase = true) -> 1000.0
        cargo.equals("estagiario", ignoreCase = true) -> 500.0
        else -> 0.0
    }
}

fun lerTempoDeExp(): Int {
    print("Digite o tempo de experiência: ")
    return readln().toInt()
}