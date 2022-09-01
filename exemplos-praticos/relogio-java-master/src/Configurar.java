import java.awt.*;

import javax.swing.JColorChooser;
import javax.swing.JMenuItem;;
public class Configurar {
    
    Color getCorFundo(JMenuItem j) {

        return JColorChooser.showDialog(j, "Selecione uma cor", Color.CYAN);
    }

    Color getTexto(JMenuItem j) {

        return JColorChooser.showDialog(j, "Selecione uma cor", Color.CYAN);
    }

    Color getFrame(JMenuItem j) {

        return JColorChooser.showDialog(j, "Selecione uma cor", Color.CYAN);
    }
}
