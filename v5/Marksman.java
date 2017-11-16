public class Marksman extends Protagonist
{
    public Marksman() {
        _hitPts = 140;
        _strength = 90;
        _defense = 30;
        _attack = 1;
    }
    public Marksman( String name ) {
	this();
	_name = name;
    }
    public String about() {
        String retstr = "The marksman class has a higher attack.";
        return retstr;
    }

      public void specialize()
    {
    _attack = 1.5;
    _defense = 15;
    }

    public void normalize()
  {
    _attack = 1;
    _defense = 30;
  }
  public void addHealth()
  {
    if (_hitPts < 100) {
      _hitPts += (int) (_hitPts * .2) ;
      _defense = 1;
  }
  else {
          _defense = 0;
      }
}
}
