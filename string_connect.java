import java.util.*;

/**
 * string_connect
 */
public class string_connect {

    public static void main(String[] args) {
        Scanner merch = new Scanner(System.in);
        System.out.print("ระบุค่าตัวที่ 1: ");
        String slot1=merch.next();
        System.out.print("ระบุค่าตัวที่ 2: ");
        String slot2=merch.next();
        System.out.print("ระบุค่าตัวที่ 3: ");
        String slot3=merch.next();

        System.out.println("= "+slot1+slot2+slot3);
    }
}