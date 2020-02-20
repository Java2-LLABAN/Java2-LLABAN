import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing02A
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		for (int col=1; col<=10; col++) {
			terminal.setCursorPosition(col,1);
			terminal.putCharacter('X');
		}
		for (int col=1; col<=10; col++) {
			terminal.setCursorPosition(col,3);
			terminal.putCharacter('X');
		}
		for (int col=1; col<=10; col++) {
			terminal.setCursorPosition(col,5);
			terminal.putCharacter('X');
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
