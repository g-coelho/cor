package org.example;

public class TipoAtendimentoReclamacao implements TipoAtendimento {

    private static TipoAtendimentoReclamacao tipoAtendimentoReclamacao = new TipoAtendimentoReclamacao();

    private TipoAtendimentoReclamacao() {};

    public static TipoAtendimentoReclamacao getTipoAtendimentoReclamacaoReclamacao() {
        return tipoAtendimentoReclamacao;
    }
}
