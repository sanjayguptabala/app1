import java.util.Scanner;

public class ChangeString {

    static String convert(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == 0 || i == str.length() - 1) {
                result += ch;          // first & last same
            } else {
                result += (char)(ch + 1); // next alphabet
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.next();

        System.out.println("Output: " + convert(str));

        sc.close();
    }
}
