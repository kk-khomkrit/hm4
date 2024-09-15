import java.util.*;

public class more_than {
    public static void main(String[] args) {
        Scanner compare=new Scanner(System.in);

        System.out.println();
        System.out.print("ระบุค่าที่ 1: ");
        int slot1=compare.nextInt();
        System.out.print("ระบุค่าที่ 2: ");
        int slot2=compare.nextInt();
        System.out.print("ระบุค่าที่ 3: ");
        int slot3=compare.nextInt();


        if (slot1>slot2) {
            if (slot1>slot3) {
                System.out.println("ค่าที่ 1: "+slot1+" ค่ามากที่สุด");
            }
            else {
                System.out.println("ค่าที่ 3: "+slot3+" ค่ามากที่สุด");
            }
        }
        else {
            if (slot2>slot3) {
                System.out.println("ค่าที่ 2: "+slot2+" ค่ามากที่สุด");
            }
            else {
                System.out.println("ค่าที่ 3: "+slot3+" ค่ามากที่สุด");
            }
        }
        
    }
}
