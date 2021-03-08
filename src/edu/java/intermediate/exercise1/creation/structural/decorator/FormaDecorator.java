package edu.java.intermediate.exercise1.creation.structural.decorator;

public abstract class FormaDecorator implements Forma{

    private Forma forma;

    protected String colorBorde;

    protected String colorFondo;

    public FormaDecorator(Forma forma) {
        this.forma = forma;
    }

    @Override
    public void mostrar() {
        this.forma.mostrar();
        if (this.colorFondo != null){
            System.out.println("Fondo es de color" + this.colorBorde);
        }

        if (this.colorBorde != null){
            System.out.println("Borde es de color" + this.colorBorde);
        }
    }
}
