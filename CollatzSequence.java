import java.util.Scanner;

public class CollatzSequence {
    public static void main(String... aaa) {
        Scanner sc = new Scanner(System.in);
        int startingNumber= sc.nextInt();
        int temp1 = 0;
        while(startingNumber!=1)
        {
            if(startingNumber%2==0) {
                temp1=startingNumber/2;
                System.out.println(temp1);
            }
            else {
                temp1 =3*startingNumber+1;
                System.out.println(temp1);
            }
            startingNumber=temp1;
        }
    }
}