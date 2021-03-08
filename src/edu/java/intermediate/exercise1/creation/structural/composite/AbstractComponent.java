package edu.java.intermediate.exercise1.creation.structural.composite;

public abstract class AbstractComponent {

    protected String name;

    protected String type;

    public AbstractComponent(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void add(AbstractComponent component);

    public abstract AbstractComponent get(int index);

    public abstract void remove(AbstractComponent component);

    public abstract int countByType(String type);
}