package edu.java.intermediate.exercise1.creation.structural.behavior.observer;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private double amount;

    private List<WalletClientObserver> observer;

    public Wallet() {
        this.observer = new ArrayList<>();
    }

    public void notifyAllObserver(){
        for (WalletClientObserver observer: this.observer) {
            observer.update();
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
        this.notifyAllObserver();
    }

    public void attachObserver(WalletClientObserver observer){
        this.observer.add(observer);
    }
}
