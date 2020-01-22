package model;

public class Dog {

    int legCount = 4;
    String type = "Dog";
    String sound = "Woof";
    String name;

    public Dog(String aName) {
        name = aName;
    }

    public void makeSound(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println(sound + " ");
        }
    }

}
