public class Mage extends Protagonist
{
    public Mage() {
        _hitPts = 75;
        _strength = 135;
        _defense = 25;
        _attack = 1.5;
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
    _attack = 2;
    _defense = 10;
  }

    public void normalize()
  {
    _attack = 1;
    _defense = 25;
  }
  public void addHealth()
  {
      if (_hitPts < 75) {
      _hitPts += (int) (_hitPts * .2);
      _defense = 1;
  }
  else {
          _defense =0;
      }
}
}
