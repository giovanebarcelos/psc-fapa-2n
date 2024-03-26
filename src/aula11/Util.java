package aula11;

import java.util.Arrays;
import java.util.Scanner;

public class Util {
    public static int getInt(String rotulo) {
        Scanner ler = new Scanner(System.in);
        System.out.print(rotulo);
        return ler.nextInt();
    }

    public static String getString(String rotulo) {
        Scanner ler = new Scanner(System.in);
        System.out.print(rotulo);
        return ler.nextLine();
    }

    public static String getString(
            String rotulo, String[] opcoes,
            String msgErro) {
        String str;
        while (true){
            str = Util.getString(rotulo);
            if ( Arrays.stream(opcoes).anyMatch(
                    str::equals)){
                break;
            } else {
                System.out.println(msgErro);
            }
        }
        return str;
    }
}
