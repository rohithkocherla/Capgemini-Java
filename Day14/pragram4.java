public class pragram4 {
    public static void main(String[] args) {
        OnlineOrder obj=new OnlineOrder();
        obj.placeOrder();
        obj.cancelOrder();
        System.out.println(" ");
        InStoreOrder obj1=new InStoreOrder();
        obj1.placeOrder();
        obj1.cancelOrder();
    }
        
}
interface OrderProcess{
    abstract void placeOrder();
    abstract void cancelOrder();
}
class OnlineOrder implements OrderProcess{
    public void placeOrder(){
         System.out.println("Online Order placed successfully.");
    }
    public void cancelOrder(){
        System.out.println("Online Order cancelled successfully.");
    }
}
class InStoreOrder implements OrderProcess{
    public void placeOrder(){
        System.out.println("In-Store Order placed successfully.");

    }
    public void cancelOrder(){
        System.out.println("In-Store Order cancelled successfully.");
    }
}
    
