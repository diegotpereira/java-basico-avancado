import java.util.Calendar;

import javax.swing.JRadioButtonMenuItem;

public class Tempo {
    
    private int hora;
    private int minuto;
    private int segundo;
    private int AM_PM;
    private int ano;
    private int mes;
    private int dia;
    private String tempo;

    Tempo(Calendar calendar) {

        hora = calendar.get(Calendar.HOUR);
        minuto = calendar.get(Calendar.MINUTE);
        segundo = calendar.get(Calendar.SECOND);
        AM_PM = calendar.get(Calendar.AM_PM);
    }

    String definirTempo(JRadioButtonMenuItem _24, JRadioButtonMenuItem _12) {

        // Antes do meio dia ou depois do meio dia
        if (_24.isSelected() && AM_PM == 1) {
            
            hora += 12;
        }

        // se hora for menor que 10
        if (hora < 10) {
            
            tempo = "0" + hora + ":";

        } else {
            
            tempo = hora + ":";
        }

        // se minuto for menor que 10
        if (minuto < 10) {
            
            tempo = tempo + "0" + minuto + ":";

        } else {

            tempo = tempo + minuto + ":";
        }

        // se segundo for menor que 10
        if (segundo < 10) {
            
            tempo = tempo + "0" + segundo + " ";

        } else {

            tempo = tempo + segundo + " ";
        }

        //  se 12 for selecionado
        if (_12.isSelected()) {
            
            switch(AM_PM) {

                case 0: tempo = tempo + "AM";
                break;

                case 1: tempo =  tempo + "PM";
                break;
            }
        }
        return tempo;
    }
}
