//package com.example.michellenguyen.ome;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Christopher on 1/29/16.
 */
public class Member {

    private int memberID;
    private String name;
    private double funds;
    private ArrayList<Payment> paymentList;
    private short permissions;

    //Permissions codes: 0 = regular user, 1 = admin
    public Member(String nm, double initBalance, short perm){
        generateID();
        name = nm;
        funds = initBalance;
        DecimalFormat df = new DecimalFormat("#.00");
        permissions = perm;
    }

    private void generateID(){
        memberID = (int)(System.currentTimeMillis()%1000);
        System.out.println(memberID);
    }
    
    public int makePayment(Payment p){
    	p.attemptPayment();
    	return 0;
    }

	public int getID() {
		return memberID;
	}
	
	public short getPermissions(){
		return permissions;
	}
	
	public double getFunds(){
		return funds;
	}
	
	public void addFunds(double value){
		funds += value;
	}

}
