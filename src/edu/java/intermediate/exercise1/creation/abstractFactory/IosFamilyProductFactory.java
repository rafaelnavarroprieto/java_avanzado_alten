package edu.java.intermediate.exercise1.creation.abstractFactory;

public class IosFamilyProductFactory implements ProductAbstractFactory{

    @Override
    public Product1 product1() {
        return new Ipad();
    }

    @Override
    public Product2 product2() {
        return new IphoneX();
    }
}
