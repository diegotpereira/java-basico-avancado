import java.util.TimeZone;

import javax.swing.JComboBox;

public class FusoHorario {
    
    private String zonaId;

    FusoHorario(JComboBox t) {

        zonaId = (String)t.getSelectedItem();
    }
    TimeZone getTimeZone() {

        return TimeZone.getTimeZone(zonaId);
        
    }
}
