import java.util.BitSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int m = teclado.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for(int i = 0; i < m; i++) {

            String opCodigo = teclado.next();

            int num1 = teclado.nextInt();
            int num2 = teclado.nextInt();

            switch (opCodigo) {
                case "AND":

                    if (num1 == 1 && num2 == 2) {
                        
                        b1.and(b2);

                    } else if (num1 == 2 && num2 == 1) {
                        
                        b2.and(b1);

                    } else if (num1 == 1 && num2 == 1) {
                        
                        b1.and(b1);

                    } else if (num1 == 2 && num2 == 2) {
                        
                        b2.and(b2);
                    }
                    
                    break;


                case "OR":

                    if (num1 == 1 && num2 == 2) {
                        
                        b1.or(b2);

                    } else if (num1 == 2 && num2 == 1) {
                        
                        b2.or(b1);

                    } else if (num1 == 1 && num2 == 1) {
                        
                        b1.or(b1);

                    } else if (num1 == 2 && num2 == 2) {
                        
                        b2.or(b2);
                    }
                
                    break;


                case "XOR":

                    if (num1 == 1 && num2 == 2) {
                        
                        b1.xor(b2);

                    } else if (num1 == 2 && num2 == 1) {
                        
                        b2.xor(b1);

                    } else if (num1 == 1 && num2 == 1) {
                        
                        b1.xor(b1);

                    } else if (num1 == 2 && num2 == 2) {
                        
                        b2.xor(b2);
                    }
                
                    break;

                case "FLIP": 
                    if (num1 == 1) {
                        
                        b1.flip(num2);

                    } else if (num1 == 2) {
                        
                        b2.flip(num2);
                    }

                    break;

                case "SET": 
                    
                    if (num1 == 1) {
                        
                        b1.set(num2);

                    } else if (num1 == 2) {
                        
                        b2.set(num2);
                    }

                    break;
            
                default:
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
