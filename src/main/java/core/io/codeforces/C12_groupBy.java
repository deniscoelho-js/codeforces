package core.io.codeforces;

import java.util.*;
import java.util.stream.Collectors;

public class C12_groupBy {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("banana", "apple", "banana", "orange");

        List<Integer> valores = new ArrayList<>();

        int somaMenorValor = 0;
        int somaMaiorValor = 0;

        Map<String, Long> frequencia = frutas.stream().collect(Collectors.groupingBy(f -> f, Collectors.counting()));
//        System.out.println(frequencia);

        // gera os valores de acordo com o tamanho da lista de frequencia
        for (int i = 0; i< frequencia.size(); i++){
            valores.add((int) (Math.random() * 100));
        }

        Collections.sort(valores);
        System.out.println("Valores ordenados: " + valores);

        // ordena para menor valor
        List<Map.Entry<String, Long>> ordenadosParaMenorValor = frequencia.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue(
                Comparator.reverseOrder())).toList();

        System.out.println("Lista menor valor: " + ordenadosParaMenorValor);

        for(int i = 0; i < ordenadosParaMenorValor.size(); i++){
            long quantidadeFreq = ordenadosParaMenorValor.get(i).getValue();
            int preco = valores.get(i);
            somaMenorValor += quantidadeFreq * preco;
        }

        System.out.println("O menor valor é: " + somaMenorValor);

        System.out.println("-----------------");

        //ordena para maior valor
        List<Map.Entry<String, Long>> ordenadosParaMaiorValor = frequencia.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()).toList();
        System.out.println("Lista maio valor: " + ordenadosParaMaiorValor);

        for(int i = 0; i < ordenadosParaMaiorValor.size(); i++){
            long qntFrequencia = ordenadosParaMaiorValor.get(i).getValue();
            int preco = valores.get(i);
            somaMaiorValor+=qntFrequencia * preco;
        }

        System.out.println("O menor valor é: " + somaMaiorValor);
    }
}
