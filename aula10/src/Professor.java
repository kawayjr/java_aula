public class Professor extends Pessoa {
    private String especializadade;
    private float salario;

    private void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEspecializadade() {
        return especializadade;
    }

    public void setEspecializadade(String especializadade) {
        this.especializadade = especializadade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
