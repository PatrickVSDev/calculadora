package br.edu.calculadora.repository;

import java.util.Arrays;

public class ResultadoRepository {

    private static String[] resultados = new String[0];

    public static void salvar(String resultado) {
        resultados = Arrays.copyOf(resultados, resultados.length + 1);
        resultados[resultados.length - 1] = resultado;
    }

    public static String[] buscarResultados() {
        return Arrays.copyOf(resultados, resultados.length);
    }
}
