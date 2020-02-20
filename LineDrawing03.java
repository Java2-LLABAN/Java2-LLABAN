import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing03
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int x=1,y=1,i=1,j=1;
		for(;x<20;x=x+2,i++) {
			j=(i/2) + (i%2);
			for(y=1;y<=i;y++) {
				terminal.setCursorPosition(y,x);
				if(j>=y) {
					terminal.putCharacter('X');
				}else {
					terminal.putCharacter('Y');
				}
			}
			j++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
