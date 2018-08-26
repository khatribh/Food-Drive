/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Aadesh Randeria
 */
public class LabAssistantWorkRequest extends WorkRequest {
    private String testResult;
    private UserAccount labAssistantName;
    private int quantity;
    private String location;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getLabAssistantName() {
        return labAssistantName;
    }

    public void setLabAssistantName(UserAccount labAssistantName) {
        this.labAssistantName = labAssistantName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
