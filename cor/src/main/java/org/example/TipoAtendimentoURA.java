package org.example;

public class TipoAtendimentoURA implements TipoAtendimento {

    private static TipoAtendimentoURA tipoAtendimentoURA = new TipoAtendimentoURA();

    private TipoAtendimentoURA() {};
    
    public static TipoAtendimentoURA getTipoAtendimentoURA() {
        return tipoAtendimentoURA;
    }
}
