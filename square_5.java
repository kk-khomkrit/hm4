import java.util.*;

public class square_5 {
    public static void main(String[] args) {
        int size=5;
        int row=1;
        int col=1;
        int loop=1;

        for(loop=1; loop<=3; loop++){
            for(row=1; row<6; row++){
                for(col=1; col<6; col++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
