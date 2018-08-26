/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
//import Business.Organization.AdminOrganization;
//import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author neeraj
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("FoodDrive");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
//    public static Business configure(){
//        
//        Business business = Business.getInstance();
//        
//        AdminOrganization adminOrganization = new AdminOrganization();
//        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
//        
//        Employee employee = new Employee();
//        employee.setName("Neeraj Rajput");
//        
//        UserAccount account = new UserAccount();
//        account.setUsername("admin");
//        account.setPassword("admin");
//        account.setRole(new AdminRole());
//        account.setEmployee(employee);
//        
//        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
//        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
//        
//        return business;
//    }
//    
}
