import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AOWTurrets extends AOWUnit {
    int range, attackSpeed, attackDamage, tier, cost, speed;

    public AOWTurrets(int attackDamage, int attackSpeed, int range, int tier, int cost, ArrayList<File> animations) {
        this.tier = tier;


    }


    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    protected void setAttackDamage(int damage) {
        this.attackDamage=damage;

    }

    public void setRange(int tier) {

        if (tier == 1)
            range = 100;
        else if (tier == 2)
            range = 200;
        else if (tier == 3)
            range = 300;
        else
            range = 400;

    }

    @Override
    public int getRange() {
        return range;
    }

    @Override
    protected void setTier(int tier) {
        this.tier=tier;

    }

    @Override
    public int getTier() {
        return tier;
    }

    @Override
    public void Buy(int cashgiven) {

    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getAttackSpeed() {
        return attackSpeed;
    }

    @Override
    public void setAttackSpeed(int speed) {
        this.speed=speed;
    }

    public int sell(){



    }



}