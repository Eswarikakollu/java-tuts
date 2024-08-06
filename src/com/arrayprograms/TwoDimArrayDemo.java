package com.arrayprograms;

public class TwoDimArrayDemo {

	
	public static void arrayTwoDim()
	{
		//accessspecifier varname[][] = new accessspecifier[rowsize][colsize];
		String[][] lang=new String[3][2];
		
		lang[0][0]="java";
		lang[0][1]="sele";
		lang[1][0]="ruby";
		lang[1][1]="phyt";
		lang[2][0]="err";
		lang[2][1]="tru";
		for(int i =0;i<lang.length;i++) //rowcount=lang.length;
		{
			for(int j =0;j<lang[0].length;j++) //colcount=lang[0].length;
			{
				System.out.print(lang[i][j] +"\t");
				
			}
			System.out.println( );
		}
	}
	
	public static void main(String[] args) {
		
		arrayTwoDim();
		
	}
}
