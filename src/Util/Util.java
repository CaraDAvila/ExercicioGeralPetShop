package Util;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;
//todas as classes JOptionPane        ^

public class Util {
    Scanner sc = new Scanner(System.in);

    public void menu() {
        int opcao;
        String aux = """
                [1]Cadastrar animal — escolha entre Cachorro, Gato ou Pássaro e preencha nome e peso.
                [2]Registrar serviço — seleciona um animal cadastrado e escolhe entre Banho ou Consulta.
                [3]Calcular conta total — soma o custo de todos os serviços registrados no dia.
                [4]Exibir relatório — lista todos os animais atendidos e os serviços prestados.
                [5]FINALIZAR
                """;
        do {
            opcao = 0;

            try {
                opcao = parseInt(showInputDialog(aux));

            } catch (NumberFormatException e) {
                showMessageDialog(null, "OPÇÃO DEVE SER NÚMERO INTEIRO ENTRE 1 E 5\n ( " +e+ " )");
            }

//            if (opcao < 1 || opcao > 5) {
//                showMessageDialog(null, "ERRO");
//            } else {
//                switch (opcao) {
//                    case 5 -> showMessageDialog(null, "EXIT");
//                }
//            }

        } while (opcao != 5);
    }

}

