public class BasicEnergy implements Energy
{
    
    private Type type;
    private final Effect effect = new NullEffect();
    
    public BasicEnergy(Type t)
    {
        type = t;
    }
    
    
    
    public Type getType()
    {
        return type;
    }
    
    public Effect getEffect()
    {
        return effect;
    }
}