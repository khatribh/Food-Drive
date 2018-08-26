/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DriverRole;
import Business.Role.Role;
import Business.Role.TransportManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Aadesh Randeria
 */
public class Transport extends Organization {
    
    public Transport() {
        super(Organization.Type.Transport.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportManagerRole());
        return roles;
    }
    
}
