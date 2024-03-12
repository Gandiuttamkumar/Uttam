class Animal {
    public void makeSound() {
        System.out.println("Ugh! Humans can be quite unbearable.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.print("Dog says: ");
        dog.makeSound();

        System.out.print("Cat says: ");
        cat.makeSound();
    }
}
