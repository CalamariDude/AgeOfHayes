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
    ArrayList<AOWInfantry> infantries = new ArrayList();
    ArrayList<AOWTurrets> turrets = new ArrayList();
    static ArrayList<AOWInfantry> infantriesOFFriendly = new ArrayList();
    static ArrayList<AOWTurrets> turretsOFFriendly = new ArrayList();
    static ArrayList<AOWInfantry> infantriesOFEnemy = new ArrayList();
    static ArrayList<AOWInfantry> turretsOFEnemy = new ArrayList();
    
    //DONT HAVE THE RANGE BE NEGATIVE I CHANGED IT SO THAT THE RANGE CAN BE POSITIVE FOR ALL FRIENDLY AND ENEMY UNITS
    
    JLabel label;
    BufferedImage image;

    int x;
    int y;
    int tier = 1;

    Image im;//background image

    Image clubManMove1;
    Image clubManMove2;
    Image clubManMove3;

    Image AOWMelee;
    Image AOWRanged;
    Image AOWTank;

    //Initializes Units
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

    AOWInfantry clubManE;

    AOWInfantry clubMan2;


    ArrayList<Image> clubArray;


    public AOWRunner() throws IOException{

        //Creates the Array Lists
    /*    infantries = new ArrayList();
        turrets= new ArrayList();
        infantriesOFFriendly = new ArrayList();
        turretsOFFriendly = new ArrayList();
        infantriesOFEnemy = new ArrayList();
        turretsOFEnemy = new ArrayList();
*/

        x=50;
        y=50;


        im = ImageIO.read(new File("C:\\Users\\matthew\\IdeaProjects\\AgeOfHayes\\Pictures\\Main Menu\\Prehistoric.jpg"));

        clubManMove1 = ImageIO.read(new File("C:\\Users\\matthew\\IdeaProjects\\AgeOfHayes\\Pictures\\Tier 1\\clubManMove1.jpg"));
        clubManMove2 = ImageIO.read(new File("C:\\Users\\matthew\\IdeaProjects\\AgeOfHayes\\Pictures\\Tier 1\\clubManMove2.jpg"));
        clubManMove3 = ImageIO.read(new File("C:\\Users\\matthew\\IdeaProjects\\AgeOfHayes\\Pictures\\Tier 1\\clubManMove3.jpg"));


        AOWMelee = ImageIO.read(new File("C:\\Users\\matthew\\IdeaProjects\\AgeOfHayes\\Pictures\\Main Menu\\AOWMelee.jpg"));
        AOWRanged = ImageIO.read(new File("C:\\Users\\matthew\\IdeaProjects\\AgeOfHayes\\Pictures\\Main Menu\\AOWRanged.jpg"));
        AOWTank = ImageIO.read(new File("C:\\Users\\matthew\\IdeaProjects\\AgeOfHayes\\Pictures\\Main Menu\\AOWTank.jpg"));


        ArrayList<Image> clubArray  = new ArrayList();
        clubArray.add(clubManMove1);
        clubArray.add(clubManMove2);
        clubArray.add(clubManMove3);
        clubArray.add(clubManMove3);
        clubArray.add(clubManMove2);
        clubArray.add(clubManMove1);




        //attack damage - takes out set number of health
        //attack speed - number of attacks every 10 seconds
        //range - number of pixels away that a unit is able to hit
        //tier - level of
        //health - amount of health of infantry
        //cost - amount of gold to buy infantry
        //xpGiver - gives the other player a set amount of experience based upon type of unit killed
        //goldGiver- gives the other player a set amount of gold based up type of unit killed

        clubMan = new AOWInfantry(25, 5, 50, 0, 75, 60, 50, 80, 300, clubArray );
/*
        slinger = new AOWInfantry(20, 4, 200, 0, 40, 60, 50, 80, 100);
        dinoRider = new AOWInfantry(40, 3, 100, 0, 125, 90, 70, 110, 100);
        eggPault = new AOWTurrets(10, 4, 300, 0, 150);

        swordsMan = new AOWInfantry(50, 5, 1, 1, 150, 90, 50, 110, 100);
        archer = new AOWInfantry(40, 4, 200, 1, 90, 90, 50, 110, 100);
        knight = new AOWInfantry(80, 3, 100, 1, 250, 120, 70, 140, 100);
        catapult = new AOWTurrets(20, 4, 300, 1, 200);

        soldier = new AOWInfantry(80, 5, 1, 2, 300, 120, 70, 140, 100);
        sniper = new AOWInfantry(65, 4, 300, 2, 200, 120, 70, 140, 100);
        tank = new AOWInfantry(150, 3, 100, 2, 500, 190, 100, 220, 100);
        rocketLauncher = new AOWTurrets(70, 3, 400, 2, 250);

        blader = new AOWInfantry(150, 5, 1, 3, 400, 200, 120, 220, 100);
        blaster = new AOWInfantry(130, 4, 200, 3, 300, 200, 120, 220, 100);
        HayesWrath = new AOWInfantry(300, 3, 100, 3, 1500, 300, 275, 330, 100);
        plasmaCannon = new AOWTurrets(75, 4, 300, 3, 1000);
*/
        clubManE = new AOWInfantry(25, 5, 47, 0, 75, 60, 50, 80, 400, clubArray);

        clubMan2 = new AOWInfantry(25, 5, 50, 0, 75, 60, 50, 80, 300, clubArray );


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


        //------------------testing
     //   infantriesOFFriendly.add(clubMan);
        infantriesOFEnemy.add(clubManE);
    //    infantriesOFFriendly.add(clubMan2);
        //---------------------------------





        MouseListener d = new MouseListener() {

            public void mouseClicked(MouseEvent e) {



            }


            public void mousePressed(MouseEvent e) {
            /*if (e.getX() < 100 && e.getY() < 100)
                {
                    repaint();
                }*/

                if (e.getX() < 45 && e.getX() > 0 && e.getY() > 900 && e.getY() < 945)
                {
                    AOWInfantry clubMan = new AOWInfantry(25, 5, 50, 0, 75, 60, 50, 80, 300, clubArray);
                    infantriesOFFriendly.add(infantriesOFFriendly.size() , clubMan);
                }
                else if (e.getX() > 50 && e.getX() < 95 && e.getY() > 900 && e.getY() < 945)
                {
                    //Create(2);
                }
                else if (e.getX() > 100 && e.getX() < 145 && e.getY() > 900 && e.getY() < 945)
                {
                    //Create(3);
                }
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


        //make loop for infantry

        g2d.drawImage(im,0,0,this);
        //g2d.fillOval(x, y, 50, 50);
        g2d.drawImage(AOWMelee,0,900, this);
        g2d.drawImage(AOWRanged,50,900, this);
        g2d.drawImage(AOWTank,100,900,this );


        AOWInfantry tempF;
        AOWInfantry tempE;

        for(int i = 0; i < 10; i++)
        {

            if(i < infantriesOFFriendly.size() )
            {
                tempF = infantriesOFFriendly.get(i);

                g2d.drawImage(tempF.getWalkAnimations().get(tempF.getFrame()), tempF.getX(), 800, this);
            }

            if(i < infantriesOFEnemy.size() )
            {
                tempE = infantriesOFEnemy.get(i);

                g2d.drawImage(tempE.getWalkAnimations().get(tempE.getFrame()), tempE.getX(), 800, this);
            }
            /*
            g2d.drawImage(clubMan.getWalkAnimations().get(clubMan.getFrame()), infantriesOFFriendly.get(0).getX(), 800, this);
            g2d.drawImage(clubMan2.getWalkAnimations().get(clubMan2.getFrame()), infantriesOFFriendly.get(1).getX(), 800, this);
            g2d.drawImage(clubManE.getWalkAnimations().get(clubManE.getFrame()), infantriesOFEnemy.get(0).getX(), 800, this);
*/
        }


    }

    public void setter(Image im){



    }



/*
    public void Create(int number)
        {

        if (tier == 1)
        {
            if (number == 1)
            {
                //AOWInfantry clubMan = new AOWInfantry(25, 5, 50, 0, 75, 60, 50, 80, 300, clubArray);
                infantriesOFFriendly.add(infantriesOFFriendly.size() , clubMan);
            }
            else if (number == 2)
            {
                infantriesOFFriendly.add(infantriesOFFriendly.size(), slinger);
            }
            else if (number == 3)
            {
                infantriesOFFriendly.add(infantriesOFFriendly.size(), dinoRider);
            }

        }

        else if (tier == 2)
        {
            if (number ==1)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), swordsMan);


            else if (number ==2)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), archer);

            else if(number ==3)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), knight);

        }



        else if (tier == 3)
        {
            if(number ==1)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), soldier);

            else if(number ==2)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), sniper);

            else if(number ==3)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), tank);

        }
        else if (tier ==4)
        {
            if(number ==1)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), blader);

            else if(number ==2)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), blaster);

            else if(number ==3)
                infantriesOFFriendly.add(infantriesOFFriendly.size(), HayesWrath);


        }



    }
*/
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
