import java.awt.Graphics;
import javax.swing.JApplet;

public class TicTacToe extends JApplet {
	public void paint(Graphics canvas) {
		canvas.drawLine(0, 100, 300, 100);
		canvas.drawLine(100, 0, 100, 300);
		canvas.drawLine(0, 200, 300, 200);
		canvas.drawLine(200, 0, 200, 300);
		canvas.drawLine(247, 0, 247, 300);
		canvas.drawOval(110, 110, 80, 80);
		canvas.drawOval(110, 210, 80, 80);
		canvas.drawOval(10, 210, 80, 80);
		canvas.drawOval(10, 10, 80, 80);
		canvas.drawLine(15, 115, 80, 180);
		canvas.drawLine(80, 115, 15, 180);
		canvas.drawLine(115, 15, 180, 80);
		canvas.drawLine(180, 15, 115, 80);
		canvas.drawLine(215, 15, 280, 80);
		canvas.drawLine(280, 15, 215, 80);
		canvas.drawLine(215, 115, 280, 180);
		canvas.drawLine(280, 115, 215, 180);
		canvas.drawLine(215, 215, 280, 280);
		canvas.drawLine(280, 215, 215, 280);
	}
}
