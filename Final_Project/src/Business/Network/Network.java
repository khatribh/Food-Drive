/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.CompostingCenterEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.MainCenterEnterprise;
import Business.Organization.Composting;
import Business.Organization.Inventory;
import Business.Organization.Organization;
import Business.Organization.StoreChain;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    public String toString(){
        return name;
    }   
    
    public int donationByNetwork(int month){
        int donation=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof MainCenterEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 if(org instanceof Inventory){
                   donation+=((Inventory) org).totalFoodDonated(month);
                 }
                 if(org instanceof StoreChain){
                   donation+=((StoreChain) org).donationAcrossStores(month);
                 }
             }
           }
        }
        return donation;
    }
     
    public int donationByNetwork(){
        int donation=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof MainCenterEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 if(org instanceof Inventory){
                   donation+=((Inventory) org).totalFoodDonated();
                 }
                 if(org instanceof StoreChain){
                   donation+=((StoreChain) org).donationAcrossStores();
                 }
             }
           }
        }
        return donation;
    }
    
    public int decompositionByNetwork(){
        int decomposition=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof CompostingCenterEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 decomposition+=((Composting)org).totalFoodDecomposed();
             }
           }
        }
        return decomposition;
    }
    
    public int giveAwayByNetwork(int month){
        int donation=0;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof MainCenterEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                 if(org instanceof Inventory){
                   donation+=((Inventory) org).totalFoodGivenAway(month);
                 }
                 if(org instanceof StoreChain){
                   donation+=((StoreChain) org).giveAwayAcrossStores(month);
                 }
             }
           }
        }
        return donation;
    }
     
    public HashMap<String, Integer> giveAwayByNetwork(){
        HashMap<String, Integer> hmap=null;
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseList()){
           if(enterprise instanceof MainCenterEnterprise){
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                
                 if(org instanceof StoreChain){
                   hmap=((StoreChain) org).giveAwayAcrossStores();
                 }
             }
           }
        }
        return hmap;
    }
}
