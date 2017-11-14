public class Ghost extends Monster{
//ATTACK

	public Ghost(){
		_hitPts = 150;
		_strength = 20;
		_defense = 10;
		_attack = 1.5;

	}

	public static String about(){
		String retStr = "The Ghost class has a greater attack. His attack is by far the best of all classes. He lacks in strength because sometimes his hand just floats through his prey."
		return retStr;
	}

}
