import javax.sound.sampled.SourceDataLine;

public class program3 {
    public static void main(String[] args) {
    Car obj=new Car("Ford","Mustang", 120);
    Vehicle v=obj;
    Car c=(Car) v;
    System.out.println("Brand: "+c.getB());
        System.out.println("Speed: "+c.getS());
        System.out.println("Model: "+c.getM());
    }
}
class V{
    private String brand;
    private int speed;
    public V(String brand,int s){
        this.brand=brand;
        this.speed=s;
    }
    public void setB(String b){
        this.brand=b;
    }
    public String getB(){
        return brand;
    }
    public void setS(int s){
        this.speed=s;
    }
    public int getS(){
        return speed;
    }

}
class Car extends Vehicle{
    private String model;
    public Car(String model,String brand,int speed){
        super(brand, speed);
        this.model=model;
    }
    public void setB(String m){
        this.model=m;
        
    }
    
    public String getM() {
        return model;

    }
}
