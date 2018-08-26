/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Records {
    private Date requestDate;
    private int foodDonated;
    private int foodGiven;
    private int foodDecomposed;
    
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public int getFoodDonated() {
        return foodDonated;
    }

    public int getFoodDecomposed() {
        return foodDecomposed;
    }

    public void setFoodDecomposed(int foodDecomposed) {
        this.foodDecomposed = foodDecomposed;
    }
    

    public void setFoodDonated(int foodDonated) {
        this.foodDonated = foodDonated;
    }

    public int getFoodGiven() {
        return foodGiven;
    }

    public void setFoodGiven(int foodGiven) {
        this.foodGiven = foodGiven;
    }
    
    
}
