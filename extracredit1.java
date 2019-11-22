import javax.swing.JComponent;
import javax.swing.JFrame;

public class extracredit1 extends JComponent
{
 public static void main(String[] args)
 {
   JFrame frame = new JFrame("Extra Credit");
   drawCircle component = new drawCircle();
   frame.setSize(250, 250);
   frame.add(component);
   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);
 }

private static final int FRAME_WIDTH = 800;
private static final int FRAME_HEIGHT = 800;
}
