/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CompostManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aadesh Randeria
 */
public class Composting extends Organization {
    private int itemsComposed;
    private RecordList recordList;
    public Composting() {
        super(Organization.Type.Composting.getValue());
        recordList=new RecordList();
    }

    public RecordList getRecordList() {
        return recordList;
    }

    public void setRecordList(RecordList recordList) {
        this.recordList = recordList;
    }
    
    public int getItemsComposed() {
        return itemsComposed;
    }

    public void setItemsComposed(int itemsComposed) {
        this.itemsComposed = itemsComposed;
    }
    
    public int totalFoodDecomposed(){
        int donation=recordList.totalDecomposition();
        return donation;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CompostManagerRole());
        return roles;
    }
    
}
