import java.util.*;


public class plus_until_set {
    public static void main(String[] args) {
        Scanner set = new Scanner(System.in);
        System.out.print("ระบุค่า: ");
        int my_set = set.nextInt();

        int loop=1;

        System.out.println("สรุป");
        for(loop=1; loop<=my_set; loop++){
            System.out.println(loop);
        }
    }
}
