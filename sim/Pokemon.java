import java.util.*;

public abstract class Pokemon implements Card
{
    
    protected enum Type 
    {
        G, R, W, L, F, P, C, D, M, N, Y
    }
    protected  enum Stage
    {
       ONE, TWO, THREE, EX, MEX, BREAK, BABY
    }    
    
    
    private final int maxHP;
    private final String name;
    private final ArrayList<Attribute> allAttributes;
    private final ArrayList<Type> type;
    private final int retreatCost;
    private final Type weakness;
    private final Type reisistance;
    
    
    
    private ArrayList<Type> attachedEnergy;
    private ArrayList<Tool> attachedTools;
    private ArrayList<Pokemon> attachedPokemon;
    
    
    
    
    
    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis) 
    {
        maxHP = maxhp;
        name = n;
        allAttributes = allattributes;
        type = t;
        retreatCost = retreatcost;
        weakness = weak;
        resistance = resis;
        
        attachedEnergy = new ArrayList<Type>();
        attachedTools = new ArrayList<Tool>();
        attachedPokemon = new ArrayList<Pokemon>();
    }
    
    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis);
        attachedPokemon = attachedPokes;
        
        attachedEnergy = new ArrayList<Type>();
        attachedTools = new ArrayList<Tool>();
    }
    
    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes);
        attachedTools = ts;
        
        attachedEnergy = new ArrayList<Type>();
    }
    
    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Type> attachedE)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes);
        attachedEnergy = attachedE;
        
        attachedTools = new ArrayList<Tool>();
    }
    
    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts, ArrayList<Type> attachedE)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts);
        attachedEnergy = attachedE;
    }
    
    
    
    
    public abstract String getEffect(Attribute attr);

    
    
    
    
    
}
    