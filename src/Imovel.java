public class Imovel {
    private Proprietario proprietario;
    private Data dataCompra;
    private String tipo;
    
    public void SetProprietario(Proprietario proprietario){
       this.proprietario=proprietario;
    }
    public void SetDataCompra(Data dataCompra){
        this.dataCompra=dataCompra;
    }
    public void SetTipo(String tipo){
        this.tipo=tipo;
    }
    public Proprietario getProprietario(){
        return this.proprietario;
    }
    public Data getDataCompra(){
        return this.dataCompra;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void mostrar(){
        System.out.println(this.proprietario);
        System.out.println(this.dataCompra);
        System.out.println(this.tipo);
    }
    public boolean informarTipo(String t){
        
    }
}
