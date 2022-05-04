/*
Lembretes curso android

* Qualquer arquivo ou pasta nova sempre tem que ser criado dentro da pasta src (source)
* Cuidado com escopo local e global (erro top level)
* Corpo de uma função é definido entre chaves { corpo }
* Cuidado com identação para facilitar a leitura do código (pode usar code / reformat code)
* Não criar arquivos e funções com o mesmo nome, mesmo estando em diretórios diferentes
* No Kotlin toda variável tem tipo, mesmo quando não é informado, o compilador infere o valor. Ex: var name = “João” // inferência para string
* Val é constante e var é variável
* Não pode criar variável ou função com palavras reservadas da linguagem, ex: var fun = “teste” (fun é usado para declarar função)

Type          Bit
Double      64
Float          32
Long          64   - ULong
Int              32   - UInt
Short         16    - UShort
Byte           8     - UByte
Boolean
String
Char

println(“tamanho do int: ${Int.MAX_VALUE}”)

Funções devem ter responsabilidades especificas
Começa com fun, tem ou não uma lista de parâmetros, e pode ou não ter retorno
Quando tem um retorno informado, devemos usar a palavra reservada return
Unit indica que a função não tem retorno
Funções com uma linha e retorno: fun sum(n1: Int, n2: Int) = (n1 + n2)
Para saber o tamanho de uma string, use a função .length
Para saber se uma string começa com uma substring, podemos usar .startsWith
Podemos acessar um char em uma string fazendo string[index]
Uma função pode ser declarada com o mesmo nome mas com parâmetros diferentes
A função trim de string remove espaços no inicio e no final
O replace da string pode ser usado com ignoreCase para ignorar maiúsculas ou minúsculas
Uma string é uma sequencia de char
Um conjunto sempre começa por 0

Usando a biblioteca math, podemos usar funções matemáticas
Usando a função max, podemos saber qual é o maior entre números
Sqrt é para raiz quadrada
Round arredonda valores Long, Float
O asterisco no pacote na função indica que usaremos todas as funções daquele pacote
 */


fun main(args: Array<String>) {
//    println("Hello World!")
//    val nome: String
//    var fun1 = 1
//
//    showTypes()
//    var tamanhoDeCalcado: Short = 128
    val nome = "Rafael"

    imprimirNome(nome)
    println(retornaNome(nome))
    println(tamanhoDaString("   Qualquer coisa   "))
    println(nome[4])
    println(nome.replace("Rafa", "Joao"))


}

fun soma(x:Int, y:Int) = x + y

fun imprimirNome(nome:String) {
    println("Nome: $nome")
}

fun retornaNome(nome:String): String {
    return "Nome: $nome"

}
fun tamanhoDaString(string: String): Int {
    return string.trim().length
}


fun soma(x:Float, y:Float): Float {
    return x + y

}

fun soma(x:Float, y:Float, z:Float): Float {
    return x + y

}

fun showTypes() {
/*
Double      64
Float          32
Long          64   - ULong
Int              32   - UInt
Short         16    - UShort
Byte           8     - UByte
Boolean
String
Char
*/
    println("DoubleMax: ${Double.MAX_VALUE} | DoubleMin: ${Double.MIN_VALUE}")
    println("FloatMax: ${Float.MAX_VALUE} | FloatMin: ${Float.MIN_VALUE}")
    println("LongMax: ${Long.MAX_VALUE} | LongMin: ${Long.MIN_VALUE}")
    println("IntMax: ${Int.MAX_VALUE} | IntMin: ${Int.MIN_VALUE}")
    println("ShortMax: ${Short.MAX_VALUE} | ShortMin: ${Short.MIN_VALUE}")
    println("ByteMax: ${Byte.MAX_VALUE} | ByteMin: ${Byte.MIN_VALUE}")

}