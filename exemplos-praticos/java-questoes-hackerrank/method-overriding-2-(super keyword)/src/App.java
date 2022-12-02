public class App {
    public static void main(String[] args) throws Exception {

        Motocicleta motocicleta = new Motocicleta();
        
    }
}

class Bicicleta {

    String defina_me() {

        return "um veiculo com pedais";
    }
}

class Motocicleta extends Bicicleta {

    String defina_me() {

        return "um ciclo com um motor.";
    }

    Motocicleta() {

        System.out.println("Olá eu sou uma motocicleta, Eu sou " + defina_me());

        // Aqui a alteração
        // String temp = defina_me();
        String temp = super.defina_me();

        System.out.println("Meu ancestral é um ciclo que é " + temp);
    }
}