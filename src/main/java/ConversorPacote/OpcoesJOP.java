package ConversorPacote;

public enum OpcoesJOP {
    PRI("Real para Euro"),
    SEG("Real para Dolar"),
    TER("Real para Peso Argentino"),
    QUA("Euro para Real"),
    QUI("Dolar para Real"),
    SEXT("Peso Argentino para Real");
    
    private String Opcao;
    OpcoesJOP(String op){
        this.Opcao = op;
    }

    public String getOpcao() {
        return Opcao;
    }
    
    
}
