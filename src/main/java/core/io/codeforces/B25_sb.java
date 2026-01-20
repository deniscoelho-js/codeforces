package core.io.codeforces;

public class B25_sb {
    public static void main(String[] args) {
        String numb = "1433254446233";
        int n = numb.length();

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < n) {
            // se restam exatamente 4 dígitos → pega 2 + 2
            if (n - i == 4) {
                sb.append(numb.substring(i, i + 2)).append("-");
                sb.append(numb.substring(i + 2, i + 4));
                break; // terminou
            }
            // se ainda dá pra pegar 3 dígitos → pega 3
            else if (i + 3 <= n) {
                sb.append(numb.substring(i, i + 3));
                i += 3;
            }
            // se não dá pra pegar 3 mas dá pra pegar 2 → pega 2
            else if (i + 2 <= n) {
                sb.append(numb.substring(i, i + 2));
                i += 2;
            }

            // adiciona hífen se ainda não chegou no fim
            if (i < n) sb.append("-");
        }

        System.out.println(sb.toString());
    }
}
