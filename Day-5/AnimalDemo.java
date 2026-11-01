
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class AnimalDemo {
    public static void main(String args[]) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.eat();
        animal.makeSound();

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}
