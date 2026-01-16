package core.io.codeforces;

public class A137 {
    public static void main(String[] args) {
        String s = "PPPPPPCCP";
        int cont = 0;
        int i = 0;

        while(i < s.length()){
            char atual = s.charAt(i);
            int j = i;

            int mudanca = 0;
            while (j < s.length() && s.charAt(j) == atual && mudanca < 5){
                j++;
                mudanca++;
            }
            cont++;
            i = j;
        }
        System.out.println(cont);
    }
}
