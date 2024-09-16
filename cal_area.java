import java.util.*;

public class cal_area {
    public static void main(String[] args) {
        Scanner cal=new Scanner(System.in);

        System.out.println("คำนวณพื้นที่'สี่เหลี่ยม'");
        System.out.print("กำหนดด้านของ'สี่เหลี่ยม': ");
        int square=cal.nextInt();
        System.out.println("พื้นที่ของ'สี่เหลี่ยม': "+(square*square));

        System.out.println();
        System.out.println("คำนวณพื้นที่'สามเหลี่ยม'");
        System.out.print("กำหนดความกว้างของฐาน: ");
        int base=cal.nextInt();
        System.out.print("กำหนดความสูงของสามเหลี่ยม: ");
        int height=cal.nextInt();
        System.out.println("พื้นที่ของ'สามเหลี่ยม': "+((height*base)*1/2));

        System.out.println();
        System.out.println("คำนวณพื้นที่'วงกลม'");
        System.out.print("กำหนดรัศมี: ");
        int radius=cal.nextInt();
        System.out.println("พื้นที่ของ'วงกลม': "+(3.14*radius*radius));
    }
}
