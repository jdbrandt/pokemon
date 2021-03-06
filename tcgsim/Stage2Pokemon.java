import java.util.*;

public abstract class Stage2Pokemon extends Pokemon
{
    
    public Stage2Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis) 
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis);
    
    }
    
    public Stage2Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes);
    }
    
    public Stage2Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts);
    }
    
    public Stage2Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts, ArrayList<Type> attachedE)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts, attachedE);
    }
    

}