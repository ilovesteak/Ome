package com.example.michellenguyen.ome;

import java.util.ArrayList;
/**
 * Created by Christopher on 1/29/16.
 */
public class Group {
    private int groupID;
    private String groupName;
    private ArrayList<Member> members;
    private ArrayList<Payment> paymentHistory;

    public Group(int ID, String name, Member creator){
        groupID = ID;
        groupName = name;
        members.add(creator);
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
