public class Warrior extends Protagonist
{
    public Warrior() {
        _hitPts = 175;
        _strength = 100;
        _defense = 50;
        _attack = .3;
    }
    
    public static String about() {
        String retstr = "The warrior class has higher health and defense, with a slightly lower attack.";
        return retstr;
}
}