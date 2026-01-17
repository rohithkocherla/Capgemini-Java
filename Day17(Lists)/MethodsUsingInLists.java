import java.util.List;
import java.util.ArrayList;
public class MethodsUsingInLists {
    public static void main(String[] args) {
        List<String> pb=new ArrayList<String>();
        pb.add("Sarso");
        pb.add("chole bhature");
        pb.add("Butter chicken");
        pb.add("Lassi");
        System.out.println("PB: "+pb);

        List<String> south=new ArrayList<String>();
        south.add("Biryani");
        south.add("Idli");
        south.add("Dosa");
        south.add("Chutney");
        south.add("Punugulu");
        System.out.println("South: "+south);
        
        List<String> up=new ArrayList<String>();
        up.add("Litti chokha");
        up.add("Sattu");
        System.out.println("UP: "+up);

        List<String> lpu=new ArrayList<String>();
        lpu.addAll(south);
        System.out.println("LPU: "+lpu);
        lpu.addAll(up);
        System.out.println("LPU: "+lpu);
        
        lpu.addAll(4,up);
        System.out.println("LPU: "+lpu);
        lpu.removeAll(up);
        System.out.println("LPU: "+lpu);
        lpu.remove("Idli");
        System.out.println("LPU: "+lpu);
        lpu.removeAll(south);
                System.out.println("LPU: "+lpu);
        lpu.addAll(south);
                System.out.println("LPU: "+lpu);
        lpu.remove("Idli");
                System.out.println("LPU: "+lpu);

        lpu.contains("Idli");
                System.out.println("LPU: "+lpu);
        lpu.contains("Dosa");
                System.out.println("LPU: "+lpu);
        System.out.println(lpu.contains("Idli"));
        System.out.println(lpu.contains("Dosa"));
        lpu.add(1,"Idli");
                        System.out.println("LPU: "+lpu);

}
}