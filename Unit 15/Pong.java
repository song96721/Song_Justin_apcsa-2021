//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private SpeedUpBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private Integer countLeft = 0;
	private Integer countRight = 0;
	private Wall wallTop;
	private Wall wallBottom;
	private int ogx;
	private int ogy;


	public Pong()
	{
		ball = new SpeedUpBall(200, 200, 10, 10,2,2);
		leftPaddle = new Paddle(10, 100, 10, 200, 6);
		rightPaddle = new Paddle(780, 100, 10, 200, Color.black, 6);
		keys = new boolean[4];
		wallTop = new Wall(leftPaddle.getX(),0,rightPaddle.getX()-leftPaddle.getX()+rightPaddle.getWidth());
		wallBottom = new Wall(leftPaddle.getX(),570,rightPaddle.getX()-leftPaddle.getX()+rightPaddle.getWidth());
		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this);
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		Graphics2D twoDGraph = (Graphics2D) window;

		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		Graphics graphToBack = back.createGraphics();
		
		scoreUpdater(graphToBack);
		wallBottom.draw(graphToBack);
		wallTop.draw(graphToBack);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		int x =ball.collisionProcessor(countLeft,countRight,leftPaddle,rightPaddle,graphToBack,wallTop,wallBottom);
		if(x==1)
			countLeft++;
		else if(x==2) {
			countRight++;
		}
		
		if (keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}