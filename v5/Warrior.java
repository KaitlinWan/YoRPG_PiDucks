public class Warrior extends Protagonist
{
    public Warrior() {
        _hitPts = 200;
        _strength = 100;
        _defense = 40;
        _attack = .8;
    }
    public Warrior( String name ) {
	this();
	_name = name;
    }
    
    public  String about() {
        String retstr = "The warrior class has higher health, with a slightly lower attack.";
        return retstr;
    }

      public void specialize()
    {
    _attack = 1.3;
    _defense = 25;
    }

    public void normalize()
  {
    _attack = .8;
    _defense = 40;
  }
  public void addHealth()
  {
      if (_hitPts < 175) {
      _hitPts += (int) (_hitPts * .1);
      _defense = 1;
  }
      else {
          _defense =0;
      }
}
}
