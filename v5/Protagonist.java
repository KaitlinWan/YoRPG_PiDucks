/**********************************************
 * class Protagonist -- the protagonist of Ye Olde RPG
 * ---
 * Clyde "Thluffy" Sinclair
 **********************************************/

public abstract class Protagonist extends Character
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  protected String _name = "J. Doe";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Protagonist()
  {
    _hitPts = 125;
    _strength = 100;
    _defense = 40;
    _attack = .4;
  }


  /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/
  public Protagonist( String name ) {
    this();
    _name = name;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public String getName() { return _name; }
  public int getHealth() {return _hitPts;}
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    int attack(Monster) -- simulates attack on instance of class Monster
    pre:  Input not null
    post: Calculates damage to be inflicted, flooring at 0. 
    Calls opponent's lowerHP() method to inflict damage. 
    Returns damage dealt.
    =============================================*/
  public int attack( Monster opponent )
  {

    int damage = (int)( (_strength * ((Math.random() * _attack))) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
	    damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack

  //adds health as long as current health is less than normal and sets defense to 0
  public abstract void addHealth();

  //prepare a Protagonist for a special attack
    public abstract void specialize();


  //revert to normal mode
    public abstract void normalize(); 

    public abstract String about();

}//end class Protagonist

