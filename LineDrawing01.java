import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing01
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		terminal.setCursorPosition(1,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(2,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(3,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(4,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(5,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(6,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(7,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(8,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(9,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(10,1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(1,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(2,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(3,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(4,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(5,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(6,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(7,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(8,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(9,3);
		terminal.putCharacter('X');
		terminal.setCursorPosition(10,3);
		terminal.putCharacter('X');
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
