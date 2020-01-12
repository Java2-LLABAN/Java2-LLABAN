import java.io.*;
import java.util.*;

public class MidtermAct04
{
	public static void main(String[] args) {
		try {
			File Act03 = new File("phonebook.txt");
			File file = new File("RecordFound.txt");
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			Scanner scanner = new Scanner(Act03);
			String data = "";

			while (scanner.hasNext()){
				data = scanner.next();
				if(data.equals("1001-11")){
					System.out.println("Code: " +data);
					System.out.println("First Name: "+scanner.next());
					System.out.println("Last Name: "+scanner.next());
					System.out.print("CP No.: "+scanner.next());
					continue;
				}
				

			pw.println("Code: " +data);
			pw.println("First Name: "+scanner.next());
			pw.println("Last Name: "+scanner.next());
			pw.print("CP No.: "+scanner.next());
			
			pw.close();
			}
			scanner.close();


		}
			

		catch (IOException e){
			System.out.println("Error!");
		}
	}
}