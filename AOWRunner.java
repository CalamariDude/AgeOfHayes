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

    int x;
    int y;

    static AOWBase baseF;
    static AOWBase baseE;

//------------------------------------------------------Initializes All Images----------------------
    //backgrounds images
    Image prehistoric;

    //base1 and base2 images
    Image base1;
    Image base2;

    //summon infantry image
    Image AOWMelee;
    Image AOWRanged;
    Image AOWTank;

    //level up tier image
    Image levelUp;

    //frames for clubMan
    Image clubManMove1;
    Image clubManMove2;
    Image clubManMove3;

    //frames for slinger
    Image SlingerMove1;
    Image SlingerMove2;
    Image SlingerMove3;




//---------------------------------------------------End of Initializing All Images-------------------


//--------------------------------------------------Initializes All Infantry---------------------------
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

//-----------------------------------------------End of Initializing All Infantry------------------------


//----------------------------------------------Initializes All Picture ArrayList For Infantry Frames-----
    public ArrayList<Image> clubArray = new ArrayList();
    public ArrayList<Image> slingerArray = new ArrayList();
    ArrayList<Image> dinoRiderArray = new ArrayList();
    ArrayList<Image> swordsManArray = new ArrayList();
    ArrayList<Image> archerArray = new ArrayList();
    ArrayList<Image> knightArray = new ArrayList();
    ArrayList<Image> soldierArray = new ArrayList();
    ArrayList<Image> sniperArray = new ArrayList();
    ArrayList<Image> tankArray = new ArrayList();
    ArrayList<Image> bladerArray = new ArrayList();
    ArrayList<Image> blasterArray = new ArrayList();
    ArrayList<Image> HayesWrathArray = new ArrayList();

//------------------------------------------End of Initializing all ArrayLists--------------------------


    AOWInfantry clubManE;

    AOWInfantry clubMan2;

    AOWInfantry SlingerE;

    AOWInfantry Slinger2;




    public AOWRunner() throws IOException{

        //Creates base objects
        baseF = new AOWBase(1000, 200, 25);
        baseE = new AOWBase(1000, 200, 1200);

        //---------------------------------------Assign variables to pictures----------------------
        //background pictures
        prehistoric = ImageIO.read(new File("Resources\\Main Menu\\Prehistoric.jpg"));

        //base pictures
        base1 = ImageIO.read(new File("Resources\\Tier 1\\Base.jpg"));
        base2 = ImageIO.read(new File("Resources\\Tier 1\\Base.jpg"));

        //levelUp picture
        levelUp = ImageIO.read(new File("Resources\\Main Menu\\levelUp.jpg"));

        //clubMan pictures
        clubManMove1 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove1.jpg"));
        clubManMove2 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove2.jpg"));
        clubManMove3 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove3.jpg"));

        //slinger pictures
        SlingerMove1 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove1.jpg"));
        SlingerMove2 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove2.jpg"));
        SlingerMove3 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove3.jpg"));

        //summon infantry pictures
        AOWMelee = ImageIO.read(new File("Resources\\Main Menu\\AOWMelee.jpg"));
        AOWRanged = ImageIO.read(new File("Resources\\Main Menu\\AOWRanged.jpg"));
        AOWTank = ImageIO.read(new File("Resources\\Main Menu\\AOWTank.jpg"));

        //------------------------------------End of Assign variables to pictures-----------------------


        //----------------------------------Assign Pictures to Pictures ArrayList-----------------------
        clubArray.add(clubManMove1);
        clubArray.add(clubManMove2);
        clubArray.add(clubManMove3);
        clubArray.add(clubManMove3);
        clubArray.add(clubManMove2);
        clubArray.add(clubManMove1);

        slingerArray.add(SlingerMove1);
        slingerArray.add(SlingerMove2);
        slingerArray.add(SlingerMove3);
        slingerArray.add(SlingerMove3);
        slingerArray.add(SlingerMove2);
        slingerArray.add(SlingerMove1);
        //----------------------------End of Assign Pictures to Picture ArrayList------------------------



        //-------------------------------------Infantry Objects------------------------------------------

        //attack damage - takes out set number of health
        //attack speed - number of attacks every 10 seconds
        //range - number of pixels away that a unit is able to hit
        //tier - level of
        //health - amount of health of infantry
        //cost - amount of gold to buy infantry
        //xpGiver - gives the other player a set amount of experience based upon type of unit killed
        //goldGiver- gives the other player a set amount of gold based up type of unit killed

        clubMan = new AOWInfantry(25, 5, 50, 1, 75, 60, 50, 80, 300, clubArray );

        slinger = new AOWInfantry(5, 4, 200, 1, 40, 60, 50, 80, 100, slingerArray);
/*
		dinoRider = new AOWInfantry(40, 3, 100, 1, 125, 90, 70, 110, 100);
        eggPault = new AOWTurrets(10, 4, 300, 1, 150);

        swordsMan = new AOWInfantry(50, 5, 1, 2, 150, 90, 50, 110, 100);
        archer = new AOWInfantry(40, 4, 200, 2, 90, 90, 50, 110, 100);
        knight = new AOWInfantry(80, 3, 100, 2, 250, 120, 70, 140, 100);
        catapult = new AOWTurrets(20, 4, 300, 2, 200);

        soldier = new AOWInfantry(80, 5, 1, 3, 300, 120, 70, 140, 100);
        sniper = new AOWInfantry(65, 4, 300, 3, 200, 120, 70, 140, 100);
        tank = new AOWInfantry(150, 3, 100, 3, 500, 190, 100, 220, 100);
        rocketLauncher = new AOWTurrets(70, 3, 400, 3, 250);

        blader = new AOWInfantry(150, 5, 1, 4, 400, 200, 120, 220, 100);
        blaster = new AOWInfantry(130, 4, 200, 4, 300, 200, 120, 220, 100);
        HayesWrath = new AOWInfantry(300, 3, 100, 4, 1500, 300, 275, 330, 100);
        plasmaCannon = new AOWTurrets(75, 4, 300, 4, 1000);
*/
        //----------------------------------End Of Infantry Objects----------------------------

        SlingerE = new AOWInfantry(5, 4, 200, 0, 40, 60, 50, 80, 100, slingerArray);
        Slinger2 = new AOWInfantry(5, 4, 200, 0, 40, 60, 50, 80, 100, slingerArray);

        clubManE = new AOWInfantry(25, 5, 50, 0, 75, 60, 50, 80, 700, clubArray);

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
        clubManE = new AOWInfantry(25, 5, 50, 1, 75, 60, 50, 80, 700, clubArray);
        infantriesOFEnemy.add(clubManE);
        //    infantriesOFFriendly.add(clubMan2);
        //---------------------------------
        //infantriesOFEnemy.add(SlingerE);




        MouseListener d = new MouseListener() {

            public void mouseClicked(MouseEvent e) {



            }


            public void mousePressed(MouseEvent e) {

//CHANGE THE VALUES OF THE 500 TO 900 WHEN WE GET HOME AND 545 TO 94===========================================

                //Create melee minion
                if (e.getX() < 45 && e.getX() > 0 && e.getY() > 500 && e.getY() < 545)
                {
                    if(infantriesOFFriendly.size() < 10)
                    {
                        if(baseF.getMoney() >= clubMan.getCost())
                        {
                            if(baseF.getTier() == 1)
                            {
                                AOWInfantry clubMan = new AOWInfantry(25, 5, 50, 1, 75, 60, 50, 80, 50, clubArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), clubMan);

                                baseF.setMoney(baseF.getMoney() - clubMan.getCost());
                            }

                            else if(baseF.getTier() == 2)
                            {
                                


                            }

                        }
                    }
                }

                //Create ranged minion
                else if (e.getX() > 50 && e.getX() < 95 && e.getY() > 500 && e.getY() < 545)
                {

                    if(infantriesOFFriendly.size() < 10)
                    {
                        if(baseF.getMoney() >= slinger.getCost())
                        {
                            AOWInfantry Slinger = new AOWInfantry(5, 4, 200, 1, 40, 60, 50, 80, 50, slingerArray);
                            infantriesOFFriendly.add(infantriesOFFriendly.size(), Slinger);

                            baseF.setMoney(baseF.getMoney() - Slinger.getCost());
                        }
                    }

                }

                //Create tank minion
                else if (e.getX() > 100 && e.getX() < 145 && e.getY() > 500 && e.getY() < 545)
                {
                    //Create(3);
                }

                //Increases tier
                else if(e.getX() > 1100 && e.getX() < 1160 && e.getY() > 500 && e.getY() < 560)
                {
                    if (baseF.getXP() >= 500)
                    {
                        baseF.incTier();

                        baseF.setXP(baseF.getXP() - 500);

                    }
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

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
//		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        //			RenderingHints.VALUE_ANTIALIAS_ON);

        //draws the background
        g2d.drawImage(prehistoric,0,0,this);

        //draws the levelUp button
        g2d.drawImage(levelUp, 1100, 500, this);


        //draws the summon infantry buttons
        g2d.drawImage(AOWMelee,0,500, this);
        g2d.drawImage(AOWRanged,50,500, this);
        g2d.drawImage(AOWTank,100,500,this );

        //draws the base
        g2d.drawImage(base1, 0, 300, this);
        g2d.drawImage(base2, 1100, 300, this);


        AOWInfantry tempF;
        AOWInfantry tempE;

        for(int i = 0; i < 10; i++)
        {
            
            //goes through friendly infantries
            if(i < infantriesOFFriendly.size() )
            {
                tempF = infantriesOFFriendly.get(i);

                //draws the health bar
                g2d.setColor(Color.RED);
                g2d.fillRect(tempF.getX(),450,45, 10);

                g2d.setColor(Color.GREEN);
                double percentageOFHealth =  ((double)tempF.getHealth()) / ((double)tempF.getSpawnHealth());
                int greenPixels = (int)(percentageOFHealth * 45);
                g2d.fillRect(tempF.getX(),450,greenPixels,10);

                //draws the Infantry Unit
                g2d.drawImage(tempF.getWalkAnimations().get(tempF.getFrame()), tempF.getX(), 400, this);
            }

            //goes through enemy infantries
            if(i < infantriesOFEnemy.size() )
            {
                tempE = infantriesOFEnemy.get(i);

                //draws the health bar
                g2d.setColor(Color.RED);
                g2d.fillRect(tempE.getX(),450,45, 10);

                g2d.setColor(Color.GREEN);
                double percentageOFHealth =  ((double)tempE.getHealth()) / ((double)tempE.getSpawnHealth());
                int greenPixels = (int)(percentageOFHealth * 45);
                g2d.fillRect(tempE.getX(),450,greenPixels,10);

                //draws the Infantry Unit
                g2d.drawImage(tempE.getWalkAnimations().get(tempE.getFrame()), tempE.getX(), 400, this);
            }

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
