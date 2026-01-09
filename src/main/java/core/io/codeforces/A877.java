package core.io.codeforces;

import java.util.Scanner;

public class A877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] nomes = {"Danil", "Olya", "Slava", "Ann", "Nikita"};
        int count = 0;

        for (String nome : nomes) {
            int pos = s.indexOf(nome);
            while (pos != -1) {
                count++;
                pos = s.indexOf(nome, pos + 1);
            }
        }

        System.out.println(count == 1 ? "YES" : "NO");
    }
}
