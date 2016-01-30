package com.example.michellenguyen.ome;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Christopher on 1/29/16.
 */

public class Payment {
    private Member Payer, Receiver;
    private double value;
    private Date dateMade;

    public Payment(Member p, Member r, double v){
        dateMade = new Date();
        Payer = p;
        Receiver = r;
        value = v;
    }

    public int attemptPayment(){
    	if(Payer.getFunds() < value){
    		//INVALID FUNDS
    		return 0;
    	}else{
    		Receiver.addFunds(value);
    		return 1;
    	}
    }
    
    public Member getPayer(){
    	return Payer;
    }
    
    public Member getReceiver(){
    	return Receiver;
    }
    
    public String getDate(){
    	return dateMade.toString();
    }
}
