
package ConversorPacote;

import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conversor extends ConversorForm{
    private Object[] Opt = {OpcoesJOP.PRI.getOpcao(), OpcoesJOP.SEG.getOpcao(), OpcoesJOP.TER.getOpcao(), OpcoesJOP.QUA.getOpcao(), OpcoesJOP.QUI.getOpcao(), OpcoesJOP.SEXT.getOpcao()};
    Conversoes moeda = new Conversoes();
    @Override
    protected void actionOfBtnLimpar(ActionEvent ev) {
        TxtResult.setText("");
        TxtValor.setText("");
    }

    @Override
    protected void actionOfBtnConverter(ActionEvent ev) {
        String OptTipo;
        double valor = Double.parseDouble(TxtValor.getText());
        OptTipo = (JOptionPane.showInputDialog(null, "Escolha um tipo de Conversão", "Seleção de conversão", JOptionPane.PLAIN_MESSAGE, null, Opt, "Selecionar")).toString();
        switch (OptTipo) {
            case "Real para Euro":
                TxtResult.setText(String.valueOf(moeda.RealParaEuro(valor)));
                break;
            case "Real para Dolar":
                TxtResult.setText(String.valueOf(moeda.RealParaDolar(valor)));
                break;
            case "Real para Peso Argentino":
                TxtResult.setText(String.valueOf(moeda.RealParaPesoAr(valor)));
                break;
            case "Euro para Real":
                TxtResult.setText(String.valueOf(moeda.EuroParaReal(valor)));
                break;
            case "Dolar para Real":
                TxtResult.setText(String.valueOf(moeda.DolarParaReal(valor)));
                break;
            case "Peso Argentino para Real":
                TxtResult.setText(String.valueOf(moeda.PesoArParaReal(valor)));
                break;
            default:
                TxtValor.setText("Você deve escolher um tipo de conversão!");
        }
    }
    
    
    
    
}
