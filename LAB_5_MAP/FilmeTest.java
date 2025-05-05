import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class FilmeTest {

    private Filme filme;
    private Ator ator;
    private Diretor diretor;

    @Before
    public void setUp() {
        filme = new Filme("A Origem", 2010, "Hans Zimmer");
        ator = new Ator("Leonardo DiCaprio");
        diretor = new Diretor("Christopher Nolan");
    }

    @Test
    public void testAdicionarParticipante() {
        filme.adicionarParticipante(ator, "Ator Principal");
        filme.adicionarParticipante(diretor, "Diretor");

        Map<Filme, List<String>> filmografiaAtor = ator.getFilmografia();
        Map<Filme, List<String>> filmografiaDiretor = diretor.getFilmografia();

        assertTrue(filmografiaAtor.containsKey(filme));
        assertTrue(filmografiaDiretor.containsKey(filme));
        assertEquals(Arrays.asList("Ator Principal"), filmografiaAtor.get(filme));
        assertEquals(Arrays.asList("Diretor"), filmografiaDiretor.get(filme));
    }

    @Test
    public void testDescricaoCompleta() {
        filme.adicionarParticipante(ator, "Ator Principal");
        filme.adicionarParticipante(diretor, "Diretor");

        String descricao = filme.getDescricaoCompleta();

        assertTrue(descricao.contains("Filme: A Origem"));
        assertTrue(descricao.contains("Ano: 2010"));
        assertTrue(descricao.contains("Trilha sonora: Hans Zimmer"));
        assertTrue(descricao.contains("Ator Principal: [Leonardo DiCaprio]"));
        assertTrue(descricao.contains("Diretor: [Christopher Nolan]"));
    }

    @Test
    public void testToStringFilme() {
        assertEquals("A Origem (2010)", filme.toString());
    }
    @Test
    public void testParticipanteComMultiplasFuncoes() {
        filme.adicionarParticipante(ator, "Ator Principal");
        filme.adicionarParticipante(ator, "Roteirista");

        Map<Filme, List<String>> filmografiaAtor = ator.getFilmografia();
        assertTrue(filmografiaAtor.containsKey(filme));
        assertEquals(Arrays.asList("Ator Principal", "Roteirista"), filmografiaAtor.get(filme));
    }

}
