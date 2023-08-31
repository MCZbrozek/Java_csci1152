/* This example comes from chapter 15 in the book:
Java How to Program 11th edition
Although file system navigation can be very
useful, we are going to skim this section.
*/
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Part830NioExample
{
	public static void main(String[] args) throws IOException
	{
		String path_name = "C:\\Users\\nholtschulte\\Desktop\\java_code\\"; //\\Part830NioExample.class    \\desktop.ini
		System.out.println("Path: "+path_name);
		
		Path path = Paths.get(path_name);

		boolean exists = Files.exists(path);
		System.out.println("It exists? "+exists);

		boolean isDir = Files.isDirectory(path);
		System.out.println("It's a directory? "+isDir);
		
		boolean executable = Files.isExecutable(path);
		System.out.println("It's executable? "+executable);
		
		boolean isHidden = Files.isHidden(path);
		System.out.println("It's hidden? "+isHidden);
		
		System.out.println("");
		
		//Make sure the path leads to a folder 
		//otherwise this next part causes an error.
		if(isDir)
		{
			System.out.println("What other files or folders are in this folder?");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(path);
			for (Path p: dirStream)
			{
				System.out.print(p.getFileName());
				System.out.println("   "+Files.isDirectory(p));
			}
		}
	}

}
