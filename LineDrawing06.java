import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing06
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int length=1,num,x,y, count = 10, num2 = 10;
		String str = "Merry Christmas!";
		char[] c = str.toCharArray();

		for(y=1;y<=20;y=y+2) {
			num=(length/2) + (length%2);

			if ((y-1) != 0) {
				terminal.setCursorPosition(10,y-1);
				terminal.putCharacter('|');
				terminal.setCursorPosition(count,y-1);
				terminal.putCharacter('/');
				terminal.setCursorPosition(num2,y-1);
				terminal.putCharacter('\\');
			}

			for(x=10;x<=num2;++x) {
				terminal.setCursorPosition(x,y);
				if((x-10)<=((num2-11)/2)) {
					terminal.putCharacter('Y');
				}else {
					terminal.putCharacter('X');
				}
			}
			
			for(x=1;x<=length;x=x+1) {
				terminal.setCursorPosition(11-x,y);
				if(11-x<=10-length+num) {
					terminal.putCharacter('X');
				}else {
					terminal.putCharacter('Y');
				}
			}
			length++;
			count--;
			num2++;

			for (int x1 = 18, cha = 0; x1 < 34; x1++, cha++) {
				if (y == 9) {
					terminal.setCursorPosition(x,y);
					terminal.putCharacter(c[cha]);	
				}	
			}
		}
		
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
