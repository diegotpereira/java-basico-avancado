import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int numeroDePaginas = Integer.parseInt(bufferedReader.readLine().trim());
        int proximaPagina = Integer.parseInt(bufferedReader.readLine().trim());

        int resultado = Resultado.pageCount(numeroDePaginas, proximaPagina);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int pageCount(int numeroDePaginas, int proximaPagina) {
        
        int frente = proximaPagina / 2;
        int voltar = numeroDePaginas % 2 ==  0 ? (numeroDePaginas - proximaPagina / 2) : (numeroDePaginas - proximaPagina) / 2;
        return Math.min(frente, voltar);
    }

    // public static int pageCount(int numeroDePaginas, int proximaPagina) {

    //     int paginaIndice = (proximaPagina / 2) + 1;
    //     int totalPaginas = (numeroDePaginas / 2) + 1;

        
    //     return Math.abs(1 - paginaIndice) > Math.abs(paginaIndice - totalPaginas) ? Math.abs(paginaIndice - totalPaginas) : Math.abs(1 - paginaIndice);
    // }

    // public static int pageCount(int numeroDePaginas, int proximaPagina) {

    //     float meio = numeroDePaginas / 2;
    //     int virarPagina = 0;

    //     if (proximaPagina <= meio) {
            
    //         virarPagina = proximaPagina / 2;

    //     } else {

    //         virarPagina = (numeroDePaginas - proximaPagina) / 2;

    //         if ((numeroDePaginas - proximaPagina) % 2 != 0 && numeroDePaginas % 2 == 0) {
                
    //             virarPagina++;
    //         }
    //     }
    //     return virarPagina;
    // }
}