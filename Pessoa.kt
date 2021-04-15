class Pessoa (
    val nome: String,
    val idade: Int
)

fun main() {
    val pessoa1: Pessoa = Pessoa(nome = "Luis", idade = 21)
    val pessoa2: Pessoa = Pessoa(nome = "Laize", idade = 22)
    val pessoa3: Pessoa = Pessoa(nome = "Anna Lua" ,idade = 1)



    println("Ola me chamo ${pessoa1.nome} , sou casado com a ${pessoa2.nome} e juntos fizemos com muito amor a nossa ${pessoa3.nome}.")


}





