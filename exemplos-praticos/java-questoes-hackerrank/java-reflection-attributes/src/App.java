import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Class estudante = Estudante.class;
        Method[] metodos = estudante.getDeclaredMethods();

        ArrayList<String> listaMetodos = new ArrayList<>();

        for(Method method : metodos) {

            listaMetodos.add(method.getName());
        }

        Collections.sort(listaMetodos);

        for(String name: listaMetodos) {

            System.out.println(name);
        }
    }
}

class Estudante {

    private String nome;
    private String id;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}