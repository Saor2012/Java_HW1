public class main {
    public static void main(String[] args) {
        int []Array = {3, 4, 2, 6, 1, 9, 5, 8};
        String str = "";
        //coordsSector(2, 3);
        //coordsSector(-2, 3);
        //coordsSector(2, -3);
        //coordsSector(-2, -3);
        //System.out.println(Foo1(3, 2));
        //System.out.println(Foo2(100));
        //System.out.println(MathMax(2, 2, 2) + 3);
        //System.out.println(MathMax(-1, 2, 0) + 3);
        //MathSum(1, 2, 3, 4);
        //MathFactorial(5);
        //Foo3(16);
        //Foo3(7);
        //Foo3(23);
        //Foo3(90);
        //Foo4(10);
        //MathFindArrayMin(Array);
        //MathFindArrayMax(Array);
        //MathReverse(Array);
        //MathFindArraySum(Array);
        //MathSelectArraySort(Array);
        //MathInsertArraySort(Array);
        //MathBubbleArraySort(Array);
        /*System.out.println("New");
        for (int i = 0; i < Array.length; i++)
            System.out.println(Array[i]);*/
        //DataGetDay(6, true);
        //DataGetDay(6, false);
        //System.out.println(str = TranslateToString(10));

    }
    public static void coordsSector(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("I sector at (" + x + ", " + y + ").");
        } else if (x < 0 && y > 0) {
            System.out.println("II sector at (" + x + ", " + y + ").");
        } else if (x < 0 && y < 0) {
            System.out.println("III sector at (" + x + ", " + y + ").");
        } else if (x > 0 && y < 0) {
            System.out.println("IV sector at (" + x + ", " + y + ").");
        } else System.out.println("Senter at (" + x + ", " + y + ").");
    }
    public static int Foo1(int a, int b) {
        return a % 2 == 1 ? a + b: a * b;
    }
    public static int MathMax(int a, int b, int c) {
        return a * b * c > a + b + c ? a * b * c : a + b + c;
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
    public static void MathSum(int a, int b, int c, int d) {
        System.out.println("Sum: " + (a + b + c + d));
        int i = 0;
        if (a > 0 && a < 100) i++;
        if (b > 0 && b < 100) i++;
        if (c > 0 && c < 100) i++;
        if (d > 0 && d < 100) i++;
        System.out.println("More 0 and less 100: " + i);
    }
    public static void NumberToSum(int num) {
        int i = num, x1, x2;
        //if ((x1 = num - i) > 0)
        for (int j = 9; j >= 0; j--) {
            if ((num - j) % 10 == 0)
                x1 = j;
        }


    }
    public static void MathFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++)
            result *= i;
        System.out.println("Factorial of " + num +": " + result);
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
        //System.out.print("Number: " + number + "\n");

        for (int i = 1; i <= 5; i += 2) {
            if (number % i >= 1) {
                test = true;
                //System.out.print(number + " % " + i + " = " + test + "\n");
            }
        }
        if (number % 2 >= 1) {
            test = true;
            //System.out.print(number + " % 2 =" + test + "\n");
        }

        System.out.print("Number " + number + " is prime: " + test + "\n");
        return test;
    }
    public static void Foo4(int number) {
        for (int i = number; i >= 1; i--)
            System.out.println(i);
    }
    public static void MathReverse(int []arr) {
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            if (arr[i] % 2 == 1) index++;
        }
        System.out.println("Index: " + index + ".");
    }
    public static int MathFindArrayMin(int []arr) {
        int min = arr[0], index = 0;
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (!(arr[i] > min)) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min number: " + min + ", index: " + (index + 1) + ".");
        return min;
    }
    public static int MathFindArrayMax(int []arr) {
        int max = arr[0], index = 0;
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (!(arr[i] < max)) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Max number: " + max + ", index: " + (index + 1) + ".");
        return max;
    }
    public static int MathFindArraySum(int []arr) {
        int sum = 0, index = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] % 2 == 1) {
                sum += arr[i];
                index++;
            }
        }
        System.out.println("Array's sum: " + sum + ", index: " + (index + 1) + ".");
        return sum;
    }
    public static void MathBubbleArraySort(int []arr) {
        int i;
        boolean flag = true;
        int temp;
        for(i = 1; (i <= arr.length) && flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
        }
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void MathInsertArraySort(int []arr) {
        int i, temp, j;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void MathSelectArraySort(int []arr) {
        int i, min, temp;
        for (i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static String DataGetDay(int day, boolean state) {
        if (state) {
            switch(day) {
                case 0: System.out.println("Monday");
                    return "Monday";
                case 1: System.out.println("Tuesday");
                    return "Tuesday";
                case 2: System.out.println("Wednesday");
                    return "Wednesday";
                case 3: System.out.println("Thursday");
                    return "Thursday";
                case 4: System.out.println("Friday");
                    return "Friday";
                case 5: System.out.println("Saturday");
                    return "Saturday";
                case 6: System.out.println("Sunday");
                    return "Sunday";
                default: System.out.println("Didn't right day.");
                    return "-1";
            }
        } else {
            switch(day) {
                case 1: System.out.println("Monday");
                    return "Monday";
                case 2: System.out.println("Tuesday");
                    return "Tuesday";
                case 3: System.out.println("Wednesday");
                    return "Wednesday";
                case 4: System.out.println("Thursday");
                    return "Thursday";
                case 5: System.out.println("Friday");
                    return "Friday";
                case 6: System.out.println("Saturday");
                    return "Saturday";
                case 0: System.out.println("Sunday");
                    return "Sunday";
                default: System.out.println("Didn't right day.");
                    return "-1";
            }
        }
    }
    public static String TranslateToString(int num) {
        return Integer.toString(num);
    }
}
