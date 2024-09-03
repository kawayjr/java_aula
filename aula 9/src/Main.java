public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3];

        p[0]= new Pessoa ("Masc", "Pedro", 22);
        p[1]= new Pessoa ("Fem", "Maria", 25);

        l[0] = new Livro ("Apresentado Java", "José Silva", 300, p[0]);
        l[1] = new Livro ("POO para iniciante", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro ("Java Avançado", "Jeremias Santos", 400, p[0]);

        System.out.println(l[0].detalhes());
    }
}