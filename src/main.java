public class main {
    public static void main(String[] args) {
        //System.out.println(Foo1(3, 2));
        //System.out.println(Foo2(100));
        //Foo3(16);
        //Foo3(7);
        //Foo3(23);
        //Foo3(90);
        Foo4(10);
    }
    public static int Foo1(int a, int b) {
        return a % 2 == 1 ? a + b: a * b;
    }
    public static String Foo2(int number) {
        if (number > 0 && number < 19)
            return "F";
        else if (number >= 20 && number <= 39)
            return "E";
        else if (number >= 40 && number <= 59)
            return "D";
        else if (number >= 60 && number <= 74)
            return "C";
        else if (number >= 75 && number <= 89)
            return "B";
        else if (number >= 90 && number <= 100)
            return "A";
        else return "0";
    }
    public static boolean Foo3(int number) {
        /*if ((number % 2 >= 1 && number % 3 >= 1 && number % 5 >= 1) && number % number == 0) {
            System.out.print("True " + number);
            return true;
        } else {
            System.out.print("False " + number);
            return false;
        }*/
        boolean test = false;
        System.out.print("Number: " + number + "\n");
        if (number % 2 >= 1) {
            test = true;
            System.out.print(number + " % 2 =" + test + "\n");
        }
        for (int i = 1; i <= 5; i += 2) {
            if (number % i >= 1) {
                test = true;
                System.out.print(number + " % " + i + " = " + test + "\n");
            }
        }

        System.out.print(" Result " + test + "\n");
        return test;
    }
    public static void Foo4(int number) {
        for (int i = number; i >= 1; i--)
            System.out.println(i);
    }
}
