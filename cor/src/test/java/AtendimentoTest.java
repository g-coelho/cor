import org.example.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtendimentoTest {


    AtendenteSupervisor supervisor;
    AtendenteCancelamento atendenteCancelamento;
    AtendenteTecnico atendenteTecnico;
    AtendenteGeral atendenteGeral;

    @BeforeEach
    public void setUp() {
        supervisor = new AtendenteSupervisor(null);
        atendenteCancelamento = new AtendenteCancelamento(supervisor);
        atendenteTecnico = new AtendenteTecnico(atendenteCancelamento);
        atendenteGeral = new AtendenteGeral(atendenteTecnico);
    }


    @Test
    public void deveRetornarAtendenteGeralParaInformacao() {
        assertEquals("Atendente Geral", atendenteGeral.realizarAtendimento(new Atendimento(TipoAtendimentoInformacao.getTipoAtendimentoInformacao())));
    }

    @Test
    void deveRetornarTecnicoParaAssinaturaReparo() {
        assertEquals("Atendente Técnico", atendenteGeral.realizarAtendimento(new Atendimento(TipoAtendimentoReparo.getTipoAtendimentoReparo())));
    }

    @Test
    void deveRetornarCancelalmentoParaCancelamento() {
        assertEquals("Atendente Cancelamento", atendenteGeral.realizarAtendimento(new Atendimento(TipoAtendimentoCancelamento.getTipoAtendimentoCancelamento())));
    }

    @Test
    void deveRetornarSupervisorParaReclamacao() {
        assertEquals("Supervisor", atendenteGeral.realizarAtendimento(new Atendimento(TipoAtendimentoReclamacao.getTipoAtendimentoReclamacaoReclamacao())));
    }

    @Test
    void deveRetornarURAParaURA() {
        assertEquals("URA", atendenteGeral.realizarAtendimento(new Atendimento(TipoAtendimentoURA.getTipoAtendimentoURA())));
    }

}
