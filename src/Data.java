public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public void SetDia(int dia){
        this.dia=dia;
    }
    public void SetMes(int mes){
        this.mes=mes;
    }
    public void SetAno(int ano){
        this.ano=ano;
    }
            
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public void mostrar(){
        System.out.println(this.getDia()+"/"+this.getMes()+"/"+this.getAno());
    }
}
