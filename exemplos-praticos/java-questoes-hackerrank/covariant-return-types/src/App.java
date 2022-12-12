import java.io.BufferedReader;
import java.io.InputStreamReader;

class Flor {

    public String qualEhSeuNome() {

        return "Tenho muitos nomes e tipos.";
    }
}

class Jasmim extends Flor {

    @Override
    public String qualEhSeuNome() {
        
        return "Jasminie";
    }
}

class Lirio extends Flor {

    @Override
    public String qualEhSeuNome() {
        
        return "Lirio";
    }
}

class Regiao {

    Flor suaFlorNacional() {

        return new Flor();
    }
}

class BengalaOcidental extends Regiao {

    @Override
    Flor suaFlorNacional() {
        
        return new Jasmim();
    }
}

class AndhraPradesh extends Regiao {

    @Override
    Lirio suaFlorNacional() {
        
        return new Lirio();
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();
        Regiao regiao = null;

        switch (s) {
            case "BengalaOcidental":
                regiao = new BengalaOcidental();
                break;

            case "AndhraPradesh":
                regiao = new AndhraPradesh();
                break;
        
            default:
                break;
        }

        Flor flor = regiao.suaFlorNacional();

        System.out.println(flor.qualEhSeuNome());
    }
}
