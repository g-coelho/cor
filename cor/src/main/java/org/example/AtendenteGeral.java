package org.example;

public class AtendenteGeral extends Atendente {
    
    public AtendenteGeral(Atendente superior) {
        listaAtendimentos.add(TipoAtendimentoInformacao.getTipoAtendimentoInformacao());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Atendente Geral";
    }
}
