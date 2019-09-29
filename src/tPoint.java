import java.util.Random;

public class tPoint{
	final int window_w = 1300, window_h = 750;
	public int x, y;
	public boolean bx = true, by = true;
	
	private tPoint (int window_w, int window_h) {
		Random random = new Random();
		this.x = random.nextInt(window_w);
		this.y = random.nextInt(window_h);
	}
	
	public void MovePramX() {
		if (bx && x < window_w - 15)
			++this.x;
		else {
			bx = false;
			if (!bx && x > 1)
				--this.x;
			else
				bx = true;
		}	
	}
	
	public void MovePramY () {
		if (y <= window_h)
			++this.y;
		else
			--this.y;
	}
	
	
	public static void main(String args[]) {
		final int window_w = 1300, window_h = 750;
		final int n = 500;

		tPoint[] point = new tPoint[n];
		
		for (int i = 0; i < n; i++) {
			point[i] = new tPoint(window_w, window_h);
	//		System.out.println(i + ": " + point[i].x + " " + point[i].y);
		}
	
		new Window(window_w, window_h, point, n);
	}
}

