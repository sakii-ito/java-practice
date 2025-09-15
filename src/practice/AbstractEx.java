abstract class Animal {
    abstract public void cry();
}

class Cat extends Animal {
    public void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("멍멍");
    }
}

class Pig extends Animal {
    public void cry() {
        System.out.println("꿀꿀");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Cat c = new Cat();

        Dog d = new Dog();

        Pig p = new Pig();

        Animal[] a = new Animal[3];
        a[0] = c;
        a[1] = d;
        a[2] = p;

        a[0].cry();
        a[1].cry();
        a[2].cry();
    }
}