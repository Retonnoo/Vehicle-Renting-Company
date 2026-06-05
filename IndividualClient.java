package com.mycompany.main;

public class IndividualClient extends Client {

    private String drivingLicens;
    private String birthDate;

    public IndividualClient(int clientId, String clientName, String address, String phone, String drivingLicens, String birthDate) {
        super(clientId, clientName, address, phone);
        this.drivingLicens = drivingLicens;
        this.birthDate = birthDate;
    }

    public String getDrivingLicens() {
        return drivingLicens;
    }

    public void setDrivingLicens(String drivingLicens) {
        this.drivingLicens = drivingLicens;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public double getDiscount(){
        return 0;
    }

    @Override
    public boolean isIndividual(){
        return true;
    }


    @Override
    public String toString() {
        return "IndividualClient{" +
                "drivingLicens='" + drivingLicens + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}



