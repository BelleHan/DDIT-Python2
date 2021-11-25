package day02;

public class Human extends Animal {
	int skill = 0;
	
	public void use(int skill) {
		this.skill += skill;
	}
	
}
