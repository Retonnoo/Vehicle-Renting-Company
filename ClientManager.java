package com.mycompany.main;

import java.util.ArrayList;

public class ClientManager {
  private ArrayList<Client> clients = new ArrayList<>();

    //add client using arraylist
    public void addClient(Client client){
        clients.add(client);
    }

    //search client by id number
    public Client searchClient(int id) {
        for (Client c : clients) {
            if (c.getClientId() == id) {
                return c;
            }
        }

        return null;
    }

    public void displayAllClients(){
        if(clients.isEmpty()){
            System.out.println("No Clients Found!");
        }

        for(Client c : clients){
            System.out.println(c);
        }
    }

    //All methods below for UPDATE order
    //next 3 methods are shared between both indiv and corpo classes, if there was an update for any of name,address or phone it's gonna return true, else false
    public boolean updateClientName(int id,String newName){
        Client c = searchClient(id);

        if(c == null)
            return false;

        c.setClientName(newName);
        return true;
    }

    public boolean updateClientAddress(int id , String newAddress){
        Client c = searchClient(id);

        if(c == null)
            return false;

        c.setAddress(newAddress);
        return true;
    }

    public boolean updateClientPhone(int id , String newPhone){
        Client c = searchClient(id);

        if(c == null)
            return false;

        c.setPhone(newPhone);
        return true;
    }

    //the next 2 methods for the indiv info
    public boolean updateIndividualDrivingLicense(int id , String newdrivingLicens){
        Client c = searchClient(id);

        if(c == null)
            return false;

        if(!(c.isIndividual()))
            return false;

        ((IndividualClient)c).setDrivingLicens(newdrivingLicens);

        return true;
    }

    public boolean updateIndividualBirthDate(int id , String newbirthDate){
        Client c = searchClient(id);

        if(c == null)
            return false;

        if(!(c.isIndividual()))
            return false;

        ((IndividualClient)c).setBirthDate(newbirthDate);

        return true;
    }

    public boolean updateCorporateCommercialRegister(int id , String newCommercialRegister){
        Client c = searchClient(id);

        if(c == null)
            return false;

        if(c.isIndividual())
            return false;

        ((CorporateClient)c).setCommercialRegister(newCommercialRegister);

        return true;
    }


    public boolean updateCorporateDiscountRate(int id , double newDiscountRate){

        Client c = searchClient(id);

        if(c == null)
            return false;

        if(c.isIndividual())
            return false;

        ((CorporateClient)c).setDiscountRate(newDiscountRate);

        return true;
    }

}
