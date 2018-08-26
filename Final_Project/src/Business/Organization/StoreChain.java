/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OfficeManagerRole;
import Business.Role.Role;
import Business.Role.StoreChainManagerRole;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Apurva Sawant
 */
public class StoreChain extends Organization{

    private ArrayList<Store> storeChain;
    public StoreChain() {
        super(Organization.Type.StoreChain.getValue());
        storeChain= new ArrayList();
    }

    public ArrayList<Store> getStoreChain() {
        return storeChain;
    }

    public void setStoreChain(ArrayList<Store> storeChain) {
        this.storeChain = storeChain;
    }

    public int donationAcrossStores(int month){
        int totalDonation=0;
        for(Store store:storeChain)
        {
         totalDonation+=store.getRecordList().totalDonation(month);
        }   
        return totalDonation;
    }    
    
     public int donationAcrossStores(){
        int totalDonation=0;
        for(Store store:storeChain)
        {
         totalDonation+=store.getRecordList().totalDonation();
        }   
        return totalDonation;
    } 
    
     public int giveAwayAcrossStores(int month){
        int totalGiveAway=0;
        for(Store store:storeChain)
        {
            System.out.println("in store"+store.getName());
         totalGiveAway+=store.getRecordList().totalGiveAway(month);
        }   
        return totalGiveAway;
    }    
    
     public HashMap<String, Integer> giveAwayAcrossStores(){
       HashMap<String, Integer> hmap = new HashMap<String, Integer>();

      /*Adding elements to HashMap*/
     // hmap.put(12, "Chaitanya");
        for(Store store:storeChain)
        {
            hmap.put(store.getName(),store.getRecordList().totalGiveAway());
         
        }   
        return hmap;
    }
     
    public void addStore(Store store){
        storeChain.add(store);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new StoreChainManagerRole());
        return roles;
    }
    
}
