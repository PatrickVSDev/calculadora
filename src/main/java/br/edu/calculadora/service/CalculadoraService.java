package br.edu.calculadora.service;

public class CalculadoraService {

    public static String calcular(String operacao, double primeiroValor, double segundoValor) {
        switch (operacao) {
            case "+":
                return String.format("O resultado da soma do número %.2f + %.2f é %.2f", primeiroValor, segundoValor, (primeiroValor + segundoValor));
            case "-":
                return String.format("O resultado da subtração do número %.2f - %.2f é %.2f", primeiroValor, segundoValor, (primeiroValor - segundoValor));
            case "*":
                return String.format("O resultado da multiplicação do número %.2f * %.2f é %.2f", primeiroValor, segundoValor, (primeiroValor * segundoValor));
            case "/":
                return String.format("O resultado da divisão do número %.2f / %.2f é %.2f", primeiroValor, segundoValor, (primeiroValor / segundoValor));
            default:
                return "";
        }
    }
}
