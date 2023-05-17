package org.example;

public class AtendenteSupervisor extends Atendente {
    
    public AtendenteSupervisor(Atendente superior) {
        listaAtendimentos.add(TipoAtendimentoReclamacao.getTipoAtendimentoReclamacaoReclamacao());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Supervisor";
    }

}
