package edu.java.intermediate.exercise1;

import edu.java.intermediate.exercise1.creation.abstractFactory.*;
import edu.java.intermediate.exercise1.creation.builder.BankProduct;
import edu.java.intermediate.exercise1.creation.singleton.DataSource;
import edu.java.intermediate.exercise1.creation.structural.adapter.AudioSystem;
import edu.java.intermediate.exercise1.creation.structural.adapter.MonoAudioSystem;
import edu.java.intermediate.exercise1.creation.structural.adapter.StereoAudioSystem;
import edu.java.intermediate.exercise1.creation.structural.adapter.StereoMonoAudioSystemWrapper;
import edu.java.intermediate.exercise1.creation.structural.composite.AbstractComponent;
import edu.java.intermediate.exercise1.creation.structural.composite.CompositeComponent;
import edu.java.intermediate.exercise1.creation.structural.composite.ConcreteComponent;

public class app {
    public static void main(String[] args) {

        // singleton pattern

        DataSource ds1 = DataSource.getInstance("address1", "user1", "password1");
        DataSource ds2 = DataSource.getInstance("address2", "user2", "password2");

        System.out.println(ds1.toString());
        System.out.println(ds2.toString());

        // abstract factory pattern

        ProductAbstractFactory paf = new IosFamilyProductFactory();

        Product1 p1 = paf.product1();
        Product2 p2 = paf.product2();

        System.out.println(p1.getDescription());
        System.out.println(p2.getResume());

        ProductAbstractFactory paf2 = new AndroidFamilyProductFactory();

        Product1 pa1 = paf2.product1();

        System.out.println(pa1.getDescription());

        // builder pattern

        BankProduct bk1 = new BankProduct.Builder().withId("1").withAcocuntNumber("1234").withCardNumber("123561").withCustomer("1234").withAmount(12.32).withRate(2.5).withTax(24.34).build();

        System.out.println(bk1.toString());

        BankProduct bk2 = new BankProduct.Builder().withId("2").withAcocuntNumber("4444").withCustomer("4444").withCardNumber("44444").withAmount(44.44).withRate(4.4).withTax(44.44).build();

        System.out.println(bk2.toString());


        // Adapter pattern

        AudioSystem as1 = new MonoAudioSystem();
        as1.play();

        AudioSystem as2 = new StereoAudioSystem();
        as2.play();

        AudioSystem as3 = new StereoMonoAudioSystemWrapper(new MonoAudioSystem());
        as3.play();

        //composite pattern

        CompositeComponent root = new CompositeComponent("root", "root");
        
        CompositeComponent branch1 = new CompositeComponent("branch1", "branch");
        branch1.add(new ConcreteComponent("hoja1", "hoja"));
        branch1.add(new ConcreteComponent("hoja2", "hoja"));

        CompositeComponent branch2 = new CompositeComponent("branch2", "branch");
        branch2.add(new ConcreteComponent("hoja3", "hoja"));
        branch2.add(new ConcreteComponent("hoja4", "hoja"));

        root.add(branch1);
        root.add(branch2);

        System.out.println(root.countByType("hoja"));
        System.out.println(branch1.countByType("hoja"));
        System.out.println(branch2.countByType("hoja"));

    }
}
