package Animais;

public abstract class Animal {
    String nome;
    double peso;
    protected abstract double calcularPrecoBase(double preco);
    protected abstract double calcularCusto();
}


