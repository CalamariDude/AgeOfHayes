import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgeOfWar
{
    public static void main(String[] args) throws InterruptedException
    {

        JFrame frame = new JFrame("Age of Hayes");
//	frame.update(Graphics g);
        AOWRunner game = new AOWRunner();


//	frame.setIconImage(Image b);
        //AOWRunner game = new AOWRunner();
        frame.add(game);
        frame.setSize(1300, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        AOWRunner runner = new AOWRunner();

        AOWBase base1 = new AOWBase(500, 500);
        AOWBase base2 = new AOWBase(500, 500);

        Scanner keyboard = new Scanner(System.in);


        while (base1.getHealth() >= 0 && base2.getHealth() >= 0)
        {

            game.move();
            game.repaint();

            Thread.sleep(10);






        }


    }

}