import java.util.Random;

public class tPoint {
	final int window_w = 1300, window_h = 750;
	public int x, y;
	public boolean bx = true, by = true;
	Random random = new Random();

	private int count_x;
	private int count_y;

	private tPoint(int window_w, int window_h) {
		this.x = random.nextInt(window_w);
		this.y = random.nextInt(window_h);
		this.count_x = random.nextInt(2);
		this.count_y = random.nextInt(2);
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

	private int moveCords(int a) {
		if (a == 0)
			return 1;
		else
			return 0;
	}

	public void MoveHaot() {

		if (count_x == 0 && bx && x < window_w - 15)
			++this.x;
		else {
			if (bx) {
				count_x = moveCords(count_x);
			}
			bx = false;
			count_x = moveCords(count_x);

			if (count_x == 1 && !bx && x > 1)
				--this.x;
			else {
				if (!bx) {
					count_x = moveCords(count_x);
				}
				bx = true;
			}
		}

		if (count_x == 0)
			++this.x;
		else
			--this.x;

//		if (count_y == 0 && y < window_h)
//			++this.y;
//		else
//			--this.y;

	}

	public static void main(String args[]) {
		final int window_w = 1300, window_h = 750;
		final int n = 500;

		tPoint[] point = new tPoint[n];

		for (int i = 0; i < n; i++) {
			point[i] = new tPoint(window_w, window_h);
			// System.out.println(i + ": " + point[i].x + " " + point[i].y);
		}

		new Window(window_w, window_h, point, n);
	}
}
