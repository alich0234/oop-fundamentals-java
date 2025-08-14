package polymorphism;

class Animal{

    public void speak(){
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal{

    @Override
    public void speak(){
        System.out.println("Woof");
    }

}



public class OverloadingDemo {
    public static void main(String args[]){

        Animal a = new Animal();
        Animal d = new  Dog();
        a.speak();
        d.speak();

    }
}
