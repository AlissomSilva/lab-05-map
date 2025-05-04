import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class PessoaTest {

    private Filme filme1;
    private Filme filme2;
    private Ator ator;

    @Before
    public void setUp() {
        filme1 = new Filme("A Origem", 2010, "Hans Zimmer");
        filme2 = new Filme("Interestelar", 2014, "Hans Zimmer");
        ator = new Ator("Leonardo DiCaprio");
    }

    @Test
    public void testAdicionarFilmesNaFilmografia() {
        ator.adicionarFilme(filme1, "Ator Principal");
        ator.adicionarFilme(filme2, "Coadjuvante");

        Map<Filme, List<String>> filmografia = ator.getFilmografia();
        assertEquals(2, filmografia.size());
        assertTrue(filmografia.containsKey(filme1));
        assertTrue(filmografia.containsKey(filme2));
        assertEquals(Arrays.asList("Ator Principal"), filmografia.get(filme1));
        assertEquals(Arrays.asList("Coadjuvante"), filmografia.get(filme2));
    }

    @Test
    public void testToStringPessoa() {
        assertEquals("Leonardo DiCaprio", ator.toString());
    }
}
