package filereader;

import java.io.*;

public class filereader {

	public filereader() {
	
}
	public static void main(String[]args) throws Exception{
		File file = new File(
				"C:\\Users\\Default.LAPTOP-KQILPJKS\\OneDrive\\Documents\\Employee_seedfile.txt");
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String st;
			 
			 while ((st = br.readLine()) != null)
			     
			     System.out.println(st);
		}
		
	}
}