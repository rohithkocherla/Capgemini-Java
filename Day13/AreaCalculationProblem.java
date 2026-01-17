public class AreaCalculationProblem {
    public static void main(String[] args) {
        rectangle obj1=new rectangle(5,4);
        circle obj2=new circle(5);
        square obj3=new square(6);
        System.out.println(obj1.area());
        System.out.println(obj2.area());
        System.out.println(obj3.area());
        
    }
}

abstract class shape {
    abstract double area();
}
class rectangle extends shape{
    double length;
    double bredth;
    
    public rectangle(double l,double b){
        this.length=l;
        this.bredth=b;
    }
    double area(){
        return length*bredth;
    }
}
class circle extends shape{
    double radius;
    public circle(double r){
        this.radius=r;
    }
    double area(){
        return 3.14*Math.pow(radius,2);
    }

}

class square extends shape{
    double side;
    public square(double s){
        this.side=s;
    }
    double area(){
        return side*side;
    }
}

