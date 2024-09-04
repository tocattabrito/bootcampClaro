import com.brito.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validarCalculoDeIdade() {
         Pessoa pessoa = new Pessoa("Klara", LocalDate.of(2013, 11, 26));
        Assertions.assertEquals(10, pessoa.getIdade());
    }
}
