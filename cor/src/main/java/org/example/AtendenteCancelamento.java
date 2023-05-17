package org.example;

public class AtendenteCancelamento extends Atendente {

    public AtendenteCancelamento(Atendente superior) {
        listaAtendimentos.add(TipoAtendimentoCancelamento.getTipoAtendimentoCancelamento());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Atendente Cancelamento";
    }

}
