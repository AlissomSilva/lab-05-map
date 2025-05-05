import java.util.*;
public class Main {
    public static void main(String[] args) {
        Ator ator1 = new Ator("Leonardo DiCaprio");
        Ator ator2 = new Ator("Kate Winslet");
        Diretor diretor = new Diretor("James Cameron");

        Filme filme = new Filme("Titanic", 1997, "My Heart Will Go On");

        filme.adicionarParticipante(ator1, "Protagonista");
        filme.adicionarParticipante(ator1, "Co-diretor");
        filme.adicionarParticipante(ator2, "Protagonista");
        filme.adicionarParticipante(diretor, "Diretor");


        System.out.println("=== Descrição do Filme ===");
        System.out.println(filme.getDescricaoCompleta());

        System.out.println("=== Filmografia dos Participantes ===");
        mostrarFilmografia(ator1);
        mostrarFilmografia(ator2);
        mostrarFilmografia(diretor);
    }

    public static void mostrarFilmografia(Pessoa pessoa) {
        System.out.println("Filmografia de " + pessoa.getNome() + ":");
        for (Map.Entry<Filme, List<String>> entry : pessoa.getFilmografia().entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }
}