class Animal {
    void makeSound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("bow bow");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("meow meow");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("baa baa");
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        Animal co = new Cow();

        d.makeSound();
        c.makeSound();
        co.makeSound();
    }
}
