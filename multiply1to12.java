import java.util.*;

import javax.sound.midi.SysexMessage;


public class multiply1to12 {
    public static void main(String[] args) {
        Scanner multiply=new Scanner(System.in);
        System.out.print("ระบุตัวเลข: ");
        int number=multiply.nextInt();

        int multi=1;

        for(multi=1; multi<=12; multi++){
            System.out.println(number+"*"+multi+"="+number*multi);
        }
    }
}
