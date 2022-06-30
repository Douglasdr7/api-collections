package one.digitalinnovation.collections

fun main(){
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "PJ")
    val Maria = Funcionario("Maria", 4000.0, "CLT")


    println("-------START-----------")
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Pedro.nome, Pedro)
    repositorio.create(Maria.nome, Maria)

    println(repositorio.findById(Joao.nome))

    println("-------FINDALL-----------")

    repositorio.findAll().forEach{ println(it) }

    println("-------REMOVE-----------")
    (repositorio.remove(Maria.nome))
    repositorio.findAll().forEach{ println(it) }
}