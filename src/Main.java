import java.util.*;

public class Main {
    public static void main(String[] args) {

        // l = lengvi s = sunki
        System.out.println("-------------------l1.---------------------");

        int a = 5;
        int b = 12;
        lPirmas(a, b);

        System.out.println("-------------------l2.---------------------");

        System.out.println(PISq());

        System.out.println("-------------------l3.---------------------");

        a = 9;
        b = 8;
        System.out.println(lTrecias(a, b));

        System.out.println("-------------------l4.---------------------");

        int[] masyvas = {10, 20, 3, 8, 15, 2, 4, 2};
        printArray(masyvas);

        System.out.println("\n-------------------l5.---------------------");
        int min = 2;
        int max = 50;
        System.out.println(lPenktas(min, max));

        System.out.println("-------------------l6.---------------------");

        min = 6;
        max = 90;
        int length = 14;
        int[] temp = new int[length];
        temp = lSestas(min, max, length);

        for (int i = 0; i < length; i++) {
            System.out.print(temp[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n-------------------l7.---------------------");

        System.out.println("Masyvo suma: " + lSeptintas(temp));

        System.out.println("-------------------l8.---------------------");

        double vidurkis = (double) lSeptintas(temp) / temp.length;

        System.out.println("Masyvo vidurkis: " + vidurkis);

        System.out.println("-------------------l9.---------------------");

        int m = 4;
        int n = 20;
        lDevintas(m, n);

        System.out.println("-------------------l10.---------------------");

        String sakinys = "Šiandien labai graži diena";
        System.out.println("Sakinys: " + sakinys);
        lDesimtas(sakinys);

        System.out.println("-------------------l11.---------------------");

        String zodis = "Dovydas";
        System.out.print(zodis + " ");
        lVenuoliktas(zodis);

        System.out.println("\n-------------------s1.---------------------");

        sPirmas(zodis);

        System.out.println("-------------------s2.---------------------");

        sAntras(10);

        System.out.println("-------------------s3.---------------------");

        int number = (int) (Math.random() * 100);

        int result = sTrecias(number);
        System.out.println("The number " + number + " is divisible by " + result + " integers.");

        System.out.println("-------------------s4.---------------------");

        int[] array = new int[100];
        array = arrayGenerator(100, 33, 77);
        sortByDivisors(array);

        System.out.print("Sorted array: ");
        printArray(array);
        // checked with chat gpt if i get the correct output

        System.out.println("\n-------------------s5.---------------------");

        array = arrayGenerator(100, 333, 777);
        System.out.print("Random array 333-777: ");
        printArray(array);
        System.out.println("\nNumber of prime numbers: " + countArray(array));

        System.out.println("-------------------s8.---------------------");
    }

    public static void lPirmas(int a, int b) {
        System.out.println(a + b);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int lTrecias(int a, int b) {
        return a * b;
    }

    public static void printArray(int[] masyvas) {
        for (int skaiciai : masyvas) {
            System.out.print(skaiciai + " ");
        }
    }

    public static int lPenktas(int min, int max) {
        return (int) (min + Math.random() * max);
    }

    public static int[] lSestas(int min, int max, int length) {
        int[] masyvas = new int[length];

        for (int i = 0; i < length; i++) {
            masyvas[i] = (int) (min + Math.random() * max);
        }
        return masyvas;
    }

    public static int lSeptintas(int[] masyvas) {
        int sum = 0;
        for (int num : masyvas) {
            sum += num;
        }

        return sum;
    }

    public static void lDevintas(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
            for (int j = 0; j < b - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lDesimtas(String sakinys) {
        int charCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < sakinys.length(); i++) {
            char ch = sakinys.charAt(i);
            if (ch == ' ') {
                spaceCount++;
            } else {
                charCount++;
            }
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Total: " + (charCount + spaceCount));
    }

    public static void lVenuoliktas(String zodis) {
        StringBuilder sidoz = new StringBuilder();
        for (int i = zodis.length() - 1; i >= 0; i--) {
            sidoz.append(zodis.charAt(i));
        }
        System.out.print(sidoz);
    }

    public static void sPirmas(String zodis) {
        System.out.println("---" + zodis + "---");
    }

    public static void sAntras(int length) {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }

        StringBuilder result = new StringBuilder();
        StringBuilder currentNumber = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else {
                if (currentNumber.length() > 0) {
                    result.append("[").append(currentNumber).append("]");
                    currentNumber.setLength(0);
                }
                result.append(c);
            }
        }

        if (currentNumber.length() > 0) {
            result.append("[").append(currentNumber).append("]");
        }

        System.out.println(result);
    }

    public static int sTrecias(int number) {
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] arrayGenerator(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }


    public static void sortByDivisors(int[] array) {
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, (a, b) -> countDivisors(b) - countDivisors(a));
        for (int i = 0; i < array.length; i++) {
            array[i] = boxedArray[i];
        }
    }

    public static int countDivisors(int num) {
        int count = 0;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                count += 2;
            }
        }
        if (sqrt * sqrt == num) {
            count--;
        }
        return count;
    }

    public static int countArray(int[] number) {
        int count = 0;

        for (int num : number)
            if (isPrime(num)) {
                count++;
            }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}