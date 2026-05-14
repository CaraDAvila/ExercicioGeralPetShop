package Servicos;

import Animais.Animal;

public class Atendimento {
    private Animal animal;
    private Servico servico;

    public Atendimento(Animal animal, Servico servico) {
        this.animal = animal;
        this.servico = servico;
    }
}
