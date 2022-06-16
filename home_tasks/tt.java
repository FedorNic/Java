// Написать программу возрващающую число, которе без остатка делится на сумму цифр этого числа.
// import java.util.Scanner;
import java.util.Random;

public class tt {
    public static void main(String[] args) {
        int res = 0, num;
        while (true) {
            Random r = new Random();
            num = r.nextInt((200 - 10) + 1) + 10;
            while (num>0) {
                res += num%10;
                num = num/10;
            }
            if (num%res==0)
            break;
        }
        System.out.println(num);
    }
}
    //     do {
    //         int find = new Random().nextInt((200 - 10) + 1) + 10;
    //         int num = find;
    //         while (num>0) {
    //             res += num%10;
    //             num = num/10;

    //         }
    //     } while (num%res!=0);
    // System.out.println(num);    
        
        
        
        
        
        // while (true) {
        //     Random r = new Random();
        //     int num = r.nextInt((200 - 10) + 1) + 10;

        // }





        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Введите число n");
        // int num = iScanner.nextInt();
        // int res = 0;
        // while (num>0) {
        //     res += num%10;
        //     num = num/10;
        // }     
        // System.out.println("Сумма цифр числа = " + res);
        // System.out.println("Число, без остатка делящиеся на " + res + " = " + res*2);
        // iScanner.close();
