package core.io.codeforces;

import java.util.Arrays;
import java.util.Comparator;

public class A456 {
    public static void main(String[] args) {
        int n = 2;
        int[][] laptops = new int[n][2];

        for(int i = 0; i<n; i++){
            laptops[i][0] = (int) (Math.random() * 100);
            laptops[i][1] = (int) (Math.random() * 100);
            System.out.println(laptops[i][0] + " " + laptops[i][1]);
        }

        Arrays.sort(laptops, Comparator.comparingInt(a -> a[0]));

        boolean felicidade = false;
        for (int i = 1; i < n; i++){
            if(laptops[i][1] < laptops[i -1][1]){
                felicidade = true;
                break;
            }
        }
        System.out.println(felicidade ? "felicidade" : "tristeza");
    }
}
