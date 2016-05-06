import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AOWRunner extends JPanel implements ActionListener{
    ArrayList<AOWInfantry> infantries;
    ArrayList<AOWTurrets> turrets;
    static ArrayList<AOWInfantry> infantriesOFFriendly;
    static ArrayList<AOWTurrets> turretsOFFriendly;
    static ArrayList<AOWInfantry> infantriesOFEnemy;
    static ArrayList<AOWInfantry> turretsOFEnemy;
    
    
    
    JLabel label;
    BufferedImage image;

    int x;
    int y;
    Image im;
    //Units
    AOWInfantry clubMan;
    AOWInfantry slinger;
    AOWInfantry dinoRider;
    AOWTurrets eggPault;

    AOWInfantry swordsMan;
    AOWInfantry archer;
    AOWInfantry knight;
    AOWTurrets catapult ;

    AOWInfantry soldier;
    AOWInfantry sniper;
    AOWInfantry tank;
    AOWTurrets rocketLauncher;

    AOWInfantry blader;
    AOWInfantry blaster;
    AOWInfantry HayesWrath;
    AOWTurrets plasmaCannon;


    Timer timer = new Timer(5, this);


    public AOWRunner() throws IOException{
        x=50;
        y=50;


        im = ImageIO.read(new File("C:\\Users\\matthew\\Pictures\\Prehistoric.jpg"));






        infantries = new ArrayList<>();
        turrets= new ArrayList<>();
        infantriesOFFriendly = new ArrayList();
        turretsOFFriendly = new ArrayList();
        infantriesOFEnemy = new ArrayList();
        turretsOFEnemy = new ArrayList();




        //attack damage - takes out set number of health
        //attack speed - number of attacks every 10 seconds
        //range - number of pixels away that a unit is able to hit
        //tier - level of
        //health - amount of health of infantry
        //cost - amount of gold to buy infantry
        //xpGiver - gives the other player a set amount of experience based upon type of unit killed
        //goldGiver- gives the other player a set amount of gold based up type of unit killed
/*
        clubMan = new AOWInfantry(25, 5, 1, 0, 75, 60, 50, 80 );
        slinger = new AOWInfantry(20, 4, 200, 0, 40, 60, 50, 80);
        dinoRider = new AOWInfantry(40, 3, 100, 0, 125, 90, 70, 110);
        eggPault = new AOWTurrets(10, 4, 300, 0, 150);

        swordsMan = new AOWInfantry(50, 5, 1, 1, 150, 90, 50, 110);
        archer = new AOWInfantry(40, 4, 200, 1, 90, 90, 50, 110);
        knight = new AOWInfantry(80, 3, 100, 1, 250, 120, 70, 140);
        catapult = new AOWTurrets(20, 4, 300, 1, 200);

        soldier = new AOWInfantry(80, 5, 1, 2, 300, 120, 70, 140);
        sniper = new AOWInfantry(65, 4, 300, 2, 200, 120, 70, 140);
        tank = new AOWInfantry(150, 3, 100, 2, 500, 190, 100, 220);
        rocketLauncher = new AOWTurrets(70, 3, 400, 2, 250);

        blader = new AOWInfantry(150, 5, 1, 3, 400, 200, 120, 220);
        blaster = new AOWInfantry(130, 4, 200, 3, 300, 200, 120, 220);
        HayesWrath = new AOWInfantry(300, 3, 100, 3, 1500, 300, 275, 330);
        plasmaCannon = new AOWTurrets(75, 4, 300, 3, 1000);
*/

        infantries.add(clubMan);
        infantries.add(slinger);
        infantries.add(dinoRider);
        infantries.add(swordsMan);
        infantries.add(archer);
        infantries.add(knight);
        infantries.add(soldier);
        infantries.add(sniper);
        infantries.add(tank);
        infantries.add(blader);
        infantries.add(blaster);
        infantries.add(HayesWrath);

        turrets.add(eggPault);
        turrets.add(catapult);
        turrets.add(rocketLauncher);
        turrets.add(plasmaCannon);








        MouseListener d = new MouseListener() {

            public void mouseClicked(MouseEvent e) {



            }


            public void mousePressed(MouseEvent e) {
            /*if (e.getX() < 100 && e.getY() < 100)
                {
                    repaint();
                }*/
                System.out.println("mouseClicked at (" + e.getX() + ", " + e.getY() + ")");
            }


            public void mouseReleased(MouseEvent e) {

            }


            public void mouseEntered(MouseEvent e) {
                System.out.println("mouse entered screen");

            }


            public void mouseExited(MouseEvent e) {
                System.out.println("mouse exited screen");

            }
        };
        addMouseListener(d);


    }

    public void Render(){
        BufferedImage image;
        int x = 0;
        int y = 0;

        // getters and setters
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
//		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        //			RenderingHints.VALUE_ANTIALIAS_ON);

        //g2d.fillOval(x, y, 50, 50);
        //make loop for infrantry
        g2d.drawImage(im,0,0,this);

    }

    public void setter(Image im){



    }




    public void Create(int number)
    {
        int tier = 1;

        if (tier == 1)
        {
            if (number == 1)
            {
                infantriesOFFriendly.add(0,clubMan);
            }
            else if (number == 2)
            {
                infantriesOFFriendly.add(0, slinger);
            }
            else if (number == 3)
            {
                infantriesOFFriendly.add(0, dinoRider);
            }

        }

        else if (tier == 2)
        {
            if (number ==1)
                infantriesOFFriendly.add(0, swordsMan);


            else if (number ==2)
                infantriesOFFriendly.add(0, archer);

            else if(number ==3)
                infantriesOFFriendly.add(0, knight);

        }



        else if (tier == 3)
        {
            if(number ==1)
                infantriesOFFriendly.add(0, soldier);

            else if(number ==2)
                infantriesOFFriendly.add(0, sniper);

            else if(number ==3)
                infantriesOFFriendly.add(0, tank);

        }
        else if (tier ==4)
        {
            if(number ==1)
                infantriesOFFriendly.add(0, blader);

            else if(number ==2)
                infantriesOFFriendly.add(0, blaster);

            else if(number ==3)
                infantriesOFFriendly.add(0, HayesWrath);


        }



    }

    public void move()
    {
        this.x = this.x + 5;
        this.y = this.y + 0;
    }

//    public void Create(AOWTurret name)
//    {
//   	infantriesOF.add(0,);
//  	turretsOF.add();





    public static void main (String[] args){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static int numberOfInfantries()
    {
        return infantriesOFFriendly.size();

    }



}
