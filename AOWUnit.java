public abstract class AOWUnit
{

    //Returns the attack damage
    abstract public int getAttackDamage();

    //Sets the attack damage
    abstract protected void setAttackDamage(int damage);

    //Sets the range
    abstract protected void setRange(int range);

    //Returns the range
    abstract public int getRange();

    //Sets the tier (t1, t2, t3, or t4)
    abstract protected void setTier(int tier);

    //Returns the tier
    abstract public int getTier();

    //Purchases an infantry object, turret, or upgrade
    abstract public void Buy(int cashgiven);

    //Returns the cost of an infantry, turret, or upgrade
    abstract public int getCost();









}