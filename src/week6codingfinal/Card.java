package week6codingfinal;

public class Card {
private String value;
private String name;



public String getName() {
	return name;

	}

public String getValue() {
	return value;
}

public Card(String value, String name) {
	this.value = value;
	this.name = name;
}
public static String describe(String value, String name) {
return value + name;
}

@Override
public String toString() {
    return value + " of " + name;
}
}

