package com.bridgelabz.Functional;

/******************************************************************************
 *  Purpose: Program is written for 2D Array .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   13-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class ArrayTwoDimentional {
	public static void main(String[] args) {

		int n=Utility.readInt();
double[][] b=new double[10][10]; 
int m=Utility.readInt();
boolean[][] c=new boolean[10][10];
int[][] a =new int[10][10];
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		
		a[i][j]=Utility.readInt();
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		b[i][j]=Utility.readdouble();
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		c[i][j]=Utility.readBoolean();
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		System.out.println(a[i][j]);
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		System.out.println(b[i][j]);
	}
for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	{
		System.out.println(c[i][j]);
	}
	}
}
