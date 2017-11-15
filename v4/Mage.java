public class Mage extends Protagonist
{
    public Mage() {
        _hitPts = 75;
        _strength = 125;
        _defense = 25;
        _attack = .5;
    }
    public Mage( String name ) {
	this();
	_name = name;
    }
    
    public String about() {
        String retstr = "The illustrious Mage class has increased attack and strength, at the expense of health and def.";
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
