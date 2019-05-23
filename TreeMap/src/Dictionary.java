//Kyle Phillips
import java.util.Map;
import java.util.TreeMap;

public class Dictionary {


	
	public static void main(String[] args) {
		
	
	String word1 = "Passionfruit"; 
	String defn1 = "A spherical fruit yellow or dark purple at maturity, cultivated commercially in tropical and subtropical areas";
	String word2 = "Pineapple";
	String defn2 = "A large juicy tropical fruit with yellow flesh surrounded by a tough outer skin";
	String word3 = "Peach";
	String defn3 = "A spherical stone fruit with juicy yellow flesh and downy pinkish-yellow skin";
	String word4 = "Plum";
	String defn4 = "A spherical/oval fruit that is purple, reddish, or yellow. Flattish pointed pit";
	String word5 = "Grape";
	String defn5 = "A small spherical fruit of the deciduous woody vines of the flowering plant genus Vitis. Generally occure in clusters and are typically used in wine making";
	String word6 = "Orange";
	String defn6 = "A spherical sweet orange fruit of the citrus species";
	String word7 = "Banana";
	String defn7 = "An elongated and curved fruit with soft flesh rich in starch, covered with a rind";
	String word8 = "Mango";
	String defn8 = "A spherical stone fruit cultivated in the tropics belonging to the flowering plant genus Mangifera";
	String word9 = "Avocado";
	String defn9 = "A spherical green skinned fruit cultivated in tropical and Mediterranean climates with a single large seed";
	String word10 = "Apple";
	String defn10 = "A spherical sweet fruit cultivated worldwide and grown on a deciduous tree";

	Map<String, String> Dictionary = new TreeMap<String, String>();
	
	Dictionary.put(word1, defn1);
	Dictionary.put(word2, defn2);
	Dictionary.put(word3, defn3);
	Dictionary.put(word4, defn4);
	Dictionary.put(word5, defn5);
	Dictionary.put(word6, defn6);
	Dictionary.put(word7, defn7);
	Dictionary.put(word8, defn8);
	Dictionary.put(word9, defn9);
	Dictionary.put(word10, defn10);
	
    System.out.println("*********Dictionary Keys*********");
	for (String keys : Dictionary.keySet()) {
		System.out.println(keys);
	}
	
	System.out.println("\n*********Fruit Dictionary*********");
	for (String key : Dictionary.keySet()) {
        System.out.println(key + " = " + Dictionary.get(key));
	}
}
}

//*********Dictionary Keys*********
//Apple
//Avocado
//Banana
//Grape
//Mango
//Orange
//Passionfruit
//Peach
//Pineapple
//Plum

//*********Fruit Dictionary*********
//Apple = A spherical sweet fruit cultivated worldwide and grown on a deciduous tree
//Avocado = A spherical green skinned fruit cultivated in tropical and Mediterranean climates with a single large seed
//Banana = An elongated and curved fruit with soft flesh rich in starch, covered with a rind
//Grape = A small spherical fruit of the deciduous woody vines of the flowering plant genus Vitis. Generally occure in clusters and are typically used in wine making
//Mango = A spherical stone fruit cultivated in the tropics belonging to the flowering plant genus Mangifera
//Orange = A spherical sweet orange fruit of the citrus species
//Passionfruit = A spherical fruit yellow or dark purple at maturity, cultivated commercially in tropical and subtropical areas
//Peach = A spherical stone fruit with juicy yellow flesh and downy pinkish-yellow skin
//Pineapple = A large juicy tropical fruit with yellow flesh surrounded by a tough outer skin
//Plum = A spherical/oval fruit that is purple, reddish, or yellow. Flattish pointed pit


