package contador;

import java.util.Scanner;

import contador.exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        System.out.println("\n\n\n****************************** Início **********************************\n\n\n");

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        terminal.close();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("\n\n\nO segundo parâmetro deve ser maior que o primeiro!");

            System.out.println(
                    "\n\n****************************** FIM NO CATCH **********************************\n\n\n");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));

        }
        System.out.println("\n\n\n****************************** FIM **********************************\n\n\n");
    }
}
