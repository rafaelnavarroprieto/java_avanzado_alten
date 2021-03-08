package edu.java.intermediate.exercise1.creation.abstractFactory;

public class AndroidFamilyProductFactory implements ProductAbstractFactory{
    @Override
    public Product1 product1() {
        return new GalaxyTab();
    }

    @Override
    public Product2 product2() {
        return null;
    }
}
