public interface Animal {
    void sound();
}

class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("WOOF");
    }
}

class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("MEOW");
    }
}

class AnimalFactory{
    public static Animal createAnimal(String type){
        if ("Dog".equalsIgnoreCase(type)){
            return new Dog()[]
        } else if ("Cat".equalsIgnoreCase(type)){
            return new Cat();
        } else{
            throw new IllegalArgumentException("Invalid animal type")
        }
    }
}

 class testSF {
    public static void main(String[] args){
        Animal dog=AnimalFactory.createAnimal("Dog");
        dog.sound();

        Animal cat=AnimalFactory.createAnimal("Cat");
        cat.sound();
    }
}
