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
public class CompostManagerWorkRequest extends WorkRequest {
    private String testResult;
    private UserAccount compostManagerName;
    private int quantity;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getCompostManagerName() {
        return compostManagerName;
    }

    public void setCompostManagerName(UserAccount compostManagerName) {
        this.compostManagerName = compostManagerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
