import java.util.Hashtable;

public class ClasseTabelaHash {
    
    int hashCode;

    ClasseTabelaHash(int hashCode) {

        this.hashCode = hashCode;
    }

    public int hashCode() {

        return hashCode;
    }

    public String toString() {

        return hashCode + "";
    }

    public static void main(String[] args) {
        
        Hashtable ht = new Hashtable();

        ht.put(new ClasseTabelaHash(10), "Java");
        ht.put(new ClasseTabelaHash(3), "C");
        ht.put(new ClasseTabelaHash(4), "C++");
        ht.put(new ClasseTabelaHash(5), "Ruby");
        ht.put(new ClasseTabelaHash(6), "null");

        System.out.println(ht); // 2. saída: {10=Java, 6=null, 5=Ruby, 4=C++, 3=C}
    }

    // 1. {10 =Java, 3 =C, 4 =C++, 6 =null, 5 =Ruby}
    // 2. {10 =Java, 6 =null, 5 =Ruby, 4 =C++, 3 =C}
    // 3. {3 =C, 4 =C++, 5 =Ruby, 6 =null, 10 =Java}
    // 4. Nenhum desses
   
}
