/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Donor.Donor;
import Business.Donor.DonorDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MainCenterEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Store;
import Business.Organization.StoreChain;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
//import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private Date currentDate;
    private DonorDirectory donorDiresctory;
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business= new EcoSystem();
        }
        return business;
    }

    public DonorDirectory getDonorDiresctory() {
        return donorDiresctory;
    }

    public void setDonorDiresctory(DonorDirectory donorDiresctory) {
        this.donorDiresctory = donorDiresctory;
    }
    
    
    private EcoSystem(){
        super(null);
        networkList=new ArrayList();
        donorDiresctory=new DonorDirectory();
    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }

    public int getDonation(int month){
        int totalDonation=0;
        for(Network network: networkList){
             totalDonation+=network.donationByNetwork(month);
          }
        return totalDonation;
    }
    
    public int getDonation(String city){
        int totalDonation=0;
        for(Network network: networkList){
            if(network.getName().equalsIgnoreCase(city))
             totalDonation+=network.donationByNetwork();
          }
        return totalDonation;
    }
    
    public HashMap<String, Integer> giveAcrossStores(String city){
        HashMap<String, Integer> hmap=null;
        
         for(Network network: networkList){
            if(network.getName().equalsIgnoreCase(city)){
//              for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
//                 if(enterprise instanceof MainCenterEnterprise)
//                     for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
//                        if(org instanceof StoreChain){
//                          for(Store store:((StoreChain) org).getStoreChain()){
//                            store.
                hmap=network.giveAwayByNetwork();

              }
         }
         return hmap;
      }
    
    public int getGiveAwayAmount(int month){
        int totalDonation=0;
        for(Network network: networkList){
             totalDonation+=network.giveAwayByNetwork(month);
          }
        return totalDonation;
    }
    
     public int getDecomposition(){
        int totalDonation=0;
        for(Network network: networkList){
             totalDonation+=network.decompositionByNetwork();
          }
        return totalDonation;
    }
    
    public int calculatePercentGiveAway(){
        int totalDonation=donorTypeDonation("Individual")+donorTypeDonation("Hotel")+donorTypeDonation("Event");
        int totalGiveAway=getGiveAwayAmount(9)+getGiveAwayAmount(10)+getGiveAwayAmount(11);
        return (totalGiveAway*100)/totalDonation;
    }
    
    public int calculatePercentDecomposition(){
        int totalDonation=donorTypeDonation("Individual")+donorTypeDonation("Hotel")+donorTypeDonation("Event");
        int totalDecomposition=getDecomposition();
        return (totalDecomposition*100)/totalDonation;
    }
    
    
    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public int donorTypeDonation(String type){
        int donation=0;
        for(Donor donor: donorDiresctory.getDonorList()){
            if(donor.getType().equalsIgnoreCase(type)){
               donation+= donor.getDonationAmount();
            }
            
        }
        return donation;
    }
}
