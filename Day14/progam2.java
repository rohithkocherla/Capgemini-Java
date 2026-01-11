public class progam2 {
    public static void main(String[] args) {
        Car obj=new Car("Camry","Toyota",120);
        Vehicle v=obj;
            System.out.println("Brand: "+v.getB());
            System.out.println("Speed: "+v.getS());
    }
}
class Vehicle{
    private String brand;
    private int speed;
      public Vehicle(String b,int speed){
        this.brand=b;
        this.speed=speed;
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
        super(brand,speed);
        this.model=model;
    }
    public void setM(String m){
        this.model=m;
    }
    public String getM(){
        return model;
    }

}
