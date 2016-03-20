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

    private int maxHP;
    private String name;
    private ArrayList<Attribute> allAttributes;
    private ArrayList<Type> type;
    private int retreatCost;
    private Type weakness;
    private Type resistance;
    private int currentHP;
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

    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts, ArrayList<Type> attachedE)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts);
        attachedEnergy = attachedE;
    }

    public void setMaxHP(int hp)
    {
        maxHP = hp;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setRetreatCost(int rc)
    {
        retreatCost = rc;
    }

    public void setWeakness(Type t)
    {
        weakness = t;
    }

    public void setResistance(Type t)
    {
        resistance = t;
    }

    public void setCurrentHP(int chp)
    {
        currentHP = chp;
    }

    public void addAttribute(Attribute a)
    {
        allAttributes.add(a);
    }

    public void addType(Type t)
    {
        type.add(t);    
    }

    public void addEnergy(Type e)
    {
        attachedEnergy.add(e);
    }

    public void addTool(Tool t)
    {
        attachedTools.add(t);
    }

    public void removeAttribute(Attribute a)
    {
        allAttributes.add(a);
    }

    public void removeType(Type t)
    {
        type.add(t);
    }

    public void removeEnergy(Type e)
    {
        attachedEnergy.remove(e);
    }

    public void removeTool(Tool t)
    {
        attachedEnergy.remove(t);
    }

    public int getMaxHP()
    {
        return maxHP;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Attribute> getAllAttributes()
    {
        return allAttributes;
    }

    public ArrayList<Type> getType()
    {
        return type;
    }

    public int getRetreatCost()
    {
        return retreatCost;
    }

    public Type getWeakness()
    {
        return weakness;
    }

    public Type getResistance()
    {
        return resistance;
    }

    public int getCurrentHP()
    {
        return currentHP;
    }

    public ArrayList<Type> getAttachedEnergy()
    {
        return attachedEnergy;
    }

    public ArrayList<Tool> getAttachedTools()
    {
        return attachedTools;
    }

    public ArrayList<Pokemon> getAttachedPokemon()
    {
        return attachedPokemon;
    }


    
    
    public abstract String getEffect(Attribute attr);
    
    
    
}
