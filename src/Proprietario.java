public class Proprietario {
    
    private String nome;
    private Data dataDeNascimento;

public void getmostrar(){
    System.out.println (nome);
    System.out.println (dataDeNascimento);
}

public String getNome(){
    return this.nome;
}

public Data getDatadeNascimento(){
    return this.dataDeNascimento;
}

public void setNome(String n){
    this.nome = n;
}

public void setDatadeNascimento(Data da){
    this.dataDeNascimento = da;
}

}
