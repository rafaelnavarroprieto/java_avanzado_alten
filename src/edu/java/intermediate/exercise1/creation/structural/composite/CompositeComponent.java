package edu.java.intermediate.exercise1.creation.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent extends AbstractComponent{

    private List<AbstractComponent> children;

    public CompositeComponent(String name, String type) {
        super(name, type);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(AbstractComponent component) {
        this.children.add(component);
    }

    @Override
    public AbstractComponent get(int index) {
        return this.children.get(index);
    }

    @Override
    public void remove(AbstractComponent component) {
        this.children.remove(component);
    }

    @Override
    public int countByType(String type) {
        int count = 0;
        for (AbstractComponent comm: this.children) {
            if(comm.type.equalsIgnoreCase(type)){
                count++;
            }else if (comm instanceof CompositeComponent){
                count += comm.countByType(type);
            }
        }
        return count;
    }
}
