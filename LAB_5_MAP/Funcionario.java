import java.util.*;
interface Funcionario {
    String getNome();
    void adicionarFilme(Filme filme, String funcao);
    Map<Filme, List<String>> getFilmografia();
}