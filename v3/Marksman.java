public class Marksman extends Protagonist
{
    public Marksman() {
        _hitPts = 100;
        _strength = 100;
        _defense = 40;
        _attack = .7;
        _name = "John";
    }
    
    public static String about() {
        String retstr = "The marksman class has a higher attack than Protagonist, but lower HP.";
        return retstr;
}
}