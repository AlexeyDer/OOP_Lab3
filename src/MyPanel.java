import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;



public class MyPanel extends JPanel{
	private tPoint[] point;
	private int n;
	private Timer timer = null;
	
	public MyPanel(tPoint[] m, int n) {
		this.point = m;
		this.n = n;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random r = new Random();
		
		Graphics2D g2d = (Graphics2D) g;
	
		g2d.setStroke(new BasicStroke(5));
		setBackground(Color.black);
		
			for (int i = 0; i < n; i++) {
	            Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
	        	g2d.setColor(c);
				g2d.drawLine(point[i].x, point[i].y, point[i].x, point[i].y);
			}		

	}
	
	
	
}
