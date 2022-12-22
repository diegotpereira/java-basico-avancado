import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Scanner;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
    int budgetLimit() default 0;
}

class FamilyMember {
    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    public void seniorMember(int budget, int moneySpend) {

        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    public void juniorUser(int budget, int moneySpend) {

        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int testeCasos = Integer.parseInt(teclado.nextLine());

        while (testeCasos > 0) {
            
            String role = teclado.next();
            int spend = teclado.nextInt();

            try {
                Class annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();

                for(Method method : methods) {

                    if(method.isAnnotationPresent(FamilyBudget.class)) {

                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = family.budgetLimit();

                        if(userRole.equals(role)) {

                            if (budgetLimit >= spend) {
                                
                                method.invoke(FamilyMember.class.newInstance(), budgetLimit, spend);

                            } else {

                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            testeCasos--;
        }
        teclado.close();
    }
}
