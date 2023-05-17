package org.example;

import java.util.ArrayList;

public abstract class Atendente {

    protected ArrayList listaAtendimentos = new ArrayList();
    private Atendente atendenteSuperior;

    public Atendente getFuncionarioSuperior() {
        return atendenteSuperior;
    }

    public void setFuncionarioSuperior(Atendente atendenteSuperior) {
        this.atendenteSuperior = atendenteSuperior;
    }
    
    public abstract String getDescricaoCargo();
    
    public String realizarAtendimento(Atendimento atendimento) {
        if (listaAtendimentos.contains(atendimento.getTipoAtendimento())) {
            return getDescricaoCargo();
        }
        else {
            if (atendenteSuperior != null) {
                return atendenteSuperior.realizarAtendimento(atendimento);
            }
            else 
            {
                return "URA";
            }
        }        
    }
}
