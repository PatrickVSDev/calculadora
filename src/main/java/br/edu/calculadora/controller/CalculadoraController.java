package br.edu.calculadora.controller;

import br.edu.calculadora.repository.ResultadoRepository;
import br.edu.calculadora.service.CalculadoraService;

public class CalculadoraController {

    public static void iniciar() {
        System.out.println("Olá muito bem-vind@ a nossa maravilhosa calculadora!!!!");
        do {
            var primeiroValor = Terminal.lerDouble("Informe um valor: ");
            var segundoValor = Terminal.lerDouble("Informe outro valor: ");
            var operacao = Terminal.lerOperacao();
            var resultado = CalculadoraService.calcular(operacao, primeiroValor, segundoValor);
            System.out.println(resultado);
            ResultadoRepository.salvar(resultado);
        } while (Terminal.lerBoolean("Deseja continuar calculando? [(S)im/(N)ão]: "));
        if (Terminal.lerBoolean("Deseja imprimir o resultado dos últimos cálculos?  [(S)im/(N)ão]: ")) {
            imprimir();
        }
        System.out.println("Até logo e obrigado pelos peixes!");
    }

    private static void imprimir() {
        for (String resultado : ResultadoRepository.buscarResultados()) {
            System.out.println(resultado);
        }
    }


}
