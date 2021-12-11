/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bin Bior
 */
public class Bill {
    private int bid;
    private Date dateCreated;
    private double total;
    private Customer cus;
    private ArrayList<BillDetail> billdetails;

    public ArrayList<BillDetail> getBilldetails() {
        return billdetails;
    }

    public void setBilldetails(ArrayList<BillDetail> billdetails) {
        this.billdetails = billdetails;
    }
    
    
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }
}
