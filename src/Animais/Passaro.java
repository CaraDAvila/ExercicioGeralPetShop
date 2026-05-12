package Animais;

public class Passaro extends Animal {

    private Passaro(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double calcularPrecoBase(double preco) {
        return preco=30;
    }

    @Override
    public double calcularCusto() {
        return 0;
    }
}
