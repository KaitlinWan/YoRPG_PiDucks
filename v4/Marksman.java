public class Marksman extends Protagonist
{
    public Marksman() {
        _hitPts = 100;
        _strength = 100;
        _defense = 40;
        _attack = .7;
    }
    public Marksman( String name ) {
	this();
	_name = name;
    }
    public String about() {
        String retstr = "The marksman class has a higher attack than Protagonist, but lower HP.";
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
