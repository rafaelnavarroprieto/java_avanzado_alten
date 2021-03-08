package edu.java.intermediate.exercise1.creation.structural.behavior.observer;

public class DesktopWalletClientObserver implements WalletClientObserver{

    private Wallet state;

    public DesktopWalletClientObserver(Wallet state) {
        this.state = state;
        this.state.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("DesktopWalletClientObserver: Se han realizado cambios en el wallet");
    }
}
