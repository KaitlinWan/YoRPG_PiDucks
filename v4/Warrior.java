public class Warrior extends Protagonist
{
    public Warrior() {
        _hitPts = 175;
        _strength = 100;
        _defense = 50;
        _attack = .3;
    }
    public Warrior( String name ) {
	this();
	_name = name;
    }
    
    public  String about() {
        String retstr = "The warrior class has higher health and defense, with a slightly lower attack.";
        return retstr;
    }

      public void specialize()
    {
    _attack = .75;
    _defense = 20;
    }

    public void normalize()
  {
    _attack = .4;
    _defense = 40;
  }
}
