package com.livraria.livrariadevops.service;

import com.livraria.livrariadevops.domain.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    public List<Livro> obterTodos() {
       return criarLivros();
    }

    private  List<Livro> criarLivros() {
        List<Livro> livros = new ArrayList<>();
        Livro livro1 = new Livro(1L, "O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", "Uma épica aventura pela Terra-média...");
        Livro livro2 = new Livro(2L, "O Guia do Mochileiro das Galáxias", "Douglas Adams", "Comédia Sci-Fi", "Uma jornada hilária pelo espaço...");
        Livro livro3 = new Livro(3L, "O Hobbit", "J.R.R. Tolkien", "Fantasia", "Uma aventura prequel ao Senhor dos Anéis...");
        Livro livro4 = new Livro(4L, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia", "As aventuras de um jovem bruxo em Hogwarts...");
        Livro livro5 = new Livro(5L, "O apanhador no campo de centeio", "J.D. Salinger", "Romance", "A história conturbada de um adolescente rebelde...");
        Livro livro6 = new Livro(6L, "1984", "George Orwell", "Distopia", "Uma crítica à sociedade totalitária...");
        Livro livro7 = new Livro(7L, "O Sol é para Todos", "Harper Lee", "Drama", "A luta contra o racismo nos EUA...");
        Livro livro8 = new Livro(8L, "O Senhor das Moscas", "William Golding", "Aventura", "Um grupo de meninos perdidos em uma ilha...");
        Livro livro9 = new Livro(9L, "Orgulho e Preconceito", "Jane Austen", "Romance", "Uma história de amor e costumes na Inglaterra do século XIX...");
        Livro livro10 = new Livro(10L, "Dom Quixote", "Miguel de Cervantes", "Romance", "As aventuras cavaleirescas de um fidalgo espanhol...");

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);
        livros.add(livro6);
        livros.add(livro7);
        livros.add(livro8);
        livros.add(livro9);
        livros.add(livro10);

        return livros;
    }
}
