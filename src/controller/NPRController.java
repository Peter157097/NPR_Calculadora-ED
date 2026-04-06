package controller;

import br.edu.fateczl.pilhaint.PilhaInt;

public class NPRController {

    public void insereValor(PilhaInt p, int valor) {
        p.push(valor);
    }

    public int npr(PilhaInt p, String op) throws Exception {

        if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            throw new Exception("Operação inválida");
        }

        if (p.size() < 2) {
            throw new Exception("Pilha com valores insuficientes");
        }

        int v1 = p.pop();
        int v2 = p.pop();

        int resultado = 0;

        switch (op) {
            case "+":
                resultado = v2 + v1;
                break;
            case "-":
                resultado = v2 - v1;
                break;
            case "*":
                resultado = v2 * v1;
                break;
            case "/":
                resultado = v2 / v1;
                break;
        }

        p.push(resultado);

        return resultado;
    }
}