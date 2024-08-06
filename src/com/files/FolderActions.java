package com.files;

import java.io.File;

public class FolderActions {

	
	public static void creatingFolder(String path)
	{
		
		
		File folder = new File(path);//we are moving to that path
		
		if(!folder.exists())   //folder exist avvakapote
		{
			folder.mkdir();
			System.out.println("folder created in this path:"+path);
		}
		
	
		
	}
	
	public static boolean checkFolderExists(String path)
	{
		File folder = new File(path);
		if(folder.exists())
		{
			System.out.println("Folder exists");
		}
		else 
			System.out.println("Folder doesnot exist");
		return folder.exists();
		
	}
	
	public static void renameFolder(String oldpath,String newpath)
	{
		File oldfolder = new File(oldpath);
		File newfolder = new File(newpath);
		
		if(oldfolder.exists())
		{
			oldfolder.renameTo(newfolder);
			System.out.println("rename the folder path is :"+newpath);
		}
		else
			System.out.println("folder doesnot exist to rename");
		
	
	}
	
	public static void deleteFolder(String path)
	{
		File f = new File(path);
		if(f.exists())
		{
			f.delete();
			System.out.println("folder deleted:"+path);
		}
		else
			System.out.println("fodler to delete is not available");
	}
	public static void main(String[] args) {
		

			
		String folderpath = "C:\\myfiles";
		creatingFolder(folderpath);
		System.out.println(checkFolderExists("C:\\Ramesh_Tutorials"));
		renameFolder(folderpath,"C:\\myfile1");
		
		deleteFolder("C:\\\\Ramesh_Tutorials");
		checkFolderExists("C:\\Ramesh_Tutorials");
		
		
	}

}
