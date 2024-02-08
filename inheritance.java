public class inheritance {
    public static void main(String[] args) {
        Birds chirp = new Birds();
        chirp.eat();
        chirp.reproduce();
        chirp.fly();
    }

    
    
}
class Animal{
    String colour;
    void breathe(){
     System.out.println("Breathes.....");
    }
    void eat(){
        System.out.println("Eats");
    }
}
class Fish extends Animal{
    void reproduce(){
        System.out.println("reproduce eggs.");
    }
  void swim(){
    System.out.println("swims");
  }
}
class Birds extends Animal{
    void reproduce(){
        System.out.println("birds reproduce eggs");
    }
    void fly(){
        System.out.println("birds flies");
    }
}