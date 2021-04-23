//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

  private int ogX =0;
  private int ogY =0;

   public SpeedUpBall()
   {
     super(200,200);
	   ogX=this.getXSpeed();
	   ogY=this.getYSpeed();
   }

   public SpeedUpBall(int x, int y)
   {
     super(x,y);
	   setXSpeed(-4);
	   setXSpeed(2);
	   ogX=this.getXSpeed();
	   ogY=this.getYSpeed();
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
     super(x,y);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
	   ogX=this.getXSpeed();
	   ogY=this.getYSpeed();
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
     super(x,y, wid, ht);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
	   ogX=this.getXSpeed();
	   ogY=this.getYSpeed();
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
     super(x,y, wid, ht, col);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
	   ogX=this.getXSpeed();
	   ogY=this.getYSpeed();
   }

   public void setXSpeed( int xSpd )
   {
     super.setXSpeed(xSpd);
   }

   public void setYSpeed( int ySpd )
   {
     super.setYSpeed(ySpd);
   }
}

