import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AOWTurrets extends AOWUnit {
    int attackDamage, range,  tier, cost, x, frame;
    ArrayList<Image> animations;
    //animations are size 4  [0,3]
    //index 0 is the rest animations
    //1-3 are attack animations

    public AOWTurrets(int attackDamage,  int range, int tier, int cost,int x , ArrayList<Image> animations) {
        this.attackDamage=attackDamage;
        this.range=range;
        this.tier=tier;
        this.cost=cost;
        this.animations=animations;
        this.x=x;
        frame=0;


    }

    public AOWTurrets(AOWTurrets a, ArrayList<Image> animations) {
        this.attackDamage=a.attackDamage;
        this.range=a.range;
        this.tier=a.tier;
        this.cost=a.cost;
        this.animations= animations;
        this.x=1100;
        frame=0;


    }

    public int getFrame() {
        return frame;
    }

    public ArrayList<Image> getAnimations() {
        return animations;
    }

    public int getX() {
        return x;
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


    public int sell(){

        return 0;
    }

    public void attack(AOWInfantry matthew){
        if(frame<1)
            frame=0;

        frame++;

        if(frame ==3)
            matthew.setHealth(matthew.getHealth() - this.getAttackDamage());

        if(frame >3)
            frame = 1;


    }

    public void rest(){

        frame=0;
    }


}