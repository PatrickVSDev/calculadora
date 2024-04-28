package br.edu.calculadora.controller;

import java.util.Scanner;

public class Terminal {

    private static final Scanner SC = new Scanner(System.in);

    public static double lerDouble(String label) {
        var valor = 0.0;
        var invalido = false;
        do {
            try {
                System.out.print(label);
                String textoLido = SC.nextLine();
                valor = Double.parseDouble(textoLido);
                invalido = false;
            } catch (NumberFormatException ex) {
                System.out.println("ATENCAO> Valor informado é inválido!");
                invalido = true;
            }
        } while (invalido);
        return valor;
    }

    public static String lerOperacao() {
        var invalido = false;
        var operacao = "";
        do {
            System.out.println("Escolha uma operação:");
            System.out.println("[+] Somar");
            System.out.println("[-] Subtrair");
            System.out.println("[*] Multiplicar");
            System.out.print("[/] Dividir: ");
            var textoLido = SC.nextLine();
            switch (textoLido) {
                case "+":
                case "-":
                case "*":
                case "/":
                    operacao = textoLido;
                    invalido = false;
                    break;
                default:
                    System.out.println("ATENCAO> Operação informada é inválida!");
                    invalido = true;
            }
        } while (invalido);

        return operacao;
    }

    public static boolean lerBoolean(String label) {
        var invalido = false;
        var continuar = false;
        do {
            System.out.print(label);
            String valorLido = SC.nextLine();
            invalido = !valorLido.equalsIgnoreCase("N") && !valorLido.equalsIgnoreCase("S");
            if (invalido) {
                System.out.println("ATENCAO> Valor informado é inválido!");
            } else {
                continuar = valorLido.equalsIgnoreCase("S");
            }
        } while (invalido);
        return continuar;
    }

}
