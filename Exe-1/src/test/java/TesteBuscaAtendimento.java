import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteBuscaAtendimento {

    AtendimentoService service;
    BuscaAtendimento buscaAtendimento;

    @Before
    public void setup(){
        //Criando o contexo do meu teste com o Mock (serviço mock)
        service = new MockAtendimentoService();
        buscaAtendimento = new BuscaAtendimento(service);
    }

    //Teste Cenário sucesso
    @Test
    public void testeBuscaAtendimentoNeto() {

        Atendimento douglas = buscaAtendimento.buscaAtendimento("neto");

        assertEquals("Neto", douglas.getprofessor());
        assertEquals(22, douglas.getHorario(), 0.1);
        assertEquals("noturno", douglas.getPeriodo());
    }
    //Teste Cenário falha
    @Test
    public void testeBuscaAtendimentoCristina() {

        Atendimento cristina = buscaAtendimento.buscaAtendimento("cristina");

        assertNotEquals("Cristina", cristina.getprofessor());
        assertNotEquals(11, cristina.getHorario(), 0.1);
        assertNotEquals("integral", cristina.getPeriodo());
    }
    //Teste Cenário sucesso
    @Test
    public void testeValidaHorarioNeto() {

        Atendimento netoA = buscaAtendimento.buscaAtendimento("neto");
        boolean neto = buscaAtendimento.timeValidation(netoA.getHorario());

        assertTrue(neto);
    }
    //Teste Cenário falha
    @Test
    public void testeValidaHorarioCristina() {

        Atendimento cristinaA = buscaAtendimento.buscaAtendimento("cristina");
        boolean cristina = buscaAtendimento.timeValidation(cristinaA.getHorario());

        assertFalse(cristina);
    }
    //Teste Cenário sucesso
    @Test
    public void testeValidaPeriodoNeto() {

        Atendimento netoA = buscaAtendimento.buscaAtendimento("neto");
        boolean neto = buscaAtendimento.periodValidation(netoA.getPeriodo());

        assertTrue(neto);

    }
    //Teste Cenário falha
    @Test
    public void testeValidaPeriodoCristina() {

        Atendimento cristinaA = buscaAtendimento.buscaAtendimento("cristina");
        boolean cristina = buscaAtendimento.periodValidation(cristinaA.getPeriodo());

        assertFalse(cristina);

    }
}
