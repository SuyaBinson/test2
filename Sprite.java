package f2.spw;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public abstract class Sprite {
	int a;
	int b;
	int width;
	int height;
	
	public Sprite(int a, int b, int width, int height) {
		this.a = a;
		this.b = b;
		this.width = width;
		this.height = height;
	}

	abstract public void draw(Graphics2D g);
	
	public Double getRectangle() {
		return new Rectangle2D.Double(a, b, width, height);
	}
}
