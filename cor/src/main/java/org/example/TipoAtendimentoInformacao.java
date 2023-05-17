package org.example;

public class TipoAtendimentoInformacao implements TipoAtendimento {

    private static TipoAtendimentoInformacao tipoAtendimentoInformacao = new TipoAtendimentoInformacao();

    private TipoAtendimentoInformacao() {};
    
    public static TipoAtendimentoInformacao getTipoAtendimentoInformacao() {
        return tipoAtendimentoInformacao;
    }

}
