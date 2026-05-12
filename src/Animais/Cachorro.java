package Animais;

public class Cachorro extends Animal {

    private Cachorro(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double calcularPrecoBase(double preco) {
        if (this.peso <= 10) {
            preco = 40;
        } else if (this.peso <= 25) {
            preco = 60;
        } else if (this.peso > 25) {
            preco = 85;
        }

        return preco;
    }

    @Override
    public double calcularCusto() {
        return 0;
    }
}
