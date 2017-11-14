public class Zombie extends Monster{
//Defense
	public Demon(){
		_hitPts = 150;
		_strength = 30;
		_defense = 40;
		_attack = 0.9;
	}

	public static String about(){
		String retString = "The Zombie class has great defense. However, it is quite slow and not as strong."
		return retString;
	}
}
