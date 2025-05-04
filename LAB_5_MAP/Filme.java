import java.util.*;

public class Filme {

    private String nome;
    private int ano;
    private String trilhaSonora;
    private Map<String, List<Pessoa>> participantes = new HashMap<>();

    public Filme(String nome, int ano, String trilhaSonora) {
        this.nome = nome;
        this.ano = ano;
        this.trilhaSonora = trilhaSonora;
    }

    public void adicionarParticipante(Pessoa pessoa, String funcao) {
        participantes.putIfAbsent(funcao, new ArrayList<>());
        participantes.get(funcao).add(pessoa);
        pessoa.adicionarFilme(this, funcao);
    }

    public String getDescricaoCompleta() {
        StringBuilder sb = new StringBuilder();
        sb.append("Filme: ").append(nome).append("\n");
        sb.append("Ano: ").append(ano).append("\n");
        sb.append("Trilha sonora: ").append(trilhaSonora).append("\n");

        for (String funcao : participantes.keySet()) {
            sb.append(funcao).append(": ");
            sb.append(participantes.get(funcao)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return nome + " (" + ano + ")";
    }
}
