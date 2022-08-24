public class App {
    public static void main(String[] args) throws Exception {

        int num1 = 11; /* 11 = 00001011 */
        int num2 = 22; /* 22 = 00010110 */
        int resultado = 0;

        resultado = num1 & num2;
        System.out.println("num1 & num2 : 00000010 bit = " + resultado + " decimal");

        resultado = num1 | num2;
        System.out.println("num1 | num2 : 00011111 bit = " + resultado + " decimal");

        resultado  = num1 ^ num2;
        System.out.println("num1 ^ num2 : 00011101 bit = " + resultado + " decimal");

        resultado = ~ num1;
        System.out.println("~num1 : " + resultado +  " decimal");

        resultado = num1 << 2;
        System.out.println("num1 << 2 : " + resultado); 
        
        resultado = num1 >> 2;
        System.out.println("num1 >> 2 : " + resultado);
    }
}
