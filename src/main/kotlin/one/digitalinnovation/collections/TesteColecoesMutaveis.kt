package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "PJ")
    val Maria = Funcionario("Maria", 4000.0, "CLT")


    println("-------START-----------")
    val funcionarios = mutableListOf(Joao, Maria)
    funcionarios.forEach { println(it)}

    println("-------ADD-----------")
    funcionarios.add(Pedro)
    funcionarios.forEach{println(it)}

    println("-------REMOVE-----------")
    funcionarios.remove(Joao)
    funcionarios.forEach{println(it)}

    println("---------SET---------")
    val funcionariosSet = mutableSetOf (Joao)
    funcionariosSet.forEach{println(it)}

    println("---------ADD SET---------")
    funcionariosSet.add(Pedro)
    funcionariosSet.add(Maria)
    funcionariosSet.forEach{println(it)}

    println("---------REMOVE SET---------")
    funcionariosSet.remove(Maria)
    funcionariosSet.forEach{println(it)}
}