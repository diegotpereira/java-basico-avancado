import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int numeroAleatorio = (int) (Math.random() * 100 + 1);
        int respostaUsuario = 0;

        System.out.println("O palpite correto seria " + numeroAleatorio);

        int contar = 1;

        while(respostaUsuario != numeroAleatorio) {

            String resposta = JOptionPane.showInputDialog(null, "Insira um palpite entre 1 e 100", "Jogo de adivinhação", 3);
            respostaUsuario = Integer.parseInt(resposta);

            JOptionPane.showMessageDialog(null, "" + Adivinha(respostaUsuario, numeroAleatorio, contar));
            contar++;
        }
    }

    public static String Adivinha(int respostaUsuario, int numeroAleatorio, int contar) {

        if (respostaUsuario <= 0 || respostaUsuario > 100) {
            
            return "Seu palpite é inválido";

        } else if (respostaUsuario == numeroAleatorio) {
            
            return "Correto!\nTotal de Palpites: " + contar;

        } else if (respostaUsuario > numeroAleatorio) {
            
            return "Seu palpite é muito alto, tente novamente. \nNúmero de tentativa" + contar;

        } else if (respostaUsuario < numeroAleatorio) {
            
            return "Seu palpite é muito baixo, tente novamente. \nNúmero de tentativa" + contar;

        } else {

            return "Seu palipite é incorreto\nNúmero de tentativa: " + contar;
        }
    }
}
