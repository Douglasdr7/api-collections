package one.digitalinnovation.collections

class Funcionario (
        val nome:String,
        val salario:Double,
        val tipocontratacao: String
    ){
        override fun toString(): String = 
        """
        nome:        $nome
        salario:     $salario
        """.trimIndent()
    }
