import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing02B
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		for (int x=1; x<20;x+=2) {
			for (int y=1; y<=40;y++) {
				terminal.setCursorPosition(y,x);
				terminal.putCharacter('X');
			}
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
