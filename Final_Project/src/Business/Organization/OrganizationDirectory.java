/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization = new Lab();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.LabAssistant.getValue())){
            organization = new LabAssistant();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.StoreChain.getValue())){
              organization = new StoreChain();
              organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MainOffice.getValue())){
            organization = new MainOffice();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Inventory.getValue())){
            organization = new Inventory();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Composting.getValue())){
            organization = new Composting();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Transport.getValue())){
            organization = new Transport();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Driver.getValue())){
            organization = new Driver();
            organizationList.add(organization);
        }
        return organization;
    }
    
    
}
