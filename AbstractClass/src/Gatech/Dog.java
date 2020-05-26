package Gatech;

import com.sun.security.jgss.GSSUtil;

public class Dog extends Animal{

   public Dog(String name) {
       // super() and this() calls is used in constructor to inherit parents attributes
       super(name);
   }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(super.getName() + " is breathing.");
    }
}
