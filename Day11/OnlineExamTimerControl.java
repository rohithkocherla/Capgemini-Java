public class OnlineExamTimerControl {
    public static void main(String[] args) {
        ExamTimer obj=new ExamTimer(60);

        obj.rt(30);
        obj.rt(10);
        obj.rt(30);
        obj.display();
        
    }
}
class ExamTimer{
    private int t;

    public ExamTimer(int t ){
        this.t=t;
    }

    void rt(int m){
        if(t-m>=0){
            t=t-m;
        }
        else{
            System.out.println("Time cannot be negative");
        }
    }
    void display(){
        System.out.println("Time Left: " + t + " minutes");
    }
}
