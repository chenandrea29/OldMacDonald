class NamedCow extends Cow
{
	private String myName;
	Cow(String type, String name, String sound) {
		myType = type;
		myName = name;
		mySound = sound;
	}
	public String getName() {
		return myName;
	}
}