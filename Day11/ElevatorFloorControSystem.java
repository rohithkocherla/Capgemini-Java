public class ElevatorFloorControSystem {
    public static void main(String args[]){
        Elevator e=new Elevator(9);

        e.moveUp();
        e.moveUp();
        
        e.moveDown();

        e.displayFloor();

    }
}

class Elevator{
    private int currentFloor;
    private final int TOP_FLOOR=10;
    private final int BOTTOM_FLOOR=0;

    public Elevator(int floor){
        this.currentFloor=floor;
    }

    public void moveUp(){
        if(currentFloor < TOP_FLOOR){
            currentFloor++;
        }
        else{
            System.out.println("Already at top floor");
        }
    }

    public void moveDown(){
        if(currentFloor > BOTTOM_FLOOR){
            currentFloor--;
        }
    }

    public void displayFloor() {
        System.out.println("Current Floor: "+currentFloor);
    }
}


