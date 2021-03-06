import java.awt.*;
import java.util.ArrayList;

public class AOWInfantry extends AOWUnit
{
	protected int attackDamage,range,tier, health, cost, xpGiver, goldGiver,x, frame;
    ArrayList<Image> walkAnimations;
	public int spawnHealth;

	//attack damage - takes out set number of health
	//attack speed - number of attacks every 10 seconds
	//range - number of pixels away that a unit is able to hit
	//tier - level of
	//health - amount of health of infantry
	//cost - amount of gold to buy infantry
	//xpGiver - gives the other player a set amount of experience based upon type of unit killed
	//goldGiver- gives the other player a set amount of gold based up type of unit killed
	public AOWInfantry(int attackDamage, int range, int tier, int health, int cost, int xpGiver,int goldGiver, ArrayList<Image> walkAnimations){
		this.attackDamage = attackDamage;
		this.range = range;
		this.tier = tier;
		this.health = health;
		this.cost =cost;
		this.xpGiver = xpGiver-xpGiver/5;
		this.goldGiver = cost;
        this.walkAnimations = walkAnimations;
		spawnHealth = health;
		x = 100;

		frame = -1;


	}
        //copy constructor for enemy
        public AOWInfantry(AOWInfantry infant, ArrayList<Image> walkAnimations){
            this.attackDamage = infant.attackDamage;
            this.range = infant.range;
            this.tier = infant.tier;
            this.health = infant.health;
            this.cost = infant.cost;
            this.xpGiver = infant.xpGiver;
            this.goldGiver = infant.goldGiver;
            this.walkAnimations = walkAnimations;
            spawnHealth = health;

            x=1200;
            frame = -1;

        }


	public AOWInfantry(AOWInfantry a)
	{
		this.attackDamage = a.attackDamage;
		this.range = a.range;
		this.tier = a.tier;
		this.health = a.health;
		this.cost = a.cost;
		this.xpGiver = a.xpGiver;
		this.goldGiver = a.goldGiver;
		this.walkAnimations = a.walkAnimations;

		spawnHealth = health;
		x= 100;
		frame =-1;

	}

	public int getX() {
		return x;
	}


	@Override
	public int getAttackDamage() {
		return attackDamage;
	}

	@Override
	protected void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	@Override
	protected void setRange(int range) {
		this.range = range;

	}

	@Override
	public int getRange() {
		return range;
	}
	public int getRangeE(){
		return (-1*range);
	}

	@Override
	protected void setTier(int tier) {
		this.tier = tier;
	}

	@Override
	public int getTier() {
		return tier;
	}

    @Override
    public void Buy(int cashgiven) {

    }


	public void Buy(int cost, AOWBase base) {
	//	if(base.getMoney() >  cost)

	}

	@Override
	public int getCost() {
		return cost;
	}


	public ArrayList<Image> getWalkAnimations(){

		return walkAnimations;
	}

	public int getHealth() {
		return health;
	}

	public int getXpGiver() {
		return xpGiver;
	}

	public int getGoldGiver() {
		return goldGiver;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setXpGiver(int xpGiver) {
		this.xpGiver = xpGiver;
	}

	public void setGoldGiver(int goldGiver) {
		this.goldGiver = goldGiver;
	}

	public int getSpawnHealth()
	{
		return spawnHealth;
	}

	public void move()
	{

		x +=6;
		frame++;
		if(frame>2)
			frame=0;


	}

	public void moveE()
	{

		x-=6;
		frame++;
		if(frame > 2)
			frame = 0;

	}


	public int getFrame()
	{
		if (frame == -1)
		{
			frame = 0;
		}

		return frame;
	}


	public void attack(AOWInfantry matthew){
		if(frame<3)
			frame=2;

		frame++;

		if(frame ==6)
			matthew.setHealth(matthew.getHealth()-this.getAttackDamage());

		if(frame >5)
			frame = 3;


	}

	public void attack(AOWBase matthew){
		if(frame<3)
			frame=2;

		frame++;

		if(frame ==6)
			matthew.setHealth(matthew.getHealth()-this.getAttackDamage());

		if(frame >5)
			frame = 3;

	}






}