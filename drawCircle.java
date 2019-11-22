import java.util.Random;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
public class drawCircle extends JComponent
{
  public void paintComponent(Graphics g)
  {
    int count = 0 , inside1 = 0, inside2 = 0;
    int x = 15, y = 15;

    Graphics2D g2 = (Graphics2D)g;
    g2.setColor(Color.black);
    Ellipse2D.Double circle = new Ellipse2D.Double(TOP, LEFT, WIDTH, HEIGHT);
    Ellipse2D.Double p2 = new Ellipse2D.Double(x, y, .5,.5);
    g2.draw(circle);
    g2.setPaint(Color.black);
    for (int i = 0 ; i < 10000; i++)
    {
      x = getRandomNum();
      y = getRandomNum();
      inside1 = (400-x)*(400-x);
      inside2 = (400-y)*(400-y);
      if (400 > Math.pow(inside1 + inside2, .5))
      {
        count++;
        g2.setColor(Color.black);
      }
      else{g2.setColor(Color.red);}
      p2.setFrame(x,y,1,1);
      g2.draw(p2);
    }

    System.out.println("Throws: 10000; Hits: " +count + "; Ratio: "+ (10000.0/count));
  }
  public static int getRandomNum()
  {
    Random rand = new Random();
    int rand_int1 = rand.nextInt(800);
    return rand_int1;
  }
  public int TOP = 00;
  public int LEFT = 00;
  public int WIDTH = 800;
  public int HEIGHT = 800;
}
