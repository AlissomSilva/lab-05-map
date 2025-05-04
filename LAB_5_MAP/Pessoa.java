import java.util.*;
public abstract class Pessoa implements Funcionario {
    protected String nome;
    protected Map<Filme, List<String>> filmografia = new HashMap<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFilme(Filme filme, String funcao) {
        filmografia.putIfAbsent(filme, new ArrayList<>());
        filmografia.get(filme).add(funcao);
    }

    public Map<Filme, List<String>> getFilmografia() {
        return filmografia;
    }

    @Override
    public String toString() {
        return nome;
    }
}