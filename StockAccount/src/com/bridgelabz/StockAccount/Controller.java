package com.bridgelabz.StockAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class Controller {
	JSONArray array1=new JSONArray();
	JSONArray array2=new JSONArray();
	private static Customer obj1;
	private static CompanyShares obj2; 
	DoublyLinkedList list1=null;
	
	
	public static Customer setObj1()
	{
		obj1=new Customer();
		return obj1;
	}
	public static CompanyShares setObj2()	
	{

		obj2=new CompanyShares();
		return obj2;
	}
	public double valueOf() {
		
		return 0;
	}

	public boolean buy(int amount, String symbol,String name) throws IOException, JSONException, ParseException, org.json.simple.parser.ParseException 
	 
		{
			
			  System.out.println("Enter the Customer File name :");
			 
			String st1=Util.readString();
			System.out.println("Enter the Company Share File name : ");
			String st2=Util.readString();
			File f1=new File(st1);
			File f2=new File(st2);
			
			FileReader fr1=new FileReader(f1);
			FileReader fr2=new FileReader(f2);
			 JSONObject ob1=null;
			  JSONObject ob2=null;
				Integer prod=0;
				boolean flag=false;
				try
				{
				
				JSONParser parser1=new JSONParser();
				array1=new JSONArray(parser1.parse(fr1).toString());
				JSONParser parser2=new JSONParser();
			    array2=new JSONArray(parser2.parse(fr2).toString());
				for(int i=0;i<array2.length();i++)
				{
				  ob1=array2.getJSONObject(i);
			     if(ob1.get("Share Symbol").equals(symbol))
			     {
			      prod=(Integer)ob1.get("Price Per Share")*(Integer)amount;
			      for(int j=0;j<array1.length();j++)
			      {
			    	  ob2=array1.getJSONObject(j);
			    	  if(ob2.get("Customer name").equals(name) && (int)prod<=(int)ob2.get("Account balance"))
			    	  { 
			    		  System.out.println("Customer found!!!");
			    		  Integer x=(Integer)ob1.get("Number of Shares")-(Integer)amount;
					       ob1.put("Number of Shares",x);
					       flag=true;
			    	  }
			    	  else
			    	  flag=false;  
			    	  if(flag==true)
						{
						for(int k=0;k<array1.length();k++)
						{
						 ob2=array1.getJSONObject(k);
					     if(ob2.get("Customer name").equals(name))
					     {
					     
					    	 Integer x=(Integer)ob2.get("Account balance")-(Integer)prod;
					       ob2.put("Account balance",x);
					      }
						 }			
						}
			    	  }  
			      }
			     
				
				
				}
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					fr2.close();
					fr1.close();
				}
				
			
			
			   File f3=new File("C:\\Users\\Hello\\Desktop:\\custwrite.json");
			   File f4=new File("C:\\Users\\Hello\\Desktop\\sharewrite.json");
		        PrintWriter pw1=new PrintWriter(f3);
		        pw1.write(array1.toString());
		        pw1.flush();
		        pw1.close();	
		        PrintWriter pw2=new PrintWriter(f4);
		        pw2.write(array2.toString());
		        pw2.flush();
		        pw2.close();
				return flag;
		    
		}
	

	


	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addCustomer(File f) throws IOException, JSONException {
		// TODO Auto-generated method stub
		Customer ob1=setObj1();
		System.out.print("Enter the number of Customers you want to add in file : ");
	    int num=Util.readInt();
	    for(int i=0;i<num;i++)
	    {
		System.out.println("Enter the Customer Name :");
		String custname=Util.readString();
		ob1.setCustname(custname);
		System.out.println("Enter the Balance:");
		float custbal=Util.readfloat();
		ob1.setCustbal(custbal);
		list1=new DoublyLinkedList();
		list1.insertAtEnd(ob1);
		JSONObject object=new JSONObject();
        object.put("Customer name",ob1.getCustname());
        object.put("Account balance",ob1.getCustbal());        
      
        
        array1.put(object);
	    }
	    System.out.println("The Linked List has : "+list1.toString()+" elements");
        PrintWriter pw=new PrintWriter(f);
        pw.write(array1.toString());
        pw.flush();
        pw.close();
	
	}

	public void addShares(File f) throws IOException, JSONException {
		// TODO Auto-generated method stub
		CompanyShares ob2=setObj2();
		System.out.println("Enter the number of shares you wish to add in file");
	    int num=Util.readInt();
	    for(int i=0;i<num;i++)
	    {
		System.out.println("Enter the Share Symbol :");
		String symbol=Util.readString();
		ob2.setSymbol(symbol);
		System.out.println("Enter the Number of shares:");
		int number=Util.readInt();
		ob2.setNum(number);
		System.out.println("Enter the Price Per Share : ");
		int price=Util.readInt();
		ob2.setPrice(price);
	    
		
		JSONObject object=new JSONObject();
        object.put("Share Symbol",ob2.getSymbol());
        object.put("Number of Shares",ob2.getNum());
        object.put("Price Per Share",ob2.getPrice());
        array2.put(object);
	    }
        PrintWriter pw=new PrintWriter(f);
        pw.write(array2.toString());
        pw.flush();
        pw.close();
	}
	public void sell(int amt2, String str2, String name) {
		// TODO Auto-generated method stub
		
	}
		
	
	
}
