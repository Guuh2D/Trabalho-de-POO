package br.uern.di.poo.unidade1.construcao;

public class Servico {
    private static double percentual = 0.1;
	private static double instalacao = 70.00;
	private static double acrescimo = 250.00;


    public static double getPercentual() {
        return percentual;
    }
    public double getInstalacao() {
        return instalacao;
    }
    public double getAcrescimo() {
        return acrescimo;
    }


    public static double CalculaServico(Porta porta){
        double servico;
            
        if(porta.getTipodeporta() == TipoPorta.Porta_de_Luxo){
            servico = instalacao;

            servico = (porta.getAltura() * porta.getLargura()) * servico;
            if(porta.isPivotante() == true)
                servico = servico + acrescimo;

                servico = servico + (servico * (percentual/100));
              return(servico);
        }else{
            servico = instalacao;

            servico = (porta.getAltura() * porta.getLargura()) * servico;
            if(porta.isPivotante() == true)
                servico = servico + acrescimo;

            return(servico);
        }

    }
    
}
