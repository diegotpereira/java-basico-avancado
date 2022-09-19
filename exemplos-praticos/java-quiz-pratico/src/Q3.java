public class Q3 {
    
    public static void main(String[] args) {
        
        A a = new B();
        
        System.out.println(a.x); // 10   
    }
}

class A {
    
    int x = 10;
}
class B extends A {

    int x = 20;
}