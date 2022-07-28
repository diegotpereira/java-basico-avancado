import java.awt.EventQueue;

public class App {
    public static void main(String[] args) throws Exception {

        // https://github.com/janbodnar/Java-Snake-Game

        EventQueue.invokeLater(() -> {
            Cobra cobra = new Cobra();
            cobra.setVisible(true);
        });
    }
}
