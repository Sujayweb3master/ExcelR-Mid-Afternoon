class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }


}

class Basil {

}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    String get() {
        return "wrjoiwion weioj ioej";
    }
}

class Main {
    void performSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        String s1 = new String("4.5");
        Dog D1 = new Dog();
        System.out.println(D1 instanceof Animal);
        System.out.print(s1 instanceof Integer);
        System.out.print(s1 instanceof Double);
}