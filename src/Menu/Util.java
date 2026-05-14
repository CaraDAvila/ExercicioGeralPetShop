package Menu;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Util {
    Scanner sc = new Scanner(System.in);

    public void menu() {
        int opcao;
        do {
            String aux = "j";
            aux += "[1]Cadastrar animal — escolha entre Cachorro, Gato ou Pássaro e preencha nome e peso.";
            aux += "[2]Registrar serviço — seleciona um animal cadastrado e escolhe entre Banho ou Consulta.";
            aux += "[3]Calcular conta total — soma o custo de todos os serviços registrados no dia.";
            aux += "[4]Exibir relatório — lista todos os animais atendidos e os serviços prestados";
            aux += "[5]Finalizar";

            opcao= parseInt(showInputDialog(aux));
            if (opcao<1||opcao>5){
                showMessageDialog(null, "ERRO");
            }
            else {
                switch (opcao){
                    case 5-> showMessageDialog(null,"EXIT");
                }
            }
        }while (opcao!=5);
    }


}

