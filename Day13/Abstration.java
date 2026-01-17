public class Abstration {
    public static void main(String[] args) {
        
    
    Lion r1=new Lion();
    Tiger r2=new Tiger();
    Deer r3=new Deer();

    r1.eat();
    r1.sleep();
    r2.eat();
    r2.sleep();
    r3.eat();
    r3.sleep();
    }
}
 abstract class Animal{
    abstract void eat();
    abstract void sleep();    
}

class Lion extends Animal{
    @Override
    void eat(){
        System.out.println("method lion eats");
    }
    void sleep(){
        System.out.println("method Lion sleeps");
    }


}
class Tiger extends Animal{
    void eat(){
        System.out.println("method Tiger eat");
    }
    void sleep(){
        System.out.println("method Tiger sleeps");
    }

}
class Deer extends Animal{
    void eat(){
        System.out.println("method Deer eats");
    }
    void sleep(){
        System.out.println("method Deer sleeps");
    }

}
