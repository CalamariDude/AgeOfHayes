public class AOWBase {

    public int health, tier, money, xp, x;


    public AOWBase(int health, int money, int x){
        this.health = health;
        tier = 1;
        this.money = money;
        xp = 0;
        this.x = x;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public int getXP()
    {
        return xp;
    }

    public void setXP(int newxp)
    {
        xp = newxp;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int currentHealth)
    {
        health = currentHealth;
    }

    public int getTier()
    {
        return tier;
    }

    public void incTier()
    {
        tier = tier + 1;
    }

    public int getX()
    {
        return x;
    }

}