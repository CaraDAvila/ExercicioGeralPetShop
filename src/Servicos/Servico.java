package Servicos;

import Animais.Animal;

public abstract class Servico {
private String descricao;
private double duracao;
    public abstract Animal calcularCusto(Animal animal);


}
