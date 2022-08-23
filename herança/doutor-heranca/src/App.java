public class App {
    public static void main(String[] args) throws Exception {

        Cirurgiao s = new Cirurgiao();
        s.Doutor_Detalhes();
        s.Cirurgiao_Detalhes();
    }
}

class Doutor {

    void Doutor_Detalhes() {

        System.out.println("Doutor Detalhes...");
    }
}

class Cirurgiao extends Doutor {

    void Cirurgiao_Detalhes() {

        System.out.println("Cirurgião Detalhes...");
    }
}