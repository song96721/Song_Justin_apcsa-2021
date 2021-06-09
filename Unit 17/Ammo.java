//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
  final static int length = 25;
	private Image image;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 1);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y, length, length);
		speed = s;
		try {
			URL url = getClass().getResource("");
			image = ImageIO.read(url);

		} catch (Exception e) {
			System.out.println("image error");
		}
	}

	public void setSpeed(int s)
	{
	  speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.yellow);
		window.drawImage(image, getX(), getY(), length, length, null);
	}
	
	
	public void move( String direction )
	{
		if (direction.equals("UP")) {
			setY(getY() - speed);
		}
	}

	public String toString()
	{
		return "Length: " + length + " Speed: " + speed;
	}
}
