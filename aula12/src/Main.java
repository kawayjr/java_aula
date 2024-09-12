public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c= new Canguru();

        c.locomover();
        m.locomover();

        Lobo l = new Lobo();
        l.emitirSom();

        Cachorro x = new Cachorro();
        x.reagir(true);
        x.reagir(false);
    }
}