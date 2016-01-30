//package com.example.michellenguyen.ome;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Christopher on 1/29/16.
 */
public class Group {
    private int groupID;
    private String groupName;
    private HashMap<Integer, Member> members;
    private ArrayList<Payment> paymentHistory;

    public Group(String name, Member creator){
        generateID();
        groupName = name;
        members.put(creator.getID(), creator);
    }
    
    public Group(){
    	generateID();
    	groupName = "Default Name";
    	members = new HashMap<Integer, Member>(0);
    	paymentHistory = new ArrayList<Payment>(1);
    }

    //Using millis as pseudo hash. Should be collission-less
    private void generateID(){
        groupID = (int)(System.currentTimeMillis()%1000);
        System.out.println(groupID);
    }
    
    public int addMember(Member mem){
    	try{
    		members.put(mem.getID(), mem);
    		return 1;
    	}catch(NullPointerException e){
    		return 0;
    	}
    	
    }
    
    //1 = success, 0 = clearance failure
    public int setGroupName(String name, Member clearance){
    	if(clearance.getPermissions() == 1){
    		groupName = name;
    		return 1;
    	}else{
    		return 0;
    	}
    }

    public int getGroupID(){
        return groupID;
    }

    public String getGroupName(){
        return groupName;
    }

    public Member getMember(int membID){
        return members.get(membID);
    }
}
