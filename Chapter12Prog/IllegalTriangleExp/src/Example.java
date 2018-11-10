
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "myfile.txt";
		try {
			//create a file and write a data in file
			File f = createFile(name);
			PrintWriter  pw = new PrintWriter(f);
			
			pw.write("Java is Print! \r\n");
			pw.write("Programming id fun !\r\n");
			pw.write("Life id good!\r\n");
			pw.close();
			
			//read a data from file
			//in scanner pass the f so pass the file content.
			// in scanner pass the name so pass the file name.
			Scanner input = new Scanner(f);
			while(input.hasNextLine())
			{
				System.out.println(input.nextLine());
			}
			input.close();
		}
		
		catch(Exception e)
		{
			
		}
	}

	public static File createFile(String fileName) throws Exception
	{
		File f  = new File(fileName);
				return f;
	}
}
