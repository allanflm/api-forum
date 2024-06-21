package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {
    init {
        val topico1 = Topico(
            id = 1,
            titulo = "Duvida kotlin 1",
            mensagem = "Variaveis no kotlin 1",
            curso = Curso(
                id = 1, nome = "Kotlin", categoria = "Programação"
            ),
            autor = Usuario(
                id = 1, nome = "Allan", email = "allan@gmail.com"
            ),
        )
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida kotlin 2",
            mensagem = "Variaveis no kotlin 2",
            curso = Curso(
                id = 1, nome = "Kotlin", categoria = "Programação"
            ),
            autor = Usuario(
                id = 1, nome = "Allan", email = "allan@gmail.com"
            ),
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida kotlin 3",
            mensagem = "Variaveis no kotlin 3",
            curso = Curso(
                id = 1, nome = "Kotlin", categoria = "Programação"
            ),
            autor = Usuario(
                id = 1, nome = "Allan", email = "allan@gmail.com"
            ),
        )
        topicos = Arrays.asList(topico1, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorID(id: Long): Topico {
        return topicos.stream().filter({ t ->
            t.id == id
        }).findFirst().get()
    }


}