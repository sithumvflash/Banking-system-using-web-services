package com.sltc.soa;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import java.util.HashMap;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DemoWS
{
    HashMap<String,Float> UserAccounts = new HashMap<String,Float>();


    @WebMethod
    public boolean addUser(String userAc,float balance){
        //float balance = 1000;
        System.out.println( "Account creation successful, Current Balance" + balance);
        UserAccounts.put(userAc, balance);
        return true;
    }
    @WebMethod
    public boolean userChecking(String userAc){
        return UserAccounts.containsKey(userAc);
    }
    @WebMethod
    public float balanceChecking(String userAc){
        return UserAccounts.get(userAc);
    }

    @WebMethod
    public float deposit(float amount, String accountName){
        //float balance = 1000;
        float balance = UserAccounts.get(accountName);
        balance += amount;
        System.out.println( "Deposit Successful, Current Balance" + balance);
        return balance;
    }

    @WebMethod
    public float withdraw(float amount, String accountName) {

        float balance = UserAccounts.get(accountName);

        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw Successful, Current Balance" + balance);
            return balance;
        }else {
            System.out.println("Insufficient account balance");
            return -1;
        }
    }

    @WebMethod
    public float transfer(float amount, String myAccountName, String accountName){
        float balance = UserAccounts.get(myAccountName);
        if(balance >= amount){
            balance -= amount;
            UserAccounts.put(myAccountName, balance);
            UserAccounts.put(accountName,UserAccounts.get(accountName)+amount);
            System.out.println( "Transfer done, current balance " + balance);
            return balance;
        }else{
            System.out.println("insufficient Balance");
            return -1;
        }
    }

    @WebMethod
    public int substraction(int a, int b){
        int result = a - b;
        System.out.println( a + " - " + b + " = " + result);
        return result;
    }

    public static void main(String[] args){

        Endpoint.publish("http://localhost:8888/DemoWebService", new DemoWS());
        System.out.println("Bank server started successfully");
    }
}
