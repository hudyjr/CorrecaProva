public class Teste{
    
    public static void main(String[] args) {
        
        Proprietario p1 = new Proprietario();
        p1.setNome("Hudson");
        
        Data da = new Data();
        da.setano(1889);
        da.setmes(07);
        da.setdia(23);
        
        Data r1 = new Data();
        r1.setdia(11);
        r1.setmes(4);
        r1.setano(1995);
        
        Imovel m1 = new Imovel();
        m1.setDatadaCompra(da);
        m1.setProprietario(p1);
        m1.setTipo("");
        
        p1.getmostrar();;
        m1.getinformarTipo("casa");
        m1.getmostrar();
        
}
    
}