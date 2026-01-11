public class p {
    int id;
    String name;

    public p(int id,String name){
        this.id=id;
        this.name=name;

    }
    public static void main(String args[]){
        p ref=new p(1,"Rohit");
        System.out.print(ref.hashCode());
        System.out.println(Integer.toHexString(ref.hashCode()));
        System.out.println(ref);
        System.out.println(ref.getClass());
        System.out.println(ref.getClass().getName());
    }
    
}
