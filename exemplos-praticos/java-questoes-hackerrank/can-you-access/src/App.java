import java.io.*;
import java.security.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        NaoTerminada.proibirSair();

        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine().trim());

            Object o;

            Interna interna = new Interna();
            o = interna.new Privada();

            Interna.Privada internaPrivada = (Interna.Privada) o;

            String resposta = internaPrivada.potenciaDe2(num);

            System.out.println(num + " é " + resposta);

            System.out.println("Uma instância da classe: " + o.getClass().getCanonicalName() + " foi criada");

        } catch (NaoTerminada.ExcecaoInterceptadaSaida e) {
            
            System.out.println("Rescisão sem sucesso!!");
        }
    }

    static class Interna {

        private class Privada {

            private String potenciaDe2(int num) {

                return ((num & num - 1) == 0) ? "pontencia de 2" : "não é pontencia de 2";
            }
        }
    }
}

class NaoTerminada {

    public static class ExcecaoInterceptadaSaida extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void proibirSair() {

        final SecurityManager securityManager = new SecurityManager() {

            @Override
            public void checkPermission(Permission permission) {

                if (permission.getName().contains("exitVM")) {
                    
                    throw new ExcecaoInterceptadaSaida();           
                }
            }
        };

        System.setSecurityManager(securityManager);
    }
}

