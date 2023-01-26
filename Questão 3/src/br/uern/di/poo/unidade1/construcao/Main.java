package br.uern.di.poo.unidade1.construcao;

public class Main {

    public static void main(String [] args) {
    Porta porta1 = new Porta(TipoPorta.Porta_Padrao, 2, 1.8, true);
    Porta porta2 = new Porta(TipoPorta.Porta_Simples, 1.8, 1.5, false);
    Porta porta3 = new Porta(TipoPorta.Porta_de_Luxo, 1.3, 1, true);
    Porta porta4 = new Porta(TipoPorta.Porta_de_Luxo, 1.5, 1.2, false);


    porta1.ExibePorta();
    System.out.println("Valor do Serviço: " + Servico.CalculaServico(porta1));

    porta2.ExibePorta();
    System.out.println("Valor do Serviço: " + Servico.CalculaServico(porta2));

    porta3.ExibePorta();
    System.out.println("Valor do Serviço: " + Servico.CalculaServico(porta3));

    porta4.ExibePorta();
    System.out.println("Valor do Serviço: " + Servico.CalculaServico(porta4));

    }
}
