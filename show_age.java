import java.util.*;

/**
 * show_age
 */
public class show_age {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        int this_year=2567;

        System.out.println();
        System.out.print("กรอกชื่อจริง: ");
        String first_name=info.next();
        System.out.print("กรอกนามสกุล: ");
        String last_name=info.next();
        System.out.print("กรอกปีเกิด: ");
        int birth_year=info.nextInt();


        System.out.println();
        System.out.println("สรุป");
        System.out.println("ชื่อ: "+first_name);
        System.out.println("นามสกุล: "+last_name);
        System.out.println("ปีเกิด: "+birth_year+" อายุปีนี้: "+(this_year-birth_year));
    }
}