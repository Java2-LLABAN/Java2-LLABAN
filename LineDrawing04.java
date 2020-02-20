import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing04
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int length=1,num,x,y;
		for(y=1;y<=20;y=y+2) {
			num=(length/2) + (length%2);
			for(x=1;x<=length;x=x+1) {
				terminal.setCursorPosition(11-x,y);
				if(11-x<=10-length+num) {
					terminal.putCharacter('X');
				}else {
					terminal.putCharacter('Y');
				}
			}
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
