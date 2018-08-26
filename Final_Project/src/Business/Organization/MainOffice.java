/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OfficeManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class MainOffice extends Organization{
    
    public MainOffice(){
        super(Organization.Type.MainOffice.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OfficeManagerRole());
        return roles;
    }
    
}
