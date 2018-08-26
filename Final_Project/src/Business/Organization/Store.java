/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OfficeManagerRole;
import Business.Role.Role;
import Business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Apurva Sawant
 */
public class Store extends Organization {
   
    private String name;
    private String location;
    private int  stock;
    private double longitude;
    private double latitude;
    private RecordList recordList;
    private int finalStock;
    private int giveAway;
    
    
    public Store() {
        super(Organization.Type.Store.getValue());
        recordList=new RecordList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFinalStock() {
        return finalStock;
    }

    public void setFinalStock(int finalStock) {
        this.finalStock = finalStock;
    }

    public int getGiveAway() {
        return giveAway;
    }

    public void setGiveAway(int giveAway) {
        this.giveAway = giveAway;
    }

    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String toString(){
        return name;
    }

    public RecordList getRecordList() {
        return recordList;
    }

    public void setRecordList(RecordList recordList) {
        this.recordList = recordList;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new StoreManagerRole());
        return roles;
    }
    
    
}
