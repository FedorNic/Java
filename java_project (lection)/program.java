/*
public class program {      // определение типа в неявной переменной
    public static void main(String[] args) {
        //System.out.println("Hello world");
        var s = 123;
        System.out.println(getType(s));
    }
    static String getType(Object o) {
        return o.getClass(). getSimpleName();
    }
}
*/

/*public class program {
    public static void main(String[] args) {
        int s = 123;
        s = s-- - --s; //s = 123 - 122 ?? Почему = 2
        System.out.println(s);
    }
}
*/
/*
public class program {
    public static void main(String[] args) {
        boolean s = 123 != 124;
       
        System.out.println(s);
    }
}
*/

/* 
public class program {
    public static void main(String[] args) {
        int[] arr[] = new int [3][5];
            for (int[] line:arr) {
                for (int item:line) {
                    System.out.printf("%d", item);
                }
            System.out.println();
        }
    }
}
*/

// public class program {
//     public static void main(String[] args) {
//         int[] arr[] = new int [3][5];
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[i].length; j++) {
//                     System.out.printf("%d", arr[i][j]);
//                 }
//             System.out.println();
//         }
//     }
// }

// Преобразование

// public class program {
//     public static void main(String[] args) {
//        // Не явное преобразование (автоматическое, расширяющее)
//        int i = 123;
//        double d = i;
//        System.out.println(i);   //123
//        System.out.println(d);   //123.0
//        // Явное преобразование "есть - ()" (сужающее)
//        int r = 123;
//        double m = (double)r;
//        System.out.println(r);   //123
//        System.out.println(m);   //123.0
//     }
// }

//  import java.util.Scanner;

//  public class program {
//      public static void main(String[] args) {
//          Scanner iScanner = new Scanner(System.in);
//          // System.out.printf("name : ");
//          // String name = iScanner.nextLine();
//          // System.out.printf("Привет, %s!", name);
//          System.out.printf("int a :  ");
//          int x = iScanner.nextInt();
//          System.out.printf("double a :  ");
//          double y = iScanner.nextDouble();
//          double z = (double)x+y;
//          System.out.printf("%d + %f = %f", x, y, z);
//          iScanner.close();
//      }
//  }

// Проверка на соответствие типу
// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a :  ");
//         boolean flag = iScanner.hasNextInt();   //
//         System.out.println(flag);               //  Тело проверки
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

// Форматированный вывод
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         String res = a + "+" + b + "=" + (a+b);
//         System.out.println(res);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a+b;
//         String res = String.format("%d+%d=%d", a,b,c);  // String.format, если хотим куда-то положить
//         System.out.println(res);                        //
//         System.out.printf("%d+%d=%d", a,b,c);
//     }
// }

// Функции
// public class program {
//     public static void say_hi() {
//         System.out.println("Hi! =)");
// }
//     static int sum(int a, int b) {
//         return a+b;
// }
//     static double factor(int a) {
//         if (a==1) return 1;
//         return a*factor(a-1);
// }
//     public static void main(String[] args) {
//         say_hi();                               // Hi!
//         System.out.println(sum(1, 3));     // 4
//         System.out.println(factor(5));        // 120
// }
// }

// Условный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c;
//         if (a>b) {
//             c = a;
//         }
//         else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// Тернарный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int min = a<b ? a:b;
//         System.out.println(min);    // Если a<b, выполняется левая часть до ":", если нет - правая.
//     }
// }

// Оператор выбора
// public class program {
//     public static void main(String[] args) {
//         int mounth = 2;
//         String text = "";
//         switch (mounth) {    // переменная для проверки
//             case 1:          // значение переменной для проверки
//             text = "Autumn";
//             break;
//         default:
//             text = "mistake";
//             break;
//         }
//         System.out.println(text);
//     }
// }

//Циклы

//While
// public class program {
//     public static void main(String[] args) {
//         int a = 321;
//         int count = 0;
//         while (a!=0) {
//             a /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// Do while (с постусловием)
// public class program {
//     public static void main(String[] args) {
//         int a = 321;
//         int count = 0;
//         do {
//             a /= 10;
//             count++; 
//         } while (a!=0);
//         System.out.println(count);
//     }
// }

//For
// public class program {
//     public static void main(String[] args) {
//         for (int index = 0; index < 10; index++) {
//             if (index%2==0) continue;       // Цикл не переходит дальше, а возвращается к новому индексу
//             // break                        // Завершает цикл принудительно
//             System.out.println(index);
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         for (int index = 0; index < 5; index++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//         System.out.println();
//         }
//     }
// }