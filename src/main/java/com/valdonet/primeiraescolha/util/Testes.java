package com.valdonet.primeiraescolha.util;

public class Testes {

    public static void main(String[] args) {

        Long idProcesso = 28L;
        boolean resultado = podeAnexarArquivoProcessoLic(idProcesso);
        System.out.println(resultado);
    }


    public static boolean podeAnexarArquivoProcessoLic(Long idProcesso){
        Long situacaoProcesso = idProcesso;
        if (situacaoProcesso != null){
            return situacaoProcesso == 25 || situacaoProcesso == 28;
        }
        return false;
    }
}
