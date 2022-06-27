package one.digitalinnovation.collections

fun main(){
        val Joao=Funcionario ("Joao", 2000.0, "CLT")
        val Pedro=Funcionario("Pedro", 1500.0, "PJ")
        val Maria=Funcionario("Maria", 4000.0,"CLT")

    val funcionarios1 = setOf(Joao, Pedro)
    val funcionarios2 = setOf(Maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach {println(it)}

    println("-----------------")
    val funcionarios3 = setOf(Joao, Pedro,Maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}

    println("-----------------")
    val resultIntersect = funcionarios3.intersect (funcionarios2)
    resultIntersect.forEach{println(it)}
    }