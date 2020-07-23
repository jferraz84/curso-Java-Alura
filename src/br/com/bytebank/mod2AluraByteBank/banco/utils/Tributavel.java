package br.com.bytebank.mod2AluraByteBank.banco.utils;

public abstract interface Tributavel {

    // Mesmo não colocando 'PUBLIC' o compilador entende,
    // já como public por ser padrão default para interface
    double getValorImposto();
}
