/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Inventory extends Organization{
    private int stock;
    private int finalStock;
    private int giveAway;
    private RecordList recordList;

    public int getFinalStock() {
        return finalStock;
    }

    public void setFinalStock(int finalStock) {
        this.finalStock = finalStock;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getGiveAway() {
        return giveAway;
    }

    public void setGiveAway(int giveAway) {
        this.giveAway = giveAway;
    }
    
    public RecordList getRecordList() {
        return recordList;
    }

    public void setRecordList(RecordList recordList) {
        this.recordList = recordList;
    }
    
    public int totalFoodDonated(int month){
        int donation=recordList.totalDonation(month);
        return donation;
      //  return 30;
    }
            
    public int totalFoodDonated(){
        int donation=recordList.totalDonation();
        return donation;
    }
    
    public int totalFoodGivenAway(int month){
        int donation=recordList.totalGiveAway(month);
      //  return 30;
        return donation;
    }
            
    public int totalFoodGivenAway(){
        int donation=recordList.totalGiveAway();
        return donation;
    }
    
    
    
    public Inventory(){
        super(Organization.Type.Inventory.getValue());
        recordList=new RecordList();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new InventoryManagerRole());
        return roles;
    }
    
}
