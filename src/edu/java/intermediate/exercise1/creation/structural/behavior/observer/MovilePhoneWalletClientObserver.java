package edu.java.intermediate.exercise1.creation.structural.behavior.observer;

public class MovilePhoneWalletClientObserver implements WalletClientObserver{

    private Wallet state;

    public MovilePhoneWalletClientObserver(Wallet state) {
        this.state = state;
        this.state.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("MovilePhoneWalletClientObserver: Se han realizado cambios en el wallet");
    }
}
