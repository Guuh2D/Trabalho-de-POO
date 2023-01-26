package br.uern.di.poo.unidade1.construcao;

public class Porta {
    private TipoPorta tipodeporta;
    private double altura, largura;
    private boolean pivotante;
    private final double adicional = 350;
    private final double alturaP = 1.8;
    private final double larguraP = 0.7;



    public Porta() {
        this.tipodeporta = TipoPorta.Porta_Simples;
        this.largura = larguraP;
        this.altura = alturaP;
         pivotante = false;
    }



    public Porta(TipoPorta tipodeporta, double altura, double largura, boolean pivotante) {
        this.tipodeporta = tipodeporta;
        this.altura = altura;
        this.largura = largura;
        this.pivotante = pivotante;
    }



    public TipoPorta getTipodeporta() {
        return tipodeporta;
    }



    public void setTipodeporta(TipoPorta tipodeporta) {
        this.tipodeporta = tipodeporta;
    }



    public double getAltura() {
        return altura;
    }



    public void setAltura(double altura) {
        this.altura = altura;
    }



    public double getLargura() {
        return largura;
    }



    public void setLargura(double largura) {
        this.largura = largura;
    }



    public boolean isPivotante() {
        return pivotante;
    }



    public void setPivotante(boolean pivotante) {
        this.pivotante = pivotante;
    }



    public double getAdicional() {
        return adicional;
    }



    public double getAlturaP() {
        return alturaP;
    }



    public double getLarguraP() {
        return larguraP;
    }

    public double CalculaPreco(){
        double preco;

        if(tipodeporta == TipoPorta.Porta_Simples){
                preco = (altura * largura) * tipodeporta.getCusto();
            if(pivotante == true)
                return(preco + adicional);
            else
                return(preco);
        } if(tipodeporta == TipoPorta.Porta_Padrao){
                preco = (altura * largura) * tipodeporta.getCusto();
            if(pivotante == true)
                return(preco + adicional);
            else
                return(preco);
        } else {
            preco = (altura * largura) * tipodeporta.getCusto();
            if(pivotante == true)
                return(preco + adicional);
            else
                return(preco);
        }
    }

    public void ExibePorta() {
		System.out.println("---------------------------------");
        System.out.println(tipodeporta.getTipomadeira() + tipodeporta.getTipofechadura() + " valor R$" + tipodeporta.getCusto());
        System.out.println("Pivotante?");
        if(isPivotante()) {
			System.out.print("Sim");
		}else {
			System.out.print("Não");
		}
		System.out.println();
		System.out.print("Taxa de Serviço: ");
		
		
	}
	
}

    

