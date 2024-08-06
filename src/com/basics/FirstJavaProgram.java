package com.basics;

import java.util.Map;

public class FirstJavaProgram {
	
	public static void main(String[] args) {
		//shortcut syso+ctrl+spacebar
		
		System.out.println("Welcoem to first java program");
		System.out.println(1);
		System.out.println("abc");
		System.out.print(4);
		System.out.println(true);
		System.out.println(30.4);
		System.err.println("Error statement loooks this way");
		
		System.out.println(System.getenv());
		System.out.println(System.getenv("JAVA_HOME"));
		
		//current director path/project path
		System.out.println(System.getProperty("user.dir"));
		
		Map<String,String>envMap= System.getenv();
		System.out.println("Enviromental map is :"+envMap);
		
		
	//	DefaultDemo dobj = new DefaultDemo();
		
		
	}

}
