import java.util.*;
public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in binary format");
        String s = sc.nextLine();
        MaximumOddBinaryNumber obj = new MaximumOddBinaryNumber();
        String p = obj.maximumOddBinaryNumber(s);
        System.out.println(p);
    }

    public String maximumOddBinaryNumber(String s) {
        int a = s.length();
        int b = 0;
        for (int i = 0; i < a; i++) {
            if (s.charAt(i) == '1')
                b++;
        }
        String n = "";
        for (int i = 0; i < a; i++) {
            if (b == 1) {
                if (i == a - 1) {
                    n += "1";
                    b--;
                } else
                    n += "0";
            } else {
                n += "1";
                b--;

            }

        }
        return n;
    }
}

