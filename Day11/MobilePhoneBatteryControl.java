public class MobilePhoneBatteryControl {
    public static void main(String[] args) {
        MobilePhone obj=new MobilePhone(60);

        obj.charge(30);
       obj.use(30);
       
        obj.display();
   
    } 
}

class MobilePhone{
    private int b;

public MobilePhone(int b){
        this.b=b;
    }
void charge(int amount){
        b=b+amount;
        
        
     }
     void use(int used){
        b=b-used;

     }

     void display(){
        System.out.println("Battery Level: "+b+"%");
     }
}
