/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    public void createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type== Enterprise.EnterpriseType.MainCenter){
            enterprise=new MainCenterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type== Enterprise.EnterpriseType.InspectionCenter){
            enterprise=new InspectionCenterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type== Enterprise.EnterpriseType.CompostingCenter){
            enterprise=new CompostingCenterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type== Enterprise.EnterpriseType.TransportAgency){
            enterprise=new TransportAgencyEnterprise(name);
            enterpriseList.add(enterprise);
        }
       // return enterprise;
    }
    
}
