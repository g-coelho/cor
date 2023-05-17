package org.example;

public class TipoAtendimentoReparo implements TipoAtendimento {

    private static TipoAtendimentoReparo tipoAtendimentoReparo = new TipoAtendimentoReparo();

    private TipoAtendimentoReparo() {};
    
    public static TipoAtendimentoReparo getTipoAtendimentoReparo() {
        return tipoAtendimentoReparo;
    }

}
