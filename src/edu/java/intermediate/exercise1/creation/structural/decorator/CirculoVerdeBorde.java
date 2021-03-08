package edu.java.intermediate.exercise1.creation.structural.decorator;

public class CirculoVerdeBorde extends FormaDecorator{

    public CirculoVerdeBorde(Circulo circulo) {
        super(circulo);
        this.colorBorde = "verde";
        this.colorFondo = "verde";
    }
}
