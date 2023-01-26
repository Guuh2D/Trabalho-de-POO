package br.uern.di.poo.unidade1.construcao;

public enum TipoPorta{
 Porta_Simples( "Feita  de madeira compensada, ", "com fechadura simples", 50),
 Porta_Padrao("Feita  de madeira andiroba, ", "com fechadura de encaixe", 140),
 Porta_de_Luxo("Feita  de madeira Ipê , ", "com fechadura do tipo tetra", 350);

 private String Tipomadeira, Tipofechadura;
 private double custo;

 
private TipoPorta(String tipomadeira, String tipofechadura, double custo) {
    Tipomadeira = tipomadeira;
    Tipofechadura = tipofechadura;
    this.custo = custo;
}


public String getTipomadeira() {
    return Tipomadeira;
}


public String getTipofechadura() {
    return Tipofechadura;
}


public double getCusto() {
    return custo;
}


}

