import java.util.*;

/**
 * median
 */
public class median {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("ระบุค่าที่ 1: ");
        int slot1=number.nextInt();
        int slot2=number.nextInt();
        int slot3=number.nextInt();
        int slot4=number.nextInt();
        int slot5=number.nextInt();

        System.out.println("ค่าเฉลี่ยคือ "+(slot1+slot2+slot3+slot4+slot5)/5);
    }
    
}