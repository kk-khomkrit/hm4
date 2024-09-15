import java.util.*;

public class grade {
    public static void main(String[] args) {
        Scanner score=new Scanner(System.in);
        System.out.println();
        System.out.print("กรอกคะแนน: ");
        int score_input=score.nextInt();

        if (score_input>=0&&score_input<=49) {
            System.out.println("ได้เกรด F");
        }
        if (score_input>=50&&score_input<=54) {
            System.out.println("ได้เกรด D");
        }
        if (score_input>=55&&score_input<=59) {
            System.out.println("ได้เกรด D+");
        }
        if (score_input>=60&&score_input<=64) {
            System.out.println("ได้เกรด C");
        }
        if (score_input>=65&&score_input<=69) {
            System.out.println("ได้เกรด C+");
        }
        if (score_input>=70&&score_input<=74) {
            System.out.println("ได้เกรด B");
        }
        if (score_input>=75&&score_input<=79) {
            System.out.println("ได้เกรด B+");
        }
        if (score_input>=80&&score_input<=100) {
            System.out.println("ได้เกรด A");
        }
        if (score_input<0||score_input>100) {
            System.out.println("ไม่พบเกรด");
        }
    }
}
