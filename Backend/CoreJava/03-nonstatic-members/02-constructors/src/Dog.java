class Dog {

    //Attributes, data members, properties, fields
    String name, breed, gender, color;
    int age;
    double height, weight;

    Dog(String dogName,String dogBreed,String dogGender,String dogColor,
    int dogAge, double dogHeight, double dogWeight) {
        System.out.println("initializing object 'dog' begin: ");
        name = dogName;
        breed = dogBreed;
        gender = dogGender;
        color = dogColor;
        age = dogAge;
        height = dogHeight;
        weight = dogWeight;
        System.out.println("initializing object 'dog' completed");
    }

    void bark() {
        System.out.println("This dog barks!");
    }

    void bite() {
        System.out.println("This dog bites!!!");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Golu", "Labrador Retriever", "male", "white",8, 57, 27 );
        System.out.println("Name: " + d1.name + " Breed: " + d1.breed + " Gender: " + d1.gender + " Color: " + d1.color 
        + " Age: " + d1.age + " Height: " + d1.height + " Weight: " + d1.weight );
        d1.bite();

        System.out.println("------------------------------------------------------");
        Dog d2 = new Dog("Pinky", "Pomeranian", "female", "Brown", 5, 41, 18 );
        System.out.println("Name: " + d2.name + " Breed: " + d2.breed + " Gender: " + d2.gender + " Color: " + d2.color 
        + " Age: " + d2.age + " Height: " + d2.height + " Weight: " + d2.weight );
        d2.bark();
        
    }
}
