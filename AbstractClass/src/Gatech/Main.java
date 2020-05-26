package Gatech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Parrot parrot = new Parrot("Australian ringnect");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
