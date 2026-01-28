public class PolymorphismPractice2 {
    public static void main(String args[]){
       Animal a=new Animal();
       a.sound();
       Animal d=new Dog();
       d.sound();
       Animal c=new cat();
       c.sound();
    }
    
}

class Animal{
    public void sound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class cat extends Animal{
    public void soundm(){
        System.out.println("cat makes a sound meow");
    }
}