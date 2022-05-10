fun main() {
    val cargo = lerCargo()
    val sexo = lerSexo()
    val tempoDeServico = lerTempoDeServico()
    val salario = calculaSalario(cargo,tempoDeServico, sexo)
    println("o salário é $salario")
}

fun calculaSalario(cargo: String, tempoDeServico: Int, sexo: String): Float {
    if (cargo.equals("assistente", ignoreCase = true)) {
        if (tempoDeServico == 5) {
            if (sexo == "F") {
                return 4000f
            } else {
                return 3500f
            }
        }
    }
    if (cargo == "gerente" && tempoDeServico == 5 && sexo == "M") {
        return 5000f
    }
    return 3000f
}

fun lerCargo(): String {
    print("Digite o cargo: ")
    return readln()
}

fun lerTempoDeServico(): Int {
    print("Digite o tempo: ")
    return readln().toInt()
}

fun lerSexo(): String {
    print("Digite o sexo (M/F): ")
    return readln()
}