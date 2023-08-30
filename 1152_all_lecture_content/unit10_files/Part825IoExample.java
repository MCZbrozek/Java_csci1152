/* This example comes from chapter 15 in the book:
Java How to Program 11th edition
Although file system navigation can be very
useful, we are going to skim this section.
*/
import java.io.File;

public class Part825IoExample
{
	public static void printDirectoryInfo(String pathString)
	{
		//use File object to get access to file or directory
		File path = new File(pathString);
		
		//if the file object points to a directory
		if (path.isDirectory())
		{
			//The file object points to a directory
			System.out.println("dir: "+path);
			//get all the files/directories from within this directory
			File[] filesInDir = path.listFiles();
			
			//iterate through the files/directories and print the names out
			for (int i=0; i < filesInDir.length; i++)
			{
				if (filesInDir[i].isDirectory())
				{
					//if file is a directory
					System.out.println("     dir: "+filesInDir[i]);
					//printDirectoryInfo(filesInDir[i].getAbsolutePath());	
				}
				else
				{
					//if file is a directory
					System.out.println("     file: "+filesInDir[i]);
				}
			}
		}
		else
		{
			//file object pointed to a file so just print the file name
			System.out.println("file: "+path.getName());
		}
		
	}
	
	public static void main(String[] args)
	{
		String path_name = "C:\\Users\\nholtschulte\\Desktop";
		File path = new File(path_name);
		
		/* boolean pathExists = path.exists();
		
		boolean isDirectory = path.isDirectory();
		
		boolean isFile = path.isFile();
		
		String[] allFilesOrDirsAsStrings = path.list();
		
		File[] allFilesOrDirs = path.listFiles(); */
		
		IoExample.printDirectoryInfo(path_name);
	}

}
