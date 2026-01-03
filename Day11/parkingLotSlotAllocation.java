public class parkingLotSlotAllocation {
    public static void main(String[] args) {
        parkingLot obj=new parkingLot(10);

        obj.parkCar(5);
        obj.removecar(5);
        obj.display();
    }
    
}
class parkingLot{
    private int availableSlots;

    public parkingLot(int availableSlots){
        this.availableSlots=availableSlots;
    }

    void parkCar(int cars){
        if(cars-availableSlots>0){
            availableSlots=0;
            System.out.println("Parking Full");
        }
        else{
            availableSlots-=cars;
        }

    }
    void removecar(int carsremoved){
        availableSlots=availableSlots+carsremoved;
        
    }

    void display(){
        System.out.println("Available Slots: "+availableSlots);
    }
}
