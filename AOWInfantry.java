import java.io.File;
import java.util.ArrayList;

public class AOWInfantry extends AOWUnit
{
	protected int attackDamage,attackSpeed,range,tier, health, cost, xpGiver, goldGiver;
    ArrayList<File> walkAnimations;
    ArrayList<File> hitAnimations;
	//attack damage - takes out set number of health
	//attack speed - number of attacks every 10 seconds
	//range - number of pixels away that a unit is able to hit
	//tier - level of
	//health - amount of health of infantry
	//cost - amount of gold to buy infantry
	//xpGiver - gives the other player a set amount of experience based upon type of unit killed
	//goldGiver- gives the other player a set amount of gold based up type of unit killed

	public AOWInfantry(int attackDamage, int attackSpeed, int range, int tier, int health, int cost, int xpGiver,int goldGiver, ArrayList<File> walkAnimations, ArrayList<File> hitAnimations){
		this.attackDamage = attackDamage;
		this.attackSpeed = attackSpeed;
		this.range = range;
		this.tier = tier;
		this.health = health;
		this.cost =cost;
		this.xpGiver = xpGiver;
		this.goldGiver = goldGiver;
        this.walkAnimations = walkAnimations;
        this.hitAnimations = hitAnimations;

	}
        //copy constructor
    public AOWInfantry(AOWInfantry infant){
        this.attackDamage = infant.attackDamage;
        this.attackSpeed = infant.attackSpeed;
        this.range = infant.range;
        this.tier = infant.tier;
        this.health = infant.health;
        this.cost = infant.cost;
        this.xpGiver = infant.xpGiver;
        this.goldGiver = infant.goldGiver;
        this.walkAnimations = infant.walkAnimations;
        this.hitAnimations = infant.hitAnimations;

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

	@Override
	public int getAttackSpeed() {
		return attackSpeed;
	}

	@Override
	protected void setAttackSpeed(int speed) {
		this.attackSpeed = speed;
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
}