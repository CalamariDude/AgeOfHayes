
public class AOWBase {

    public int health, tier, money, xp;


    public AOWBase(int health, int money){
        this.health = health;
        tier = 0;
        this.money = money;
        xp = 0;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int cost)
    {
        money = money - cost;
    }

    public int getXP()
    {
        return xp;
    }

    public void setXP(int increase)
    {
        xp = xp + increase;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int damaged)
    {
        health = health - damaged;
    }

    public int getTier()
    {
        return tier;
    }

    public void incTier()
    {
        tier = tier + 1;
    }

}
