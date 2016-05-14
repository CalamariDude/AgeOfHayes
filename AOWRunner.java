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
    static ArrayList<AOWTurrets> turretsOFEnemy = new ArrayList();

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

    //create turret image
    Image AOWTurret;

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

    //Frames for eggPault
    Image eggPaultRest;
    Image eggPaultAttack1;
    Image eggPaultAttack2;
    Image eggPaultAttack3;


    //frames for dinoRider


    //frames for swordsMan
    Image swordsManMove1;
    Image swordsManMove2;
    Image swordsManMove3;
    Image swordsManAttack1;
    Image swordsManAttack2;
    Image swordsManAttack3;


    //frames for archer
    Image archerMove1;
    Image archerMove2;
    Image archerMove3;
    Image archerAttack1;
    Image archerAttack2;
    Image archerAttack3;

    //frames for knight
    Image knightMove1;
    Image knightMove2;
    Image knightMove3;
    Image knightAttack1;
    Image knightAttack2;
    Image knightAttack3;

    //frames for soldier
    Image soldierMove1;
    Image soldierMove2;
    Image soldierMove3;
    Image soldierAttack1;
    Image soldierAttack2;
    Image soldierAttack3;



//---------------------------------------------------End of Initializing All Images-------------------


//--------------------------------------------------Initializes All Infantry and Turrets---------------------------
    //Initializes Units
    AOWInfantry clubMan;
    AOWInfantry slinger;
    AOWInfantry dinoRider;
    AOWTurrets eggPault;

    AOWInfantry swordsMan;
    AOWInfantry archer;
    AOWInfantry knight;
    AOWTurrets catapault ;

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


//----------------------------------------------Initializes All Picture ArrayList For Turrets Frames-----
    ArrayList<Image> eggPaultArray = new ArrayList();


//------------------------------------------End of Initializing all ArrayLists--------------------------


    AOWInfantry clubManE;

    AOWInfantry clubMan2;

    AOWInfantry SlingerE;

    AOWInfantry Slinger2;




    public AOWRunner() throws IOException{

        //Creates base objects
        baseF = new AOWBase(1000, 500, 25);
        baseE = new AOWBase(1000, 500, 1200);

        //---------------------------------------Assign variables to pictures----------------------
        //background pictures
        prehistoric = ImageIO.read(new File("Resources\\Main Menu\\Prehistoric.jpg"));

        //base pictures
        base1 = ImageIO.read(new File("Resources\\Tier 1\\Base.jpg"));
        base2 = ImageIO.read(new File("Resources\\Tier 1\\Base.jpg"));

        //levelUp picture
        levelUp = ImageIO.read(new File("Resources\\Main Menu\\levelUp.jpg"));

        //summon infantry pictures
        AOWMelee = ImageIO.read(new File("Resources\\Main Menu\\AOWMelee.jpg"));
        AOWRanged = ImageIO.read(new File("Resources\\Main Menu\\AOWRanged.jpg"));
        AOWTank = ImageIO.read(new File("Resources\\Main Menu\\AOWTank.jpg"));
        AOWTurret = ImageIO.read(new File("Resources\\Main Menu\\turret.jpg"));

        //create turret pictures
        //turret = ImageIO.read(new File("Resources\\Main Menu\\turret.jpg"));

        //clubMan pictures
        clubManMove1 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove1.jpg"));
        clubManMove2 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove2.jpg"));
        clubManMove3 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove3.jpg"));

        //slinger pictures
        SlingerMove1 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove1.jpg"));
        SlingerMove2 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove2.jpg"));
        SlingerMove3 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove3.jpg"));


        //Turret pictures
        eggPaultRest = ImageIO.read(new File("Resources\\Tier 1\\TurretRest.jpg"));
        eggPaultAttack1 = ImageIO.read(new File("Resources\\Tier 1\\TurretAttack1.jpg"));
        eggPaultAttack2=  ImageIO.read(new File("Resources\\Tier 1\\TurretAttack2.jpg"));
        eggPaultAttack3=  ImageIO.read(new File("Resources\\Tier 1\\TurretAttack3.jpg"));

        //swordsMan pictures
        swordsManMove1 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove1.jpg"));
        swordsManMove2 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove2.jpg"));
        swordsManMove3 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove3.jpg"));
        swordsManAttack1 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack1.jpg"));
        swordsManAttack2 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack2.jpg"));
        swordsManAttack3 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack3.jpg"));

        //archer pictures
        archerMove1 = ImageIO.read(new File("Resources\\Tier 2\\archerMove1.jpg"));
        archerMove2 = ImageIO.read(new File("Resources\\Tier 2\\archerMove2.jpg"));
        archerMove3 = ImageIO.read(new File("Resources\\Tier 2\\archerMove3.jpg"));
        archerAttack1 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack1.jpg"));
        archerAttack2 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack2.jpg"));
        archerAttack3 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack3.jpg"));

        //knight pictures
        knightMove1 = ImageIO.read(new File("Resources\\Tier 2\\knightMove1.jpg"));
        knightMove2 = ImageIO.read(new File("Resources\\Tier 2\\knightMove2.jpg"));
        knightMove3 = ImageIO.read(new File("Resources\\Tier 2\\knightMove3.jpg"));
        knightAttack1 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack1.jpg"));
        knightAttack2 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack2.jpg"));
        knightAttack3 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack3.jpg"));

        //soldier pictures
        soldierMove1 = ImageIO.read(new File("Resources\\Tier 3\\soldierMove1.jpg"));
        soldierMove2 = ImageIO.read(new File("Resources\\Tier 3\\soldierMove2.jpg"));
        soldierMove3 = ImageIO.read(new File("Resources\\Tier 3\\soldierMove3.jpg"));
        soldierAttack1 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack1.jpg"));
        soldierAttack2 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack2.jpg"));
        soldierAttack3 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack3.jpg"));

        //------------------------------------End of Assign variables to pictures-----------------------


        //----------------------------------Assign Pictures to Pictures ArrayList-----------------------
        //clubMan arrayList
        clubArray.add(clubManMove1);
        clubArray.add(clubManMove2);
        clubArray.add(clubManMove3);
        clubArray.add(clubManMove3);
        clubArray.add(clubManMove2);
        clubArray.add(clubManMove1);

        //slinger arrayList
        slingerArray.add(SlingerMove1);
        slingerArray.add(SlingerMove2);
        slingerArray.add(SlingerMove3);
        slingerArray.add(SlingerMove3);
        slingerArray.add(SlingerMove2);
        slingerArray.add(SlingerMove1);

        //eggPault arrayList
        eggPaultArray.add(eggPaultRest);
        eggPaultArray.add(eggPaultAttack1);
        eggPaultArray.add(eggPaultAttack2);
        eggPaultArray.add(eggPaultAttack3);

        //swordsMan arrayList
        swordsManArray.add(swordsManMove1);
        swordsManArray.add(swordsManMove2);
        swordsManArray.add(swordsManMove3);
        swordsManArray.add(swordsManAttack1);
        swordsManArray.add(swordsManAttack2);
        swordsManArray.add(swordsManAttack3);

        //archer arrayList
        archerArray.add(archerMove1);
        archerArray.add(archerMove2);
        archerArray.add(archerMove3);
        archerArray.add(archerAttack1);
        archerArray.add(archerAttack2);
        archerArray.add(archerAttack3);

        //knight arrayList
        knightArray.add(knightMove1);
        knightArray.add(knightMove2);
        knightArray.add(knightMove3);
        knightArray.add(knightAttack1);
        knightArray.add(knightAttack2);
        knightArray.add(knightAttack3);

        //soldier arrayList
        soldierArray.add(soldierMove1);
        soldierArray.add(soldierMove2);
        soldierArray.add(soldierMove3);
        soldierArray.add(soldierAttack1);
        soldierArray.add(soldierAttack2);
        soldierArray.add(soldierAttack3);



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

        clubMan = new AOWInfantry(25, 5, 50, 1, 75, 60, 50, 80, clubArray );
        slinger = new AOWInfantry(5, 4, 200, 1, 40, 60, 50, 80, slingerArray);

        eggPault = new AOWTurrets(10,5,300,1,150,10,eggPaultArray);

	//	dinoRider = new AOWInfantry(40, 3, 100, 1, 125, 90, 70, 110, 100);

        swordsMan = new AOWInfantry(50, 5, 50, 2, 150, 90, 50, 110, swordsManArray);
        archer = new AOWInfantry(40, 4, 200, 2, 90, 90, 50, 110, archerArray);
        knight = new AOWInfantry(80, 3, 100, 2, 250, 120, 70, 140, knightArray);
     //   catapault = new AOWTurrets(20, 4, 300, 2, 200);

        soldier = new AOWInfantry(80, 5, 50, 3, 300, 120, 70, 140, soldierArray);
      //  sniper = new AOWInfantry(65, 4, 300, 3, 200, 120, 70, 140, 100);
     //   tank = new AOWInfantry(150, 3, 100, 3, 500, 190, 100, 220, 100);
     //   rocketLauncher = new AOWTurrets(70, 3, 400, 3, 250);

     //  blader = new AOWInfantry(150, 5, 50, 4, 400, 200, 120, 220, 100);
     //   blaster = new AOWInfantry(130, 4, 200, 4, 300, 200, 120, 220, 100);
      //  HayesWrath = new AOWInfantry(300, 3, 100, 4, 1500, 300, 275, 330, 100);
      //  plasmaCannon = new AOWTurrets(75, 4, 300, 4, 1000);

        //----------------------------------End Of Infantry Objects----------------------------

        SlingerE = new AOWInfantry(5, 4, 200, 0, 40, 60, 50, 80,  slingerArray);
        Slinger2 = new AOWInfantry(5, 4, 200, 0, 40, 60, 50, 80,  slingerArray);

        clubManE = new AOWInfantry(25, 5, 50, 0, 75, 60, 50, 80,  clubArray);

        clubMan2 = new AOWInfantry(25, 5, 50, 0, 75, 60, 50, 80, clubArray );


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
        turrets.add(catapault);
        turrets.add(rocketLauncher);
        turrets.add(plasmaCannon);


        //------------------testing
        infantriesOFEnemy.add(new AOWInfantry(clubManE));
        //---------------------------------

        //-----------------Testing Turrets
        //replace with the mouselistener to add

        //turretsOFFriendly.add(eggPault);
        //turretsOFEnemy.add(new AOWTurrets(eggPault));

        //----------------------------



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
                        if(baseF.getTier() == 1)
                        {
                            if (baseF.getMoney() >= clubMan.getCost())
                            {
                                AOWInfantry clubMan = new AOWInfantry(25, 5, 50, 1, 75, 60, 50, 80, clubArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), clubMan);

                                baseF.setMoney(baseF.getMoney() - clubMan.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");
                        }

                        else if(baseF.getTier() == 2)
                        {
                            if(baseF.getMoney() >= swordsMan.getCost())
                            {
                                swordsMan = new AOWInfantry(50, 5, 50, 2, 150, 90, 50, 110, swordsManArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), swordsMan);

                                baseF.setMoney(baseF.getMoney() - swordsMan.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                        else if(baseF.getTier() == 3)
                        {
                            if(baseF.getMoney() >= soldier.getCost())
                            {
                                soldier = new AOWInfantry(80, 5, 50, 3, 300, 120, 70, 140, soldierArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), soldier);

                                baseF.setMoney(baseF.getMoney() - soldier.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                        else if(baseF.getTier() == 4)
                        {
                            if(baseF.getMoney() >= blader.getCost())
                            {
                                blader = new AOWInfantry(150, 5, 50, 4, 400, 200, 120, 220, bladerArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), blader);

                                baseF.setMoney(baseF.getMoney() - blader.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                    }
                }//end of if clicked melee button


                //Create ranged minion
                else if (e.getX() > 50 && e.getX() < 95 && e.getY() > 500 && e.getY() < 545)
                {
                    if (infantriesOFFriendly.size() < 10)
                    {
                        if(baseF.getTier() == 1)
                        {
                            if (baseF.getMoney() >= slinger.getCost())
                            {
                                AOWInfantry slinger = new AOWInfantry(5, 4, 200, 1, 40, 60, 50, 80, slingerArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), slinger);

                                baseF.setMoney(baseF.getMoney() - slinger.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");
                        }

                        else if(baseF.getTier() == 2)
                        {
                            if (baseF.getMoney() >= archer.getCost())
                            {
                                archer = new AOWInfantry(40, 4, 200, 2, 90, 90, 50, 110, archerArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), archer);

                                baseF.setMoney(baseF.getMoney() - archer.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                        else if(baseF.getTier() == 3)
                        {
                            if (baseF.getMoney() >= archer.getCost())
                            {
                                sniper = new AOWInfantry(65, 4, 300, 3, 200, 120, 70, 140, sniperArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), sniper);

                                baseF.setMoney(baseF.getMoney() - sniper.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                        else if(baseF.getTier() == 4)
                        {
                            if(baseF.getMoney() >= blaster.getCost())
                            {
                                blaster = new AOWInfantry(130, 4, 200, 4, 300, 200, 120, 220, blasterArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(),blaster);

                                baseF.setMoney(baseF.getMoney() - blaster.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                    }


                }//end of if clicked ranged button

                //Create tank minion
                else if (e.getX() > 100 && e.getX() < 145 && e.getY() > 500 && e.getY() < 545)
                {
                    if (infantriesOFFriendly.size() < 10)
                    {
                        if (baseF.getTier() == 1)
                        {
                            if (baseF.getMoney() >= knight.getCost())
                            {
                                dinoRider = new AOWInfantry(40, 3, 100, 1, 125, 90, 70, 110, dinoRiderArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), dinoRider);

                                baseF.setMoney(baseF.getMoney() - dinoRider.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");
                        }

                        else if (baseF.getTier() == 2)
                        {
                            if (baseF.getMoney() >= knight.getCost())
                            {

                                knight = new AOWInfantry(80, 3, 100, 2, 250, 120, 70, 140, knightArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), knight);

                                baseF.setMoney(baseF.getMoney() - knight.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");
                        }

                        else if(baseF.getTier() == 3)
                        {
                            if(baseF.getMoney() >= tank.getCost())
                            {
                                tank = new AOWInfantry(150, 3, 100, 3, 500, 190, 100, 220, tankArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), tank);

                                baseF.setMoney(baseF.getMoney() - tank.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                        else if(baseF.getTier() == 4)
                        {
                            if(baseF.getMoney() >= tank.getCost())
                            {
                                HayesWrath = new AOWInfantry(300, 3, 100, 4, 1500, 300, 275, 330, HayesWrathArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), HayesWrath);

                                baseF.setMoney(baseF.getMoney() - HayesWrath.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                    }

                }

                //creates turrets
                else if (e.getX() > 150 && e.getX() < 195 && e.getY() > 500 && e.getY() < 545)
                {
                    if (baseF.getTier() == 1) {
                        if (baseF.getMoney() >= eggPault.getCost())
                        {
                            if (turretsOFFriendly.size() == 0)
                            {
                                eggPault = new AOWTurrets(10,5,300,1,150,10,eggPaultArray);
                                baseF.setMoney(baseF.getMoney() - eggPault.getCost());
                                turretsOFFriendly.add(eggPault);
                            }
                            else
                            {
                                eggPault = new AOWTurrets(10,5,300,1,150,10,eggPaultArray);
                                baseF.setMoney(baseF.getMoney() - eggPault.getCost());
                                turretsOFFriendly.set(0,eggPault);
                            }
                        }
                        else
                        {
                            System.out.println("Insufficient Funds");
                        }
                    }
                    else if (baseF.getTier() == 2)
                    {
                        if (baseF.getMoney() >= catapault.getCost())
                        {
                            if (turretsOFFriendly.size() == 0)
                            {
                                //   catapault = new AOWTurrets(20, 4, 300, 2, 200);
                                baseF.setMoney(baseF.getMoney() - catapault.getCost());
                                turretsOFFriendly.add(catapault);
                            }
                            else
                            {

                                //   catapault = new AOWTurrets(20, 4, 300, 2, 200);
                                baseF.setMoney(baseF.getMoney() - catapault.getCost());
                                turretsOFFriendly.set(0,catapault);
                            }
                        }
                        else
                        {
                            System.out.println("Insufficient Funds");
                        }
                    }
                    else if (baseF.getTier() == 3)
                    {
                        if (baseF.getMoney() >= rocketLauncher.getCost())
                        {
                            if (turretsOFFriendly.size() == 0)
                            {
                                //   rocketLauncher = new AOWTurrets(70, 3, 400, 3, 250);
                                baseF.setMoney(baseF.getMoney() - rocketLauncher.getCost());
                                turretsOFFriendly.add(rocketLauncher);
                            }
                            else
                            {
                                //   rocketLauncher = new AOWTurrets(70, 3, 400, 3, 250);
                                baseF.setMoney(baseF.getMoney() - rocketLauncher.getCost());
                                turretsOFFriendly.set(0,rocketLauncher);
                            }
                        }
                        else
                        {
                            System.out.println("Insufficient Funds");
                        }
                    }
                    else if (baseF.getTier() == 4)
                    {
                        if (baseF.getMoney() >= plasmaCannon.getCost())
                        {
                            if (turretsOFFriendly.size() == 0)
                            {
                                //  plasmaCannon = new AOWTurrets(75, 4, 300, 4, 1000);
                                baseF.setMoney(baseF.getMoney() - plasmaCannon.getCost());
                                turretsOFFriendly.add(plasmaCannon);
                            }
                            else
                            {
                                //  plasmaCannon = new AOWTurrets(75, 4, 300, 4, 1000);
                                baseF.setMoney(baseF.getMoney() - plasmaCannon.getCost());
                                turretsOFFriendly.set(0,plasmaCannon);
                            }
                        }
                        else
                        {
                            System.out.println("Insufficient Funds");
                        }
                    }

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

        //draws the summon infantry buttons
        g2d.drawImage(AOWMelee,0,500, this);
        g2d.drawImage(AOWRanged,50,500, this);
        g2d.drawImage(AOWTank,100,500,this );

        //draws the summon turret buttons
        g2d.drawImage(AOWTurret,150,500,this );

        //draws the levelUp button
        g2d.drawImage(levelUp, 1100, 500, this);

        //draws the create turret button
      // g2d.drawImage(turret, )

        //draws the base
        g2d.drawImage(base1, 0, 300, this);
        g2d.drawImage(base2, 1100, 300, this);


        AOWInfantry tempF;
        AOWInfantry tempE;
        AOWTurrets turrF;
        AOWTurrets turrE;

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
        //goes through friendly turrets
        for(int i = 0; i<turretsOFFriendly.size();i++ ){
            turrF = turretsOFFriendly.get(i);


            g2d.drawImage(turrF.getAnimations().get(turrF.getFrame()),turrF.getX(),350, this);

        }

        //goes through enemy turrets
        for(int i = 0; i<turretsOFEnemy.size();i++ ){
            turrE = turretsOFEnemy.get(i);


            g2d.drawImage(turrE.getAnimations().get(turrE.getFrame()),turrE.getX(),350, this);

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
