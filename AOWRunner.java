import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Future;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AOWRunner extends JPanel implements ActionListener{
    ArrayList<AOWInfantry> infantries = new ArrayList();
    ArrayList<AOWTurrets> turrets = new ArrayList();
    static ArrayList<AOWInfantry> infantriesOFFriendly = new ArrayList();
    static ArrayList<AOWTurrets> turretsOFFriendly = new ArrayList();
    static ArrayList<AOWInfantry> infantriesOFEnemy = new ArrayList();
    static ArrayList<AOWTurrets> turretsOFEnemy = new ArrayList();
    static ArrayList<AOWInfantry> infantriese = new ArrayList();
    static ArrayList<AOWTurrets> turretse = new ArrayList();

    int x;
    int y;

    static AOWBase baseF;
    static AOWBase baseE;
    KeyListener k;

    static char c;

//------------------------------------------------------Initializes All Images----------------------
    //backgrounds images
    Image prehistoric;
    Image Medieval;
    Image Modern;
    Image Futuristic;

    //base1 and base2 images
    Image base1;
    Image base2;

    Image medievalBase1;
    Image medievalBase2;

    Image militaryBase1;
    Image militaryBase2;

    Image futureBase1;
    Image futureBase2;


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
    Image clubManAttack1;
    Image clubManAttack2;
    Image clubManAttack3;

    //frames for enemy clubMan
    Image clubManEMove1;
    Image clubManEMove2;
    Image clubManEMove3;
    Image clubManEAttack1;
    Image clubManEAttack2;
    Image clubManEAttack3;

    //frames for slinger
    Image SlingerMove1;
    Image SlingerMove2;
    Image SlingerMove3;
    Image SlingerAttack1;
    Image SlingerAttack2;
    Image SlingerAttack3;

    //frames for enemy slinger
    Image SlingerEMove1;
    Image SlingerEMove2;
    Image SlingerEMove3;
    Image SlingerEAttack1;
    Image SlingerEAttack2;
    Image SlingerEAttack3;

    //frames for dinoRider
    Image dinoRiderMove1;
    Image dinoRiderMove2;
    Image dinoRiderMove3;
    Image dinoRiderAttack1;
    Image dinoRiderAttack2;
    Image dinoRiderAttack3;

    //frames for enemy dinoRider
    Image dinoRiderEMove1;
    Image dinoRiderEMove2;
    Image dinoRiderEMove3;
    Image dinoRiderEAttack1;
    Image dinoRiderEAttack2;
    Image dinoRiderEAttack3;

    //Frames for eggPault
    Image eggPaultRest;
    Image eggPaultAttack1;
    Image eggPaultAttack2;
    Image eggPaultAttack3;

    //frames for enemy eggPault
    Image eggPaultERest;
    Image eggPaultEAttack1;
    Image eggPaultEAttack2;
    Image eggPaultEAttack3;

    //frames for swordsMan
    Image swordsManMove1;
    Image swordsManMove2;
    Image swordsManMove3;
    Image swordsManAttack1;
    Image swordsManAttack2;
    Image swordsManAttack3;

    //frames for enemy swordsMan
    Image swordsManEMove1;
    Image swordsManEMove2;
    Image swordsManEMove3;
    Image swordsManEAttack1;
    Image swordsManEAttack2;
    Image swordsManEAttack3;

    //frames for archer
    Image archerMove1;
    Image archerMove2;
    Image archerMove3;
    Image archerAttack1;
    Image archerAttack2;
    Image archerAttack3;

    //frames for enemy archer
    Image archerEMove1;
    Image archerEMove2;
    Image archerEMove3;
    Image archerEAttack1;
    Image archerEAttack2;
    Image archerEAttack3;

    //frames for knight
    Image knightMove1;
    Image knightMove2;
    Image knightMove3;
    Image knightAttack1;
    Image knightAttack2;
    Image knightAttack3;

    //frames for enemy knight
    Image knightEMove1;
    Image knightEMove2;
    Image knightEMove3;
    Image knightEAttack1;
    Image knightEAttack2;
    Image knightEAttack3;

    //frames for catapault
    Image catapaultRest;
    Image catapaultAttack1;
    Image catapaultAttack2;
    Image catapaultAttack3;

    //frames for enemy catapault
    Image catapaultERest;
    Image catapaultEAttack1;
    Image catapaultEAttack2;
    Image catapaultEAttack3;

    //frames for soldier
    Image soldierMove1;
    Image soldierMove2;
    Image soldierMove3;
    Image soldierAttack1;
    Image soldierAttack2;
    Image soldierAttack3;

    //frames for enemy soldier
    Image soldierEMove1;
    Image soldierEMove2;
    Image soldierEMove3;
    Image soldierEAttack1;
    Image soldierEAttack2;
    Image soldierEAttack3;

    //frames for sniper
    Image sniperMove1;
    Image sniperMove2;
    Image sniperMove3;
    Image sniperAttack1;
    Image sniperAttack2;
    Image sniperAttack3;

    //frames for enemy sniper
    Image sniperEMove1;
    Image sniperEMove2;
    Image sniperEMove3;
    Image sniperEAttack1;
    Image sniperEAttack2;
    Image sniperEAttack3;

    //frames for tank
    Image tankMove1;
    Image tankMove2;
    Image tankMove3;
    Image tankAttack1;
    Image tankAttack2;
    Image tankAttack3;

    //frames for enemy tank
    Image tankEMove1;
    Image tankEMove2;
    Image tankEMove3;
    Image tankEAttack1;
    Image tankEAttack2;
    Image tankEAttack3;

    //frames for rocketLauncher
    Image rocketLauncherRest;
    Image rocketLauncherAttack1;
    Image rocketLauncherAttack2;
    Image rocketLauncherAttack3;

    //frames for enemy rocketLauncher
    Image rocketLauncherERest;
    Image rocketLauncherEAttack1;
    Image rocketLauncherEAttack2;
    Image rocketLauncherEAttack3;

    //frames for blader
    Image bladerMove1;
    Image bladerMove2;
    Image bladerMove3;
    Image bladerAttack1;
    Image bladerAttack2;
    Image bladerAttack3;

    //frames for enemy blader
    Image bladerEMove1;
    Image bladerEMove2;
    Image bladerEMove3;
    Image bladerEAttack1;
    Image bladerEAttack2;
    Image bladerEAttack3;


    //frames for blaster
    Image blasterMove1;
    Image blasterMove2;
    Image blasterMove3;
    Image blasterAttack1;
    Image blasterAttack2;
    Image blasterAttack3;

    //frames for enemy blaster
    Image blasterEMove1;
    Image blasterEMove2;
    Image blasterEMove3;
    Image blasterEAttack1;
    Image blasterEAttack2;
    Image blasterEAttack3;

    //frames for HayesWrath
    Image HayesWrathMove1;
    Image HayesWrathMove2;
    Image HayesWrathMove3;
    Image HayesWrathAttack1;
    Image HayesWrathAttack2;
    Image HayesWrathAttack3;

    //frames for enemy HayesWrath
    Image HayesWrathEMove1;
    Image HayesWrathEMove2;
    Image HayesWrathEMove3;
    Image HayesWrathEAttack1;
    Image HayesWrathEAttack2;
    Image HayesWrathEAttack3;

    //frames for plasmaCannon
    Image plasmaCannonRest;
    Image plasmaCannonAttack1;
    Image plasmaCannonAttack2;
    Image plasmaCannonAttack3;

    //frames for enemy plasmaCannon
    Image plasmaCannonERest;
    Image plasmaCannonEAttack1;
    Image plasmaCannonEAttack2;
    Image plasmaCannonEAttack3;


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
    //friendly infantry ArrayList
    ArrayList<Image> clubArray = new ArrayList();
    ArrayList<Image> slingerArray = new ArrayList();
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

    //enemy infantry ArrayList
    ArrayList<Image> clubArrayE = new ArrayList();
    ArrayList<Image> slingerArrayE = new ArrayList();
    ArrayList<Image> dinoRiderArrayE = new ArrayList();
    ArrayList<Image> swordsManArrayE = new ArrayList();
    ArrayList<Image> archerArrayE = new ArrayList();
    ArrayList<Image> knightArrayE = new ArrayList();
    ArrayList<Image> soldierArrayE = new ArrayList();
    ArrayList<Image> sniperArrayE = new ArrayList();
    ArrayList<Image> tankArrayE = new ArrayList();
    ArrayList<Image> bladerArrayE= new ArrayList();
    ArrayList<Image> blasterArrayE = new ArrayList();
    ArrayList<Image> HayesWrathArrayE = new ArrayList();


//----------------------------------------------Initializes All Picture ArrayList For Turrets Frames-----
    //friendly turrets
    ArrayList<Image> eggPaultArray = new ArrayList();
    ArrayList<Image> catapaultArray = new ArrayList();
    ArrayList<Image> rocketLauncherArray = new ArrayList();
    ArrayList<Image> plasmaCannonArray = new ArrayList();

    //enemy turrets
    ArrayList<Image> eggPaultArrayE = new ArrayList();
    ArrayList<Image> catapaultArrayE = new ArrayList();
    ArrayList<Image> rocketLauncherArrayE = new ArrayList();
    ArrayList<Image> plasmaCannonArrayE = new ArrayList();


//------------------------------------------End of Initializing all ArrayLists--------------------------


    AOWInfantry clubManE;

    AOWInfantry clubMan2;

    AOWInfantry SlingerE;

    AOWInfantry Slinger2;




    public AOWRunner() throws IOException{



        //Creates base objects
        baseF = new AOWBase(1000, 500000, 25);
        baseE = new AOWBase(1000, 500000, 1200);

        //---------------------------------------Assign variables to pictures----------------------
        //background pictures
        prehistoric = ImageIO.read(new File("Resources\\Main Menu\\Prehistoric.jpg"));
        Medieval = ImageIO.read(new File("Resources\\Main Menu\\Medieval.jpg"));
        Modern = ImageIO.read(new File("Resources\\Main Menu\\Modern.jpg"));
        Futuristic = ImageIO.read(new File("Resources\\Main Menu\\Futuristic.jpg"));

        //base pictures
        //tier 1
        base1 = ImageIO.read(new File("Resources\\Tier 1\\Base.jpg"));
        base2 = ImageIO.read(new File("Resources\\Tier 1\\Basee.jpg"));

        //tier 2
        medievalBase1 = ImageIO.read(new File("Resources\\Tier 2\\Medieval Base.jpg"));
        medievalBase2 = ImageIO.read(new File("Resources\\Tier 2\\Medieval Basee.jpg"));

        //tier 3
        militaryBase1 = ImageIO.read(new File("Resources\\Tier 3\\Military Base.jpg"));
        militaryBase2 = ImageIO.read(new File("Resources\\Tier 3\\Military Basee.jpg"));

        //tier 4
        futureBase1 = ImageIO.read(new File("Resources\\Tier 4\\Future Base.jpg"));
        futureBase2 = ImageIO.read(new File("Resources\\Tier 4\\Future Basee.jpg"));

        //levelUp picture
        levelUp = ImageIO.read(new File("Resources\\Main Menu\\levelUp.jpg"));

        //summon infantry pictures
        AOWMelee = ImageIO.read(new File("Resources\\Main Menu\\AOWMelee.jpg"));
        AOWRanged = ImageIO.read(new File("Resources\\Main Menu\\AOWRanged.jpg.png"));
        AOWTank = ImageIO.read(new File("Resources\\Main Menu\\AOWTank.jpg"));
        AOWTurret = ImageIO.read(new File("Resources\\Main Menu\\turret.jpg"));

        //create turret pictures
        //turret = ImageIO.read(new File("Resources\\Main Menu\\turret.jpg"));

        //friendly clubMan pictures
        clubManMove1 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove1.jpg"));
        clubManMove2 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove2.jpg"));
        clubManMove3 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove3.jpg"));
        clubManAttack1 = ImageIO.read(new File("Resources\\Tier 1\\clubManAttack1.jpg"));
        clubManAttack2 = ImageIO.read(new File("Resources\\Tier 1\\clubManAttack2.jpg"));
        clubManAttack3 = ImageIO.read(new File("Resources\\Tier 1\\clubManAttack3.jpg"));

        //enemy clubMan pictures
        clubManEMove1 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove1e.jpg"));
        clubManEMove2 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove2e.jpg"));
        clubManEMove3 = ImageIO.read(new File("Resources\\Tier 1\\clubManMove3e.jpg"));
        clubManEAttack1 = ImageIO.read(new File("Resources\\Tier 1\\clubManAttack1e.jpg"));
        clubManEAttack2 = ImageIO.read(new File("Resources\\Tier 1\\clubManAttack2e.jpg"));
        clubManEAttack3 = ImageIO.read(new File("Resources\\Tier 1\\clubManAttack3e.jpg"));

        //slinger pictures
        SlingerMove1 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove1.jpg"));
        SlingerMove2 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove2.jpg"));
        SlingerMove3 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove3.jpg"));
        SlingerAttack1 = ImageIO.read(new File("Resources\\Tier 1\\SlingerAttack1.jpg"));
        SlingerAttack2 = ImageIO.read(new File("Resources\\Tier 1\\SlingerAttack2.jpg"));
        SlingerAttack3 = ImageIO.read(new File("Resources\\Tier 1\\SlingerAttack3.jpg"));

        //enemy slinger pictures
        SlingerEMove1 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove1e.jpg"));
        SlingerEMove2 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove2e.jpg"));
        SlingerEMove3 = ImageIO.read(new File("Resources\\Tier 1\\SlingerMove3e.jpg"));
        SlingerEAttack1 = ImageIO.read(new File("Resources\\Tier 1\\SlingerAttack1e.jpg"));
        SlingerEAttack2 = ImageIO.read(new File("Resources\\Tier 1\\SlingerAttack2e.jpg"));
        SlingerEAttack3 = ImageIO.read(new File("Resources\\Tier 1\\SlingerAttack3e.jpg"));

        //dinoRider pictures
        dinoRiderMove1 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderMove1.jpg"));
        dinoRiderMove2 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderMove2.jpg"));
        dinoRiderMove3 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderMove3.jpg"));
        dinoRiderAttack1 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderAttack1.jpg"));
        dinoRiderAttack2 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderAttack2.jpg"));
        dinoRiderAttack3 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderAttack3.jpg"));

        //dinoRider pictures
        dinoRiderEMove1 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderMove1e.jpg"));
        dinoRiderEMove2 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderMove2e.jpg"));
        dinoRiderEMove3 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderMove3e.jpg"));
        dinoRiderEAttack1 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderAttack1e.jpg"));
        dinoRiderEAttack2 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderAttack2e.jpg"));
        dinoRiderEAttack3 = ImageIO.read(new File("Resources\\Tier 1\\dinoRiderAttack3e.jpg"));

        //eggPault pictures
        eggPaultRest = ImageIO.read(new File("Resources\\Tier 1\\TurretRest.jpg"));
        eggPaultAttack1 = ImageIO.read(new File("Resources\\Tier 1\\TurretAttack1.jpg"));
        eggPaultAttack2=  ImageIO.read(new File("Resources\\Tier 1\\TurretAttack2.jpg"));
        eggPaultAttack3=  ImageIO.read(new File("Resources\\Tier 1\\TurretAttack3.jpg"));

        //enemy eggPault pictures
        eggPaultERest = ImageIO.read(new File("Resources\\Tier 1\\TurretReste.jpg"));
        eggPaultEAttack1 = ImageIO.read(new File("Resources\\Tier 1\\TurretAttack1e.jpg"));
        eggPaultEAttack2=  ImageIO.read(new File("Resources\\Tier 1\\TurretAttack2e.jpg"));
        eggPaultEAttack3=  ImageIO.read(new File("Resources\\Tier 1\\TurretAttack3e.jpg"));

        //swordsMan pictures
        swordsManMove1 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove1.jpg"));
        swordsManMove2 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove2.jpg"));
        swordsManMove3 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove3.jpg"));
        swordsManAttack1 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack1.jpg"));
        swordsManAttack2 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack2.jpg"));
        swordsManAttack3 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack3.jpg"));

        //enemy swordsMan pictures
        swordsManEMove1 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove1e.jpg"));
        swordsManEMove2 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove2e.jpg"));
        swordsManEMove3 = ImageIO.read(new File("Resources\\Tier 2\\swordsManMove3e.jpg"));
        swordsManEAttack1 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack1e.jpg"));
        swordsManEAttack2 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack2e.jpg"));
        swordsManEAttack3 = ImageIO.read(new File("Resources\\Tier 2\\swordsManAttack3e.jpg"));

        //archer pictures
        archerMove1 = ImageIO.read(new File("Resources\\Tier 2\\archerMove1.jpg"));
        archerMove2 = ImageIO.read(new File("Resources\\Tier 2\\archerMove2.jpg"));
        archerMove3 = ImageIO.read(new File("Resources\\Tier 2\\archerMove3.jpg"));
        archerAttack1 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack1.jpg"));
        archerAttack2 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack2.jpg"));
        archerAttack3 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack3.jpg"));

        //enemy archer pictures
        archerEMove1 = ImageIO.read(new File("Resources\\Tier 2\\archerMove1e.jpg"));
        archerEMove2 = ImageIO.read(new File("Resources\\Tier 2\\archerMove2e.jpg"));
        archerEMove3 = ImageIO.read(new File("Resources\\Tier 2\\archerMove3e.jpg"));
        archerEAttack1 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack1e.jpg"));
        archerEAttack2 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack2e.jpg"));
        archerEAttack3 = ImageIO.read(new File("Resources\\Tier 2\\archerAttack3e.jpg"));

        //knight pictures
        knightMove1 = ImageIO.read(new File("Resources\\Tier 2\\knightMove1.jpg"));
        knightMove2 = ImageIO.read(new File("Resources\\Tier 2\\knightMove2.jpg"));
        knightMove3 = ImageIO.read(new File("Resources\\Tier 2\\knightMove3.jpg"));
        knightAttack1 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack1.jpg"));
        knightAttack2 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack2.jpg"));
        knightAttack3 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack3.jpg"));

        //knight pictures
        knightEMove1 = ImageIO.read(new File("Resources\\Tier 2\\knightMove1e.jpg"));
        knightEMove2 = ImageIO.read(new File("Resources\\Tier 2\\knightMove2e.jpg"));
        knightEMove3 = ImageIO.read(new File("Resources\\Tier 2\\knightMove3e.jpg"));
        knightEAttack1 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack1e.jpg"));
        knightEAttack2 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack2e.jpg"));
        knightEAttack3 = ImageIO.read(new File("Resources\\Tier 2\\knightAttack3e.jpg"));

        //catapault pictures
        catapaultRest = ImageIO.read(new File("Resources\\Tier 2\\CatapultRest.jpg"));
        catapaultAttack1 = ImageIO.read(new File("Resources\\Tier 2\\CatapultAttack1.jpg"));
        catapaultAttack2 = ImageIO.read(new File("Resources\\Tier 2\\CatapultAttack2.jpg"));
        catapaultAttack3 = ImageIO.read(new File("Resources\\Tier 2\\CatapultAttack3.jpg"));

        //enemy catapault pictures
        catapaultERest = ImageIO.read(new File("Resources\\Tier 2\\CatapultReste.jpg"));
        catapaultEAttack1 = ImageIO.read(new File("Resources\\Tier 2\\CatapultAttack1e.jpg"));
        catapaultEAttack2 = ImageIO.read(new File("Resources\\Tier 2\\CatapultAttack2e.jpg"));
        catapaultEAttack3 = ImageIO.read(new File("Resources\\Tier 2\\CatapultAttack3e.jpg"));

        //soldier pictures
        soldierMove1 = ImageIO.read(new File("Resources\\Tier 3\\soliderMove1.jpg"));
        soldierMove2 = ImageIO.read(new File("Resources\\Tier 3\\soliderMove2.jpg"));
        soldierMove3 = ImageIO.read(new File("Resources\\Tier 3\\soliderMove3.jpg"));
        soldierAttack1 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack1.jpg"));
        soldierAttack2 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack2.jpg"));
        soldierAttack3 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack3.jpg"));

        //enemy soldier pictures
        soldierEMove1 = ImageIO.read(new File("Resources\\Tier 3\\soliderMove1e.jpg"));
        soldierEMove2 = ImageIO.read(new File("Resources\\Tier 3\\soliderMove2e.jpg"));
        soldierEMove3 = ImageIO.read(new File("Resources\\Tier 3\\soliderMove3e.jpg"));
        soldierEAttack1 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack1e.jpg"));
        soldierEAttack2 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack2e.jpg"));
        soldierEAttack3 = ImageIO.read(new File("Resources\\Tier 3\\soldierAttack3e.jpg"));

        //sniper pictures
        sniperMove1 = ImageIO.read(new File("Resources\\Tier 3\\sniperMove1.jpg"));
        sniperMove2 = ImageIO.read(new File("Resources\\Tier 3\\sniperMove2.jpg"));
        sniperMove3 = ImageIO.read(new File("Resources\\Tier 3\\sniperMove3.jpg"));
        sniperAttack1 = ImageIO.read(new File("Resources\\Tier 3\\sniperAttack1.jpg"));
        sniperAttack2 = ImageIO.read(new File("Resources\\Tier 3\\sniperAttack2.jpg"));
        sniperAttack3 = ImageIO.read(new File("Resources\\Tier 3\\sniperAttack3.jpg"));

        //enemy sniper pictures
        sniperEMove1 = ImageIO.read(new File("Resources\\Tier 3\\sniperMove1e.jpg"));
        sniperEMove2 = ImageIO.read(new File("Resources\\Tier 3\\sniperMove2e.jpg"));
        sniperEMove3 = ImageIO.read(new File("Resources\\Tier 3\\sniperMove3e.jpg"));
        sniperEAttack1 = ImageIO.read(new File("Resources\\Tier 3\\sniperAttack1e.jpg"));
        sniperEAttack2 = ImageIO.read(new File("Resources\\Tier 3\\sniperAttack2e.jpg"));
        sniperEAttack3 = ImageIO.read(new File("Resources\\Tier 3\\sniperAttack3e.jpg"));

        //tank pictures
        tankMove1 = ImageIO.read(new File("Resources\\Tier 3\\tankMove1.jpg"));
        tankMove2 = ImageIO.read(new File("Resources\\Tier 3\\tankMove2.jpg"));
        tankMove3 = ImageIO.read(new File("Resources\\Tier 3\\tankMove3.jpg"));
        tankAttack1 = ImageIO.read(new File("Resources\\Tier 3\\tankAttack1.jpg"));
        tankAttack2 = ImageIO.read(new File("Resources\\Tier 3\\tankAttack2.jpg"));
        tankAttack3 = ImageIO.read(new File("Resources\\Tier 3\\tankAttack3.jpg"));

        //enemy tank pictures
        tankEMove1 = ImageIO.read(new File("Resources\\Tier 3\\tankMove1e.jpg"));
        tankEMove2 = ImageIO.read(new File("Resources\\Tier 3\\tankMove2e.jpg"));
        tankEMove3 = ImageIO.read(new File("Resources\\Tier 3\\tankMove3e.jpg"));
        tankEAttack1 = ImageIO.read(new File("Resources\\Tier 3\\tankAttack1e.jpg"));
        tankEAttack2 = ImageIO.read(new File("Resources\\Tier 3\\tankAttack2e.jpg"));
        tankEAttack3 = ImageIO.read(new File("Resources\\Tier 3\\tankAttack3e.jpg"));

        //rocketLauncher pictures
        rocketLauncherRest = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherRest.jpg"));
        rocketLauncherAttack1 = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherAttack1.jpg"));
        rocketLauncherAttack2 = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherAttack2.jpg"));
        rocketLauncherAttack3 = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherAttack3.jpg"));

        //enemy rocketLauncher pictures
        rocketLauncherERest = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherReste.jpg"));
        rocketLauncherEAttack1 = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherAttack1e.jpg"));
        rocketLauncherEAttack2 = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherAttack2e.jpg"));
        rocketLauncherEAttack3 = ImageIO.read(new File("Resources\\Tier 3\\rocketLauncherAttack3e.jpg"));

        //blader pictures
        bladerMove1 = ImageIO.read(new File("Resources\\Tier 4\\BladerMove1.jpg"));
        bladerMove2 = ImageIO.read(new File("Resources\\Tier 4\\BladerMove2.jpg"));
        bladerMove3 = ImageIO.read(new File("Resources\\Tier 4\\BladerMove3.jpg"));
        bladerAttack1 = ImageIO.read(new File("Resources\\Tier 4\\BladerAttack1.jpg"));
        bladerAttack2 = ImageIO.read(new File("Resources\\Tier 4\\BladerAttack2.jpg"));
        bladerAttack3 = ImageIO.read(new File("Resources\\Tier 4\\BladerAttack3.jpg"));

        //enemy blader pictures
        bladerEMove1 = ImageIO.read(new File("Resources\\Tier 4\\BladerMove1e.jpg"));
        bladerEMove2 = ImageIO.read(new File("Resources\\Tier 4\\BladerMove2e.jpg"));
        bladerEMove3 = ImageIO.read(new File("Resources\\Tier 4\\BladerMove3e.jpg"));
        bladerEAttack1 = ImageIO.read(new File("Resources\\Tier 4\\BladerAttack1e.jpg"));
        bladerEAttack2 = ImageIO.read(new File("Resources\\Tier 4\\BladerAttack2e.jpg"));
        bladerEAttack3 = ImageIO.read(new File("Resources\\Tier 4\\BladerAttack3e.jpg"));

        //blaster pictures
        blasterMove1 = ImageIO.read(new File("Resources\\Tier 4\\BlasterMove1.jpg"));
        blasterMove2 = ImageIO.read(new File("Resources\\Tier 4\\BlasterMove2.jpg"));
        blasterMove3 = ImageIO.read(new File("Resources\\Tier 4\\BlasterMove3.jpg"));
        blasterAttack1 = ImageIO.read(new File("Resources\\Tier 4\\BlasterAttack1.jpg"));
        blasterAttack2 = ImageIO.read(new File("Resources\\Tier 4\\BlasterAttack2.jpg"));
        blasterAttack3 = ImageIO.read(new File("Resources\\Tier 4\\BlasterAttack3.jpg"));

        //enemy blaster pictures
        blasterEMove1 = ImageIO.read(new File("Resources\\Tier 4\\BlasterMove1e.jpg"));
        blasterEMove2 = ImageIO.read(new File("Resources\\Tier 4\\BlasterMove2e.jpg"));
        blasterEMove3 = ImageIO.read(new File("Resources\\Tier 4\\BlasterMove3e.jpg"));
        blasterEAttack1 = ImageIO.read(new File("Resources\\Tier 4\\BlasterAttack1e.jpg"));
        blasterEAttack2 = ImageIO.read(new File("Resources\\Tier 4\\BlasterAttack2e.jpg"));
        blasterEAttack3 = ImageIO.read(new File("Resources\\Tier 4\\BlasterAttack3e.jpg"));

        //HayesWrath pictures
        HayesWrathMove1 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathMove1.jpg"));
        HayesWrathMove2 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathMove2.jpg"));
        HayesWrathMove3 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathMove3.jpg"));
        HayesWrathAttack1 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathAttack1.jpg"));
        HayesWrathAttack2 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathAttack2.jpg"));
        HayesWrathAttack3 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathAttack3.jpg"));

        //enemy HayesWrath pictures
        HayesWrathEMove1 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathMove1e.jpg"));
        HayesWrathEMove2 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathMove2e.jpg"));
        HayesWrathEMove3 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathMove3e.jpg"));
        HayesWrathEAttack1 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathAttack1e.jpg"));
        HayesWrathEAttack2 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathAttack2e.jpg"));
        HayesWrathEAttack3 = ImageIO.read(new File("Resources\\Tier 4\\HayesWrathAttack3e.jpg"));

        //plasmaCanon pictures
        plasmaCannonRest = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherRest.jpg"));
        plasmaCannonAttack1 = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherAttack1.jpg"));
        plasmaCannonAttack2 = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherAttack2.jpg"));
        plasmaCannonAttack3 = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherAttack3.jpg"));

        //enemy plasmaCanon pictures
        plasmaCannonERest = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherReste.jpg"));
        plasmaCannonEAttack1 = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherAttack1e.jpg"));
        plasmaCannonEAttack2 = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherAttack2e.jpg"));
        plasmaCannonEAttack3 = ImageIO.read(new File("Resources\\Tier 4\\plasmaLauncherAttack3e.jpg"));






        //------------------------------------End of Assign variables to pictures-----------------------


        //----------------------------------Assign Pictures to Pictures ArrayList-----------------------
        //clubMan arrayList
        clubArray.add(clubManMove1);
        clubArray.add(clubManMove2);
        clubArray.add(clubManMove3);
        clubArray.add(clubManAttack1);
        clubArray.add(clubManAttack2);
        clubArray.add(clubManAttack3);

        //enemy clubMan arrayList
        clubArrayE.add(clubManEMove1);
        clubArrayE.add(clubManEMove2);
        clubArrayE.add(clubManEMove3);
        clubArrayE.add(clubManEAttack1);
        clubArrayE.add(clubManEAttack2);
        clubArrayE.add(clubManEAttack3);

        //slinger arrayList
        slingerArray.add(SlingerMove1);
        slingerArray.add(SlingerMove2);
        slingerArray.add(SlingerMove3);
        slingerArray.add(SlingerAttack1);
        slingerArray.add(SlingerAttack2);
        slingerArray.add(SlingerAttack3);

        //enemy slinger arrayList
        slingerArrayE.add(SlingerEMove1);
        slingerArrayE.add(SlingerEMove2);
        slingerArrayE.add(SlingerEMove3);
        slingerArrayE.add(SlingerEAttack1);
        slingerArrayE.add(SlingerEAttack2);
        slingerArrayE.add(SlingerEAttack3);

        //dinoRider arrayList
        dinoRiderArray.add(dinoRiderMove1);
        dinoRiderArray.add(dinoRiderMove2);
        dinoRiderArray.add(dinoRiderMove3);
        dinoRiderArray.add(dinoRiderAttack1);
        dinoRiderArray.add(dinoRiderAttack2);
        dinoRiderArray.add(dinoRiderAttack3);

        //enemy dinoRider arrayList
        dinoRiderArrayE.add(dinoRiderEMove1);
        dinoRiderArrayE.add(dinoRiderEMove2);
        dinoRiderArrayE.add(dinoRiderEMove3);
        dinoRiderArrayE.add(dinoRiderEAttack1);
        dinoRiderArrayE.add(dinoRiderEAttack2);
        dinoRiderArrayE.add(dinoRiderEAttack3);

        //eggPault arrayList
        eggPaultArray.add(eggPaultRest);
        eggPaultArray.add(eggPaultAttack1);
        eggPaultArray.add(eggPaultAttack2);
        eggPaultArray.add(eggPaultAttack3);

        //enemy eggPault arrayList
        eggPaultArrayE.add(eggPaultERest);
        eggPaultArrayE.add(eggPaultEAttack1);
        eggPaultArrayE.add(eggPaultEAttack2);
        eggPaultArrayE.add(eggPaultEAttack3);

        //swordsMan arrayList
        swordsManArray.add(swordsManMove1);
        swordsManArray.add(swordsManMove2);
        swordsManArray.add(swordsManMove3);
        swordsManArray.add(swordsManAttack1);
        swordsManArray.add(swordsManAttack2);
        swordsManArray.add(swordsManAttack3);

        //enemy swordsMan arrayList
        swordsManArrayE.add(swordsManEMove1);
        swordsManArrayE.add(swordsManEMove2);
        swordsManArrayE.add(swordsManEMove3);
        swordsManArrayE.add(swordsManEAttack1);
        swordsManArrayE.add(swordsManEAttack2);
        swordsManArrayE.add(swordsManEAttack3);

        //archer arrayList
        archerArray.add(archerMove1);
        archerArray.add(archerMove2);
        archerArray.add(archerMove3);
        archerArray.add(archerAttack1);
        archerArray.add(archerAttack2);
        archerArray.add(archerAttack3);

        //enemy archer arrayList
        archerArrayE.add(archerEMove1);
        archerArrayE.add(archerEMove2);
        archerArrayE.add(archerEMove3);
        archerArrayE.add(archerEAttack1);
        archerArrayE.add(archerEAttack2);
        archerArrayE.add(archerEAttack3);

        //knight arrayList
        knightArray.add(knightMove1);
        knightArray.add(knightMove2);
        knightArray.add(knightMove3);
        knightArray.add(knightAttack1);
        knightArray.add(knightAttack2);
        knightArray.add(knightAttack3);

        //enemy knight arrayList
        knightArrayE.add(knightEMove1);
        knightArrayE.add(knightEMove2);
        knightArrayE.add(knightEMove3);
        knightArrayE.add(knightEAttack1);
        knightArrayE.add(knightEAttack2);
        knightArrayE.add(knightEAttack3);

        //catapault arrayList
        catapaultArray.add(catapaultRest);
        catapaultArray.add(catapaultAttack1);
        catapaultArray.add(catapaultAttack2);
        catapaultArray.add(catapaultAttack3);

        //enemy catapault arrayList
        catapaultArrayE.add(catapaultERest);
        catapaultArrayE.add(catapaultEAttack1);
        catapaultArrayE.add(catapaultEAttack2);
        catapaultArrayE.add(catapaultEAttack3);

        //soldier arrayList
        soldierArray.add(soldierMove1);
        soldierArray.add(soldierMove2);
        soldierArray.add(soldierMove3);
        soldierArray.add(soldierAttack1);
        soldierArray.add(soldierAttack2);
        soldierArray.add(soldierAttack3);

        //enemy soldier arrayList
        soldierArrayE.add(soldierEMove1);
        soldierArrayE.add(soldierEMove2);
        soldierArrayE.add(soldierEMove3);
        soldierArrayE.add(soldierEAttack1);
        soldierArrayE.add(soldierEAttack2);
        soldierArrayE.add(soldierEAttack3);

        //sniper arrayList
        sniperArray.add(sniperMove1);
        sniperArray.add(sniperMove2);
        sniperArray.add(sniperMove3);
        sniperArray.add(sniperAttack1);
        sniperArray.add(sniperAttack2);
        sniperArray.add(sniperAttack3);

        //enemy sniper arrayList
        sniperArrayE.add(sniperEMove1);
        sniperArrayE.add(sniperEMove2);
        sniperArrayE.add(sniperEMove3);
        sniperArrayE.add(sniperEAttack1);
        sniperArrayE.add(sniperEAttack2);
        sniperArrayE.add(sniperEAttack3);

        //tank arrayList
        tankArray.add(tankMove1);
        tankArray.add(tankMove2);
        tankArray.add(tankMove3);
        tankArray.add(tankAttack1);
        tankArray.add(tankAttack2);
        tankArray.add(tankAttack3);

        //enemy tank arrayList
        tankArrayE.add(tankEMove1);
        tankArrayE.add(tankEMove2);
        tankArrayE.add(tankEMove3);
        tankArrayE.add(tankEAttack1);
        tankArrayE.add(tankEAttack2);
        tankArrayE.add(tankEAttack3);

        //rocketLauncher arrayList
        rocketLauncherArray.add(rocketLauncherRest);
        rocketLauncherArray.add(rocketLauncherAttack1);
        rocketLauncherArray.add(rocketLauncherAttack2);
        rocketLauncherArray.add(rocketLauncherAttack3);

        //enemy rocketLauncher arrayList
        rocketLauncherArrayE.add(rocketLauncherERest);
        rocketLauncherArrayE.add(rocketLauncherEAttack1);
        rocketLauncherArrayE.add(rocketLauncherEAttack2);
        rocketLauncherArrayE.add(rocketLauncherEAttack3);

        //blader arrayList
        bladerArray.add(bladerMove1);
        bladerArray.add(bladerMove2);
        bladerArray.add(bladerMove3);
        bladerArray.add(bladerAttack1);
        bladerArray.add(bladerAttack2);
        bladerArray.add(bladerAttack3);

        //enemy blader arrayList
        bladerArrayE.add(bladerEMove1);
        bladerArrayE.add(bladerEMove2);
        bladerArrayE.add(bladerEMove3);
        bladerArrayE.add(bladerEAttack1);
        bladerArrayE.add(bladerEAttack2);
        bladerArrayE.add(bladerEAttack3);

        //blaster arrayList
        blasterArray.add(blasterMove1);
        blasterArray.add(blasterMove2);
        blasterArray.add(blasterMove3);
        blasterArray.add(blasterAttack1);
        blasterArray.add(blasterAttack2);
        blasterArray.add(blasterAttack3);

        //enemy blaster arrayList
        blasterArrayE.add(blasterEMove1);
        blasterArrayE.add(blasterEMove2);
        blasterArrayE.add(blasterEMove3);
        blasterArrayE.add(blasterEAttack1);
        blasterArrayE.add(blasterEAttack2);
        blasterArrayE.add(blasterEAttack3);

        //HayesWrath arrayList
        HayesWrathArray.add(HayesWrathMove1);
        HayesWrathArray.add(HayesWrathMove2);
        HayesWrathArray.add(HayesWrathMove3);
        HayesWrathArray.add(HayesWrathAttack1);
        HayesWrathArray.add(HayesWrathAttack2);
        HayesWrathArray.add(HayesWrathAttack3);

        //enemy HayesWrath arrayList
        HayesWrathArrayE.add(HayesWrathEMove1);
        HayesWrathArrayE.add(HayesWrathEMove2);
        HayesWrathArrayE.add(HayesWrathEMove3);
        HayesWrathArrayE.add(HayesWrathEAttack1);
        HayesWrathArrayE.add(HayesWrathEAttack2);
        HayesWrathArrayE.add(HayesWrathEAttack3);

        //plasmaCannon arrayList
        plasmaCannonArray.add(plasmaCannonRest);
        plasmaCannonArray.add(plasmaCannonAttack1);
        plasmaCannonArray.add(plasmaCannonAttack2);
        plasmaCannonArray.add(plasmaCannonAttack3);

        //enemy plasmaCannon arrayList
        plasmaCannonArrayE.add(plasmaCannonERest);
        plasmaCannonArrayE.add(plasmaCannonEAttack1);
        plasmaCannonArrayE.add(plasmaCannonEAttack2);
        plasmaCannonArrayE.add(plasmaCannonEAttack3);

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

        clubMan = new AOWInfantry(25, 50, 1, 75, 60, 50, 80, clubArray );
        slinger = new AOWInfantry(5, 200, 1, 40, 60, 50, 80, slingerArray);
        dinoRider = new AOWInfantry(40, 100, 1, 125, 90, 70, 110, dinoRiderArray);
        eggPault = new AOWTurrets(10,300,1,150,10,eggPaultArray);

        swordsMan = new AOWInfantry(50, 50, 2, 150, 90, 50, 110, swordsManArray);
        archer = new AOWInfantry(40, 200, 2, 90, 90, 50, 110, archerArray);
        knight = new AOWInfantry(80, 100, 2, 250, 120, 70, 140, knightArray);
        catapault = new AOWTurrets(20, 300, 2, 200, 10, catapaultArray);

        soldier = new AOWInfantry(80, 50, 3, 300, 120, 70, 140, soldierArray);
        sniper = new AOWInfantry(65, 300, 3, 200, 120, 70, 140, sniperArray);
        tank = new AOWInfantry(150, 100, 3, 500, 190, 100, 220, tankArray);
        rocketLauncher = new AOWTurrets(70, 400, 3, 250, 10, rocketLauncherArray);

        blader = new AOWInfantry(150, 50, 4, 400, 200, 120, 220, bladerArray);
        blaster = new AOWInfantry(130, 200, 4, 300, 200, 120, 220, blasterArray);
        HayesWrath = new AOWInfantry(300, 100, 4, 1500, 300, 275, 330, HayesWrathArray);
        plasmaCannon = new AOWTurrets(75, 300, 4, 1000, 10, plasmaCannonArray);

        //----------------------------------End Of Infantry Objects----------------------------



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



        infantriese.add(new AOWInfantry(clubMan, clubArrayE));
        infantriese.add(new AOWInfantry(slinger, slingerArrayE));
        infantriese.add(new AOWInfantry(dinoRider, dinoRiderArrayE));
        infantriese.add(new AOWInfantry(swordsMan, swordsManArrayE));
        infantriese.add(new AOWInfantry(archer, archerArrayE));
        infantriese.add(new AOWInfantry(knight, knightArrayE));
        infantriese.add(new AOWInfantry(soldier, soldierArrayE));
        infantriese.add(new AOWInfantry(sniper, sniperArrayE));
        infantriese.add(new AOWInfantry(tank, tankArrayE));
        infantriese.add(new AOWInfantry(blader, bladerArrayE));
        infantriese.add(new AOWInfantry(blaster, blasterArrayE));
        infantriese.add(new AOWInfantry(HayesWrath, HayesWrathArrayE));

        turretse.add(new AOWTurrets(eggPault,eggPaultArrayE));
        turretse.add(new AOWTurrets(catapault,catapaultArrayE));
        turretse.add(new AOWTurrets(rocketLauncher,rocketLauncherArrayE));
        turretse.add(new AOWTurrets(plasmaCannon,plasmaCannonArrayE));


        //------------------testing
        /*
        infantriesOFEnemy.add(new AOWInfantry(clubMan, clubArrayE));

        infantriesOFEnemy.add(new AOWInfantry(HayesWrath, HayesWrathArrayE));
        */
        //---------------------------------

        k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                c=e.getKeyChar();

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };






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
                                clubMan = new AOWInfantry(25, 50, 1, 75, 60, 50, 80, clubArray);
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
                                swordsMan = new AOWInfantry(50, 50, 2, 150, 90, 50, 110, swordsManArray);
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
                                soldier = new AOWInfantry(80, 50, 3, 300, 120, 70, 140, soldierArray);
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
                                blader = new AOWInfantry(150, 50, 4, 400, 200, 120, 220, bladerArray);
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
                                slinger = new AOWInfantry(5, 200, 1, 40, 60, 50, 80, slingerArray);
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
                                archer = new AOWInfantry(40, 200, 2, 90, 90, 50, 110, archerArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), archer);

                                baseF.setMoney(baseF.getMoney() - archer.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                        else if(baseF.getTier() == 3)
                        {
                            if (baseF.getMoney() >= sniper.getCost())
                            {
                                sniper = new AOWInfantry(65, 300, 3, 200, 120, 70, 140, sniperArray);
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
                                blaster = new AOWInfantry(130, 200, 4, 300, 200, 120, 220, blasterArray);
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
                                dinoRider = new AOWInfantry(40, 100, 1, 125, 90, 70, 110, dinoRiderArray);
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

                                knight = new AOWInfantry(80, 100, 2, 250, 120, 70, 140, knightArray);
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
                                tank = new AOWInfantry(150, 100, 3, 500, 190, 100, 220, tankArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), tank);

                                baseF.setMoney(baseF.getMoney() - tank.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                        else if(baseF.getTier() == 4)
                        {
                            if(baseF.getMoney() >= HayesWrath.getCost())
                            {
                                HayesWrath = new AOWInfantry(300, 100, 4, 1500, 300, 275, 330, HayesWrathArray);
                                infantriesOFFriendly.add(infantriesOFFriendly.size(), HayesWrath);

                                baseF.setMoney(baseF.getMoney() - HayesWrath.getCost());
                            }

                            else
                                System.out.println("Insufficient Funds");

                        }

                    }

                }// end of create tank minion

                //creates turrets
                else if (e.getX() > 150 && e.getX() < 195 && e.getY() > 500 && e.getY() < 545)
                {
                    if (baseF.getTier() == 1) {
                        if (baseF.getMoney() >= eggPault.getCost())
                        {
                            if (turretsOFFriendly.size() == 0)
                            {
                                eggPault = new AOWTurrets(10, 300, 1, 150, 10, eggPaultArray);
                                baseF.setMoney(baseF.getMoney() - eggPault.getCost());
                                turretsOFFriendly.add(eggPault);
                            }
                            else
                            {
                                if(turretsOFFriendly.get(0).getTier() != 1)
                                {
                                    eggPault = new AOWTurrets(10, 300, 1, 150, 10, eggPaultArray);
                                    baseF.setMoney(baseF.getMoney() - eggPault.getCost());
                                    turretsOFFriendly.set(0, eggPault);
                                }
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
                                baseF.setMoney(baseF.getMoney() - catapault.getCost());
                                turretsOFFriendly.add(catapault);
                            }
                            else
                            {
                                if(turretsOFFriendly.get(0).getTier() != 2)
                                {
                                    baseF.setMoney(baseF.getMoney() - catapault.getCost());
                                    turretsOFFriendly.set(0, catapault);
                                }
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
                                baseF.setMoney(baseF.getMoney() - rocketLauncher.getCost());
                                turretsOFFriendly.add(rocketLauncher);
                            }
                            else
                            {
                                if(turretsOFFriendly.get(0).getTier() != 3)
                                {
                                    baseF.setMoney(baseF.getMoney() - rocketLauncher.getCost());
                                    turretsOFFriendly.set(0, rocketLauncher);
                                }
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
                                    baseF.setMoney(baseF.getMoney() - plasmaCannon.getCost());
                                    turretsOFFriendly.add(plasmaCannon);
                                }
                                else
                                {
                                    if (turretsOFFriendly.get(0).getTier() != 4)
                                    {
                                        baseF.setMoney(baseF.getMoney() - plasmaCannon.getCost());
                                        turretsOFFriendly.set(0, plasmaCannon);
                                    }
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
                    if(baseF.getTier() <4)
                    {
                        if (baseF.getXP() >= 500)
                        {
                            baseF.incTier();

                            baseF.setXP(baseF.getXP() - 500);

                        }
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
        if (baseF.getTier() == 4 || baseE.getTier() == 4)
        {
            g2d.drawImage(Futuristic, 0, 0, this);
        }
        else if (baseF.getTier() == 3 || baseE.getTier() == 3)
        {
            g2d.drawImage(Modern, 0, 0, this);
        }
        else if (baseF.getTier() == 2 || baseE.getTier() == 2)
        {
            g2d.drawImage(Medieval, 0, 0, this);
        }
        else if (baseF.getTier() == 1 || baseE.getTier() == 1)
        {
            g2d.drawImage(prehistoric, 0, 0, this);
        }

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
        if(baseF.getTier() == 1)
            g2d.drawImage(base1, 0, 300, this);
        else if(baseF.getTier() ==2)
            g2d.drawImage(medievalBase1, 0, 300, this);
        else if(baseF.getTier() ==3)
            g2d.drawImage(militaryBase1, 0, 300, this);
        else if(baseF.getTier() ==4)
            g2d.drawImage(futureBase1, 0, 300, this);

        if(baseE.getTier() == 1)
            g2d.drawImage(base2, 1120, 300, this);
        else if(baseE.getTier() ==2)
            g2d.drawImage(medievalBase2, 1120, 300, this);
        else if(baseE.getTier() ==3)
            g2d.drawImage(militaryBase2, 1120, 300, this);
        else if(baseE.getTier() ==4)
            g2d.drawImage(futureBase2, 1120, 300, this);

        g2d.setColor(Color.white);
        g2d.fillRect(1150, 625, 150, 75);
        g2d.setColor(Color.black);
        g2d.drawString("XP: " + baseF.getXP(), 1160, 650);
        g2d.drawString("GP: " + baseF.getMoney(), 1220, 650);


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




    @Override
    public void actionPerformed(ActionEvent e) {

    }



    public static void main(String []args) throws IOException{
        AOWRunner r = new AOWRunner();

        System.out.println(AOWRunner.infantriese.size());

        for (int i = 0; i <AOWRunner.infantriese.size(); i++) {
            String s = AOWRunner.infantriese.get(i).toString();

            System.out.println("s = " + s);
        }
    }


}
