package com.mycompany.main;

public class CorporateClient extends Client {
    private String commercialRegister;
    private double discountRate;

    public CorporateClient(int clientId, String clientName, String address, String phone, String commercialRegister, double discountRate) {
        super(clientId, clientName, address, phone);
        this.commercialRegister = commercialRegister;
        this.discountRate = discountRate;
    }

    public String getCommercialRegister() {
        return commercialRegister;
    }

    public void setCommercialRegister(String commercialRegister) {
        this.commercialRegister = commercialRegister;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double  getDiscount(){
        return discountRate;
    }

    @Override
    public boolean isIndividual(){
        return false;
    }

    @Override
    public String toString() {
        return "CorporateClient{" +
                "commercialRegister='" + commercialRegister + '\'' +
                ", discountRate=" + discountRate +
                '}';
    }

}
