public class Proprietario {
    private String nome;
    private Data dataDeNascimento;
    
    public void SetNome(String nome){
        this.nome=nome;
    }
    public void SetDataDeNascimento(Data dataDeNascimento){
        this.dataDeNascimento=dataDeNascimento;
    }
    public String getNome(){
        return this.nome;
    }
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    public void mostrar(){
        System.out.println(this.getNome());
        System.out.println(this.getDataDeNascimento());
    }    
}
