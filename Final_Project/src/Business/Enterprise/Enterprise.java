/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author HP
 */
public abstract class Enterprise extends Organization{
    
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        MainCenter("Main Center"), InspectionCenter("Inspection Center"), CompostingCenter("Composting Center"), TransportAgency("Transport Agency");
        
        private String value;
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        @Override
        public String toString(){
            return value;
        }
    }

    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
    
}
