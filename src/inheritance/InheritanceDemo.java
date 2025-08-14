package inheritance;

class Animal{

    public void speak(){
        System.out.println("Animal Sound");
    }

}
class Dog extends Animal{

   public void speak(){
       System.out.println("Whoah");
   }

}

public class InheritanceDemo {
    public static void main(String args[]){
        Animal a = new Animal();
        Dog d  = new Dog();
        a.speak();
        d.speak();
    }
}
