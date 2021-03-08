package edu.java.intermediate.exercise1.creation.builder;

public class BankProduct {

    private String id;
    private String acocuntNumber;
    private String cardNumber;
    private String customer;
    private double amount;
    private double rate;
    private double tax;

    private BankProduct(String id, String acocuntNumber, String cardNumber, String customer, double amount, double rate, double tax) {
        this.id = id;
        this.acocuntNumber = acocuntNumber;
        this.cardNumber = cardNumber;
        this.customer = customer;
        this.amount = amount;
        this.rate = rate;
        this.tax = tax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcocuntNumber() {
        return acocuntNumber;
    }

    public void setAcocuntNumber(String acocuntNumber) {
        this.acocuntNumber = acocuntNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "BankProduct{" +
                "id='" + id + '\'' +
                ", acocuntNumber='" + acocuntNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", customer='" + customer + '\'' +
                ", amount=" + amount +
                ", rate=" + rate +
                ", tax=" + tax +
                '}';
    }

    public static class Builder {

        private String id;
        private String acocuntNumber;
        private String cardNumber;
        private String customer;
        private double amount;
        private double rate;
        private  double tax;

        public Builder() {
        }

        public Builder withId(String id){
            this.id = id;
            return this;
        }

        public Builder withAcocuntNumber(String acocuntNumber){
            this.acocuntNumber = acocuntNumber;
            return this;
        }

        public Builder withCardNumber(String cardNumber){
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder withCustomer(String customer){
            this.customer = customer;
            return this;
        }

        public Builder withAmount(Double amount){
            this.amount = amount;
            return this;
        }

        public Builder withRate(Double rate){
            this.rate = rate;
            return this;
        }

        public Builder withTax(Double tax){
            this.tax = tax;
            return this;
        }

        public BankProduct build(){
            return new BankProduct(this.id, this.acocuntNumber, this.cardNumber, this.customer, this.amount, this.rate, this.tax);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id='" + id + '\'' +
                    ", acocuntNumber='" + acocuntNumber + '\'' +
                    ", cardNumber='" + cardNumber + '\'' +
                    ", customer='" + customer + '\'' +
                    ", amount=" + amount +
                    ", rate=" + rate +
                    ", tax=" + tax +
                    '}';
        }
    }
}
