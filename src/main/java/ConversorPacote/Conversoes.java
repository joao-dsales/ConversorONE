package ConversorPacote;

public class Conversoes{
    private double USD = 5.29;
    private double EURO = 5.73;
    private double PesoAr = 0.026;
    
    public double RealParaDolar(double valor){
        double conversao = valor/USD;
        return Math.round(conversao);
    }
    
    public double RealParaEuro (double valor){
        double conversao = valor/EURO;
        return Math.round(conversao);
    }
    
    public double RealParaPesoAr (double valor){
        double conversao = valor/PesoAr;
        return Math.round(conversao);
    }
    
    public double EuroParaReal (double valor){
        double conversao = valor * EURO;
        return Math.round(conversao);
    }
    
    public double DolarParaReal (double valor){
        double conversao = valor * USD;
        return Math.round(conversao);
    }
    
    public double PesoArParaReal (double valor){
        double conversao = valor * PesoAr;
        return Math.round(conversao);
    }
}
