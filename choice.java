import java.util.*;

public class choice {
    public static void main(String[] args) {
        Scanner main=new Scanner(System.in);

        System.out.print("ระบุค่า x: ");
        float x =main.nextFloat();
        System.out.print("ระบุค่า y: ");
        float y =main.nextFloat();

        System.out.println("1 = +");
        System.out.println("2 = -");
        System.out.println("3 = *");
        System.out.println("4 = /");
        System.out.print("โปรดระบุตัวเลขเพื่อคำนวณ: ");
        int choice=main.nextInt();

        switch (choice) {
            case 1:
                System.out.println(x+"+"+y+"="+(x+y));
                break;
        
            case 2:
            System.out.println(x+"-"+y+"="+(x-y));
            break;
            case 3:
            System.out.println(x+"*"+y+"="+(x*y));
            break;
            case 4:
            System.out.println(x+"/"+y+"="+(x/y));
            break;
            default:
                break;
        }
    }
}
