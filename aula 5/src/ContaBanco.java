
public class ContaBanco {
    //Atributos, ou seja, declarando variáveis
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Personalizados, void não retorna, somente abre e fecha chaves
    //Método estado atual somente para mostrar o estado do objeto
    public void estadoAtual(){
        System.out.println("________________________________");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Dono "+this.getDono());
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(50);
            System.out.println("Conta Corrente de "+getDono()+" aberta com sucesso!");
        }else if ("CP".equals(t)){
            this.setSaldo(150);
            System.out.println("Conta poupança de  "+getDono()+"  aberta com sucesso!");
        }else{
            System.out.println("Informar se a conta é CC ou CP");
        }
    }
    public void fecharConta() {
        if (this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada porque saldo maior que zero");
        }else{
            System.out.println("Conta não pode ser fechada pois tem débito");
        }
        if (this.getSaldo()==0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar (float v) {
        if (this.getStatus()){
            //this.saldo = this.saldo+v; este é sem usar o método especial
           this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito de "+this.getSaldo()+" na conta de "+this.getDono()+" realizado com sucesso");
        }else System.out.println("Impossível depositar em conta fechada!");
    }
    public void sacar (float v){
        if (this.getStatus()){
            if(this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque de "+v+" na conta de "+ getDono()+" realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível sacar de conta fechada");
        }
    }
    public void pagarMensal(){
        int v=0;
        if (this.getTipo()=="CC"){
            v=12;
        }else if(this.getTipo()=="CP"){
            v=20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    //Método Construtor, cria uma classe personalizada (com atributos)
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //Método Setter e Getters, atribuem atributos as variáveis.
    public void setNumConta(int n){this.numConta = n;}
    public int getNumConta() {return this.numConta;}

    public void setDono(String d){this.dono = d;}
    public String getDono() {return this.dono;}

    public void setTipo(String tipo){this.tipo=tipo;}
    public String getTipo() {return this.tipo;}

    public void setSaldo(float saldo){this.saldo= saldo;}
    public float getSaldo() {return this.saldo;}

    public void setStatus(boolean status){this.status=status;}
    public boolean getStatus() {return status;}
}

