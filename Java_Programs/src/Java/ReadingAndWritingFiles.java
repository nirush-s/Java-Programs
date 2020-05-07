package Java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadingAndWritingFiles 
{

	
	public void Read() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\nirush.s\\Desktop\\Read.txt");
		
		int i=0;
		
		while((i=fis.read())!=-1)
		{
			
			System.out.print((char)i); 
			
		}
		
		fis.close();
	
	}
	
	@Test
	public void FileWrite() throws IOException
	{
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\nirush.s\\Desktop\\Read.txt");    
        fout.write(65);    
        
        fout.close();
	}
	
	
}
