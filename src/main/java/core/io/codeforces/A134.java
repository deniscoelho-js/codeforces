package core.io.codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A134 {
    public static void main(String[] args) {
//        int[] num = {1,2,3,4,5};
//        int[] num = {40,40,40,40};
//        int[] num = {1, 2, 4 ,6, 8};
        int[] num = {2, 4, 6};
        List<Integer> numSalvo = new ArrayList<>();
        List<Integer> indicesSalvos = new ArrayList<>();

        int soma = Arrays.stream(num).sum();

        for(int a : num){
            double media =(double)(soma - a) / (num.length - 1);
            if( a == media){
                numSalvo.add(a);
                indicesSalvos.add(Arrays.stream(num).boxed().toList().indexOf(a) + 1);
            }
        }

        System.out.println("indice: " + indicesSalvos);
        System.out.println("numero salvo: " + numSalvo);
    }
}
