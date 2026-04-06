package view;

import controller.NPRController;
import br.edu.fateczl.pilhaint.PilhaInt;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        NPRController npr = new NPRController();
        PilhaInt pilha = new PilhaInt();

        String entrada = "";

        try {
            do {
                entrada = JOptionPane.showInputDialog(
                        "Digite um número ou operação (+, -, *, /)\nDigite 'sair' para encerrar:"
                );

                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                }

                if (entrada.matches("-?\\d+")) {
                    int valor = Integer.parseInt(entrada);
                    npr.insereValor(pilha, valor);
                } else {
                    int resultado = npr.npr(pilha, entrada);
                    System.out.println("Resultado: " + resultado);
                }

            } while (true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}