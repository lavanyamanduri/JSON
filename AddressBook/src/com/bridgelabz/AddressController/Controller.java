package com.bridgelabz.AddressController;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;

import com.bridgelabz.AddressService.AddressImplement;
import com.bridgelabz.Utility.Utility;

public class Controller {
	public static void main(String[] args) throws JSONException, IOException, ParseException, org.json.simple.parser.ParseException {
		// TODO Auto-generated method stub
String a=null;
AddressImplement obj=new AddressImplement();
do
{
	int ch;
	System.out.println();
	System.out.println("1. Add a new Address Book");
	System.out.println("2. Open an existing Address Book");
	System.out.println("3. Exit");
	
	System.out.println("Enter your choice");
	ch=Utility.readInt();
	switch(ch)
  	{
	case 1: try
	        { 
		     obj.addRecord();			     
	         obj.printRecord();
	        }
        	catch(Exception e)
	        {
		     e.printStackTrace();
			}
		     
	         break;
	case 2:  System.out.print("Enter the First Name :");
	         String fname=Utility.readString();
	         boolean b=obj.match(fname);
	         if(b==false)
	         {
	        	 System.out.println("Record does not exist");
	         }
	         else
		     if(b==true)
		     {
		     System.out.println("The Record exists");
		     obj.printRecord();
		     System.out.println();
		     System.out.println("1. For Deleting the Record");
		     System.out.println("2. For Updating the Record");
		     System.out.println("Enter your choice");
		     int choice=Utility.readInt();
		     switch(choice)
		     {
		     case 1: obj.deleteRecord(fname);
		             System.out.println("The Record has been deleted");
		             break;
		             
		     case 2: obj.updateRecord(fname);
		             System.out.println("The Record has been updated");
		             break;
		     default:System.out.println("Wrong Choice entered");
		     }
		     }
		     else
		     {
		       System.out.println("Record does not exist");
		     }
		     break;

	case 3: System.exit(0);
	        break;
	default: System.out.println("Wrong Choice!!");
	       System.out.println("Do you wish to continue(y/n)");
	     a=Utility.readString();
  	}
   }
   while(a!="n");
}
}
