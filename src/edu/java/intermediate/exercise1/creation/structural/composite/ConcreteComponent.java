package edu.java.intermediate.exercise1.creation.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteComponent extends AbstractComponent{

    private List<AbstractComponent> children;

    public ConcreteComponent(String name, String type) {
        super(name, type);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(AbstractComponent component) {
        System.out.println("Add to list of children");
    }

    @Override
    public AbstractComponent get(int index) {
        System.out.println("get the children of list by index");
        return null;
    }

    @Override
    public void remove(AbstractComponent component) {
        System.out.println("Remove to list of children");
    }

    @Override
    public int countByType(String type) {
        return 0;
    }
}
