/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aadesh Randeria
 */
public class Driver extends Organization {

    public Driver() {
        super(Organization.Type.Driver.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DriverRole());
        return roles;
    }
    
}
