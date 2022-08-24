class Animal {
    
    void comer() {

        System.out.println("o animal está comendo...");
    }
}

class Cachorro extends Animal {

    void comer() {

        System.out.println("cachorro está comendo...");
    }

    public static void main(String[] args) {
    
        Animal a = new Cachorro();
        a.comer();
    }
}


