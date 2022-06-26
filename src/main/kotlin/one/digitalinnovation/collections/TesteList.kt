package one.digitalinnovation.collections

fun main(){
    val Joao=Funcionario("Joao", 2000.0, "CLT")
    val Pedro=Funcionario("Pedro", 1500.0, "PJ")
    val Maria=Funcionario("Maria", 4000.0,"CLT")

    val funcionarios=listOf(Joao, Pedro, Maria)

    funcionarios.forEach{ println(it)    }
    println("------------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("------------------")
    funcionarios
        .groupBy{it.tipocontratacao}
        .forEach{println(it)}
}

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipocontratacao: String
){
    override fun toString(): String=
    """
        nome:        $nome
        salario:     $salario
    """.trimIndent()

}