import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        //char operation;
        String result;
        String str1;
        String str2;
        int st2;

        if (text.contains("+")) {
            int x = text.indexOf("+");
            str1 = text.substring(0, x - 1);
            str2 = text.substring(x + 1);
            //operation = '+';
            int l1 = str1.length();
            int l2 = str2.length();
            if (l1 <= 10 && l2 <= 10) {
                str1 = str1.replace("\"", "");
            str2 = str2.replace("\"", "");
            result = str1 + str2;
        }
            else throw new Exception("Вводимые строки больше 10 символов");

        }
        else if (text.contains("-")) {
            int x = text.indexOf("-");
            str1 = text.substring(0, x - 1);
            str2 = text.substring(x + 1);
            //operation = '-';
            int l1 = str1.length();
            int l2 = str2.length();
            if (l1 <= 10 && l2 <= 10) {
            str1 = str1.replace("\"", "");
            str2 = str2.replace("\"", "");

            if (str1.contains(str2)) {
                int i1 = str1.indexOf(str2);
                String s1 = str1.substring(0, i1);
                result = s1;
            } else {
                result = str1;
            }
            }
            else throw new Exception("Вводимые строки больше 10 символов");
        }
        else if (text.contains("*")) {
            int x = text.indexOf("*");
            str1 = text.substring(0, x - 1);
            str2 = text.substring(x + 1);
            //operation = '*';
            int l1 = str1.length();
            int l2 = str2.length();
            if (l1 <= 10 && l2 <= 10) {
                str1 = str1.replace("\"", "");
            if (str2.contains("\"")) throw new Exception("Строку можно умножать только на числа");
            else {
                st2 = parseInt(str2);
                if (st2 >= 1 && st2 <= 10) {
                    result = str1.repeat(st2);
                } else throw new Exception("Строку можно умножать только на числа от 1 до 10");
            }
        }
        else throw new Exception("Вводимые строки больше 10 символов");

        } else if (text.contains("/")) {
            int x = text.indexOf("/");
            str1 = text.substring(0, x - 1);
            str2 = text.substring(x + 1);
            //operation = '/';
            int l1 = str1.length();
            int l2 = str2.length();
            if (l1 <= 10 && l2 <= 10) {
                str1 = str1.replace("\"", "");
                if (str2.contains("\"")) throw new Exception("Строку можно делить только на числа");
                else {
                    st2 = parseInt(str2);
                    if (st2 >= 1 && st2 <= 10) {
                        int newLen = l1 / st2;
                        result = str1.substring(0, newLen);
                    } else throw new Exception("Строку можно делить только на числа от 1 до 10");
                }
            }
            else throw new Exception("Вводимые строки больше 10 символов");

        } else throw new Exception("Неверная операция");

        if (result.length() <= 40) {
            System.out.println("\"" + result + "\"");
        } else {
            String result1 = result.substring(0, 39);
            System.out.println("\"" + result1 + "...\"");
        }
    }
}
