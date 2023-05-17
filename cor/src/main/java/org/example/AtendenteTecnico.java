package org.example;

public class AtendenteTecnico extends Atendente {

    public AtendenteTecnico(Atendente superior) {
        listaAtendimentos.add(TipoAtendimentoReparo.getTipoAtendimentoReparo());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Atendente Técnico";
    }

}
