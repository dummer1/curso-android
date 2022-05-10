/*
Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no
final do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
*/
fun main() {
    val cargo = lerCargo()
    val bonus = bonus(cargo)
    println("o bonus é $bonus")
}

fun bonus(cargo: String): Double {
    when {
        cargo.equals("gerente", ignoreCase = true) -> return 2000.0
        cargo.equals("coordenador", ignoreCase = true) -> return 1500.0
        cargo.equals("engenheiro", ignoreCase = true) -> return 1000.0
        cargo.equals("estagiario", ignoreCase = true) -> return 500.0
        else -> return 0.0
    }
}