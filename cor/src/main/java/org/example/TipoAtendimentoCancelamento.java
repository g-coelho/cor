package org.example;

public class TipoAtendimentoCancelamento implements TipoAtendimento {

    private static TipoAtendimentoCancelamento tipoAtendimentoCancelamento = new TipoAtendimentoCancelamento();

    private TipoAtendimentoCancelamento() {};

    public static TipoAtendimentoCancelamento getTipoAtendimentoCancelamento() {
        return tipoAtendimentoCancelamento;
    }
}
