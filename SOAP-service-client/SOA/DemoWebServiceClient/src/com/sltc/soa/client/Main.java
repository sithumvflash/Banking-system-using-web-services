package com.sltc.soa.client;

import com.sltc.soa.client.stub.DemoWS;
import com.sltc.soa.client.stub.DemoWSService;

import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
    {
//         URL url = new URL("http://demowebservice.com:8080/currencyservice?wsdl");
//        DemoWSService demoWSService = new DemoWSService(url); 

        DemoWSService demoWSService = new DemoWSService();
        DemoWS demoWSPort = demoWSService.getDemoWSPort();
        Scanner scan = new Scanner(System.in);

        if (demoWSPort.addUser ("2029",1000)){
            System.out.println("Account created successfully");

        }
        if (demoWSPort.addUser ("2012",1500)){
            System.out.println("Account created successfully");

        }
        if (demoWSPort.addUser ("2092",3000)){
            System.out.println("Account created successfully");

        }
        if (demoWSPort.addUser ("2021",5000)){
            System.out.println("Account created successfully");

        }

        String str;
        String userName;
        float availableBal;
        while(true) {
            System.out.println("Enter your user account");
            userName = scan.nextLine();
            if(demoWSPort.userChecking(userName)){
                System.out.println("User Authenticated");
                break;

            }
        }
        while(true){
            System.out.println("Account Balance"+demoWSPort.balanceChecking(userName));
            System.out.println("A. Deposit\n" +
                                "B. Withdraw\n" +
                                "C. Transfer\n" +
                                "D. Exit");
            System.out.println("Enter the char: ");
            String keyMenu = scan.nextLine();
            if (keyMenu.toUpperCase().equals("A")){
                System.out.println("Enter the deposit amount:");

                availableBal = demoWSPort.deposit(gettingFloat(),userName);
                System.out.println("Updated account balance: rs: "+availableBal+"/=");

            }else if(keyMenu.toUpperCase().equals("B")){
                System.out.println("Enter the withdraw amount:");

                availableBal = demoWSPort.withdraw(gettingFloat(),userName);
                if (availableBal !=-1){
                    System.out.println("Updated account balance: rs: "+availableBal+"/=");
                }else{
                    System.out.println("Insufficient balance");

                }
            } else if (keyMenu.toUpperCase().equals("C")) {
                System.out.println("Enter transfer user account : ");
                String otherAccount = scan.nextLine();
                System.out.println("Enter the transfer amount:");

                availableBal = demoWSPort.transfer(gettingFloat(),userName,otherAccount);
                if (availableBal != -1){

                    System.out.println("Updated account balance: rs: "+availableBal+"/=");
                }else{
                    System.out.println("Insufficient balance");

                }

            } else if (keyMenu.toUpperCase().equals("D")) {
                break;
            }else{
                System.out.println("Enter Valid Character!");
            }


        }










    }
    private static float gettingFloat()
    {
        float getfloat = 0;
        boolean numberFound = false;
        Scanner scan = new Scanner( System.in );
        do
        {

            String inputStr = scan.next();
            try
            {
                getfloat = Float.parseFloat( inputStr );
                numberFound = true;
            }
            catch( Exception e )
            {
                System.out.println( "Invalid input " + inputStr + ". Please enter a valid amount: " );
            }

        } while( !numberFound );
        return getfloat;
    }

}



