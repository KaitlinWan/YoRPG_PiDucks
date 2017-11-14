public class Demon extends Monster {
//HAS MORE STRENGTH
public Demon(){
	_hitPts = 150;
	_strength = 50;
	_defense = 10;
	_attack = 1;
}

public static String about(){
	String retStr = "The Demon class has a higher strength than others but, its is lacking in defense and attack."
	return retStr;
}
}
