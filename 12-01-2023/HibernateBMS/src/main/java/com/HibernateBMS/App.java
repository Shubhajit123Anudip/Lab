package com.HibernateBMS;

import java.util.Scanner;

import HibernateBSM.DaoImpl.CustomerDaoImpl;



public class App 
{
    public static void main( String[] args )
    {
    	CustomerDaoImpl d=new CustomerDaoImpl();
        char c;
        do {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Press 1 for add Account \n Press 2 for display Account \n"
        			+"Press 3 for update \n Press 4 for delete \n Press 5 for exit");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:d.openAcc();
        	break;
        	case 2:d.fetchAcc();
        	break;
        	case 3:d.updateAcc();
        	break;
        	case 4:d.deleteAcc();
        	break;
        	case 5:System.exit(0);
        	break;
        	default:System.out.println("Invalid choice!");
        	}
        	System.out.println("Do you want to continue? Y/N");
        	c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        CustomerDaoImpl dao=new CustomerDaoImpl();
        do {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Press 1 for Open Account \n Press 2 for Display Account \n"
        			+"Press 3 for Update Account \n Press 4 for Delete Account \n Press 5 for Exit");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:dao.openAcc();
        	break;
        	case 2:dao.fetchAcc();
        	break;
        	case 3:dao.updateAcc();
        	break;
        	case 4:dao.deleteAcc();
        	break;
        	case 5:System.exit(0);
        	break;
        	default:System.out.println("Invalid choice!");
        	}
        	System.out.println("Do you want to continue? Y/N");
        	c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
    }
}
