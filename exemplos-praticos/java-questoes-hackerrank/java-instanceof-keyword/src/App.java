import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static String contar(ArrayList minhaLista) {

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < minhaLista.size(); i++) {

            Object elemento = minhaLista.get(i);

            if(elemento instanceof Estudante)
               a++;

            if(elemento instanceof RockStar)
               b++;

            if(elemento instanceof Hacker)
              c++;
        }

        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);

        return ret;
    }

    public static void main(String[] args) throws Exception {

        ArrayList minhaLista = new ArrayList();

        Scanner teclado = new Scanner(System.in);

        int t = teclado.nextInt();

        for(int i = 0; i < t; i++) {

            String s = teclado.next();
            if(s.equals("Estudante")) 
               minhaLista.add(new Estudante());

            if(s.equals("RockStart"))
               minhaLista.add(new RockStar());

            if(s.equals("Hacker"))
               minhaLista.add(new Hacker());
        }

        System.out.println(contar(minhaLista));
    }
}


class Estudante {}
class RockStar {}
class Hacker {}