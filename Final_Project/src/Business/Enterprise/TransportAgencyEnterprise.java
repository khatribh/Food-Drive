/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aadesh Randeria
 */
public class TransportAgencyEnterprise extends Enterprise {

    public TransportAgencyEnterprise(String name) {
        super(name, EnterpriseType.TransportAgency);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
}
