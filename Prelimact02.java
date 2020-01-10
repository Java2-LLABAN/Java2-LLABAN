import java.io.*;

public class MidtermAct03{
	public static void main(String[] args){
	try {
		BufferedReader in = new BufferedReader(new FileReader("phonebook.txt"));
		int ascii = 0, space = 0;
		String data = "", fname = "", lname = "", cp = "";
		boolean match = false;

		while ((ascii=in.read())!=-1){
			String s=String.valueOf((char)ascii);
			data+=String.valueOf((char)ascii);
			if (ascii=='\n'){
				data="";
				space=0;
			}
			if (ascii==' '){
				space++;
			}
			if (data.equals("1001-11")){
				System.out.println("We've found the record!");
				match = true;
			}
			if (match==true&&ascii != ' '){
				if (space==1)fname += String.valueOf ((char)ascii);
				if (space==2)lname += String.valueOf ((char)ascii);
				if (space==3)cp += String.valueOf ((char)ascii);
			}if (match==true&&ascii=='\n')match=false;
		}
		System.out.println("Firstname:"+fname);
		System.out.println("Lastname:"+lname);
		System.out.println("CP#:"+cp);
		in.close();

	}catch(IOException e) {
		System.out.println("error");
	}
}
}
