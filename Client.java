package com.mycompany.main;

public abstract class Client {

    //    Parent for all Clients (essential attributes for all Clients)

    private int clientId;
    private String clientName;
    private String Address;
    private String Phone;

    public Client(int clientId, String clientName, String address, String phone) {
        this.clientId = clientId;
        this.clientName = clientName;
        Address = address;
        Phone = phone;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    //this abstract method to return 0 if the client was individual and a some discount for the corporate
    public abstract double getDiscount();

    public abstract boolean isIndividual();// to determine the type of an instence

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}


