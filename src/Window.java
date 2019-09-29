import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
	private tPoint[] point;
	private int n;
	public static final int window_w = 1300, window_h = 750;
	
	JFrame frame;
	
	public Window (int window_w, int window_h, tPoint[] point, int n) {
		this.point = point;
		this.n = n;
		
		frame = new JFrame("tPoint");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(window_w, window_h);
		frame.setVisible(true);
		frame.setContentPane(new MyPanel(point, n));
		frame.setLocationRelativeTo(null);
		MoveIt();
	}
	
	
	private void MoveIt() {
		while(true) {
			for (int i = 0; i < n; i++)
				point[i].MovePramX();
			try{
	                Thread.sleep(10);
	            } catch (Exception exc){}
	            frame.repaint();
			
		}
	}
}
