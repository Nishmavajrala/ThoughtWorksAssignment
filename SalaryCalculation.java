import java.util.Scanner;

public class SalaryCalculation{
    public static void main(String... aaa) {
        Scanner sc = new Scanner(System.in);
        int[] numberOfWorkingHours = new int[7];
        int salary=0,temp1=1,totalWorkingHours=0;
        int i=0;
        for (i=0;i<7;i++)
            numberOfWorkingHours[i] = sc.nextInt();
        for (i=0;i<7;i++)
            totalWorkingHours=totalWorkingHours+numberOfWorkingHours[i];
        for(i=1;i<6;i++)
        {
            if(numberOfWorkingHours[i]<=8) {
                temp1 = numberOfWorkingHours[i] * 100;
            }
            else {
                temp1=numberOfWorkingHours[i]*100+(numberOfWorkingHours[i]-8)*15;
            }
            salary+=temp1;
        }
        if(numberOfWorkingHours[6]!=0)
        {
            temp1 = numberOfWorkingHours[6] * 100;
            temp1+=((temp1*25)/100);
            salary += temp1;
        }
        if(numberOfWorkingHours[0]!=0)
        {
            temp1 = numberOfWorkingHours[0] * 100;
            temp1+=((temp1*50)/100);
            salary+=temp1;
        }
        if(totalWorkingHours>40)
        {
            temp1=(totalWorkingHours-40)*25;
            salary+=temp1;
        }
        System.out.println(salary);
    }
}
