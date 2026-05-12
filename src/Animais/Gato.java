package Animais;

public class Gato extends Animal {

    private Gato(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double calcularPrecoBase(double preco) {

    }

    @Override
    public double calcularCusto() {
        return 0;
    }
}
