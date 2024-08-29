public class Main {
    public static void main(String[] args) {
        Lutador l [] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França",31, 1.75F, 68.9F, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil",37, 1.7f, 120f, 5, 4, 3);
        l[5] = new Lutador("NERdate", "EUA", 30,1.8f, 105.6f, 12, 2, 4);

        Luta UEC01 = new Luta();
        System.out.println();

        UEC01.marcarLuta(l[1],l[0]);
        UEC01.lutar();

        System.out.println();
        l[0].status();
        System.out.println();
        l[1].status();
    }

}