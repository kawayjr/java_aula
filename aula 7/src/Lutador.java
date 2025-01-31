public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String Categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //metodos

    public void apresentar(){
        System.out.println("Apresentamos o lutador: "+ getNome());
        System.out.println("Diretamente do país: "+getNacionalidade());
        System.out.println("com: "+getIdade());
        System.out.println("Altura: "+getAltura());
        System.out.println("e pesando: "+getPeso());
        System.out.println("Com "+getVitorias()+" Vitorias, "+ getDerrotas()+" Derrotas e "+ getEmpates()+" Empates.");
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("Peso: "+getCategoria());
        System.out.println("Altura: "+getAltura());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }

    //metodo especial construtor

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    //Metodos especiais G&S


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return Categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.Categoria="Inválido";
        } else if (peso <= 70.3) {
            this.Categoria="Leve";
        } else if (peso <= 83.9) {
            this.Categoria="Médio";
        } else if (peso <= 120.2) {
            this.Categoria="Pesado";
        } else {
            this.Categoria="Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
