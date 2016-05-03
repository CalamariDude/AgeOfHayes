import java.lang.reflect.Array;
import java.util.ArrayList;

public class AOWRunner {
    ArrayList<AOWInfantry> infantries;
    ArrayList<AOWTurrets> turrets;
    ArrayList<AOWInfantry> infantriesOF;
    ArrayList<AOWTurrets> turretsOF;

    public AOWRunner(){




    }
    void Create(String name)
    {
        AOWInfantry clubMan = new AOWInfantry(25, 5, 1, 0, 75, 60, 50, 80 );
        AOWInfantry slinger = new AOWInfantry(20, 4, 200, 0, 40, 60, 50, 80);
        AOWInfantry dinoRider = new AOWInfantry(40, 3, 100, 0, 125, 90, 70, 110);
        AOWTurrets eggPault = new AOWTurrets(10, 4, 300, 0, 150);

        AOWInfantry swordsMan = new AOWInfantry(50, 5, 1, 1, 150, 90, 50, 110);
        AOWInfantry archer = new AOWInfantry(40, 4, 200, 1, 90, 90, 50, 110);
        AOWInfantry knight = new AOWInfantry(80, 3, 100, 1, 250, 120, 70, 140);
        AOWTurrets catapult = new AOWTurrets(20, 4, 300, 1, 200);

        AOWInfantry soldier = new AOWInfantry(80, 5, 1, 2, 300, 120, 70, 140);
        AOWInfantry sniper = new AOWInfantry(65, 4, 300, 2, 200, 120, 70, 140);
        AOWInfantry tank = new AOWInfantry(150, 3, 100, 2, 500, 190, 100, 220);
        AOWTurrets rocketLauncher = new AOWTurrets(70, 3, 400, 2, 250);

        AOWInfantry blader = new AOWInfantry(150, 5, 1, 3, 400, 200, 120, 220);
        AOWInfantry blaster = new AOWInfantry(130, 4, 200, 3, 300, 200, 120, 220);
        AOWInfantry HayesWrath = new AOWInfantry(300, 3, 100, 3, 1500, 300, 275, 330);
        AOWTurrets plasmaCannon = new AOWTurrets(75, 4, 300, 3, 1000);




    }
}
