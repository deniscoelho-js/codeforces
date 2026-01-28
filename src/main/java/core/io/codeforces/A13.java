package core.io.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A13 {

    public void frequencia(int a){
        int media = 0;
        for (int base = 2; base <= a - 1; base++) {
            media += convert(a, base);
        }
        System.out.println("---Resultado---");
        System.out.println("a media é: " + media + "/" + (a - 2));
    }

    public int convert(int a, int b) {
        List<Integer> aux = new ArrayList<>();
        while (a > 0) {
            aux.add(a % b);
            a = a / b;
        }
        Collections.reverse(aux);
        System.out.println(aux);

        int soma = aux.stream().mapToInt(Integer::intValue).sum();
        System.out.println("soma dos vetores:" + soma);
        System.out.println("");
        return soma;
    }

    public static void main(String[] args) {
        A13 vet = new A13();
        vet.frequencia(5);
    }
}
