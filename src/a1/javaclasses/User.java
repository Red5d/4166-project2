package a1.javaclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;  
	
import java.util.Properties;

public class User {
	
	Properties prop;
	FileInputStream fis = null;

	public User() {
		
		prop = new Properties();
		try
			{
				fis = new FileInputStream("insertdirectorypath");
				prop.load(fis);
			}
		
		catch (FileNotFoundException e)
			{	
				System.out.println("File Not Found");
			}
		
		catch (IOException e)
			{
				System.out.println("IO Exception");
			}
		
		finally 
		{
			if (null != fis)
			{
				try
					{
						fis.close();
					}
				catch (Exception e)
					{
						e.printStackTrace();
					}
			}
		}
	}





public void createUser(String user, String password)
	{
		 prop.setProperty(user,password);
		 
		 try 
			 {
				prop.store(new FileOutputStream("insertdirectorypath"), null);	 
				 
			 }
		 catch (FileNotFoundException e) 
			 {
				e.printStackTrace();
			 } 
		 catch (IOException e) 
		 	{
				e.printStackTrace();
			}
	}
}