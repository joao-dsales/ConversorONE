package ConversorPacote;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class ConversorForm extends JFrame{
    protected JPanel PnlForm;
    protected JPanel PnlButton;
    //----------------------------
    protected JLabel LblValor;
    protected JTextField TxtValor;
    //----------------------------
    
    protected JLabel LblResult;
    protected JTextField TxtResult;
    
    //----------------------------
    protected JButton ConverterBtn;
    protected JButton LimparBtn;
    //----------------------------    
    
    public ConversorForm(){
        this.iniciar();
        this.eventosConversor();
    }

    private void iniciar() {
        this.setTitle("Conversor de moedas");
        this.setSize(1000, 640);
        this.getContentPane().setBackground(Color.darkGray);
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
        this.getContentPane().add(getPnlButton(), BorderLayout.PAGE_END);
        this.setResizable(false);
        this.pack();
    }
    
    protected abstract void actionOfBtnLimpar(ActionEvent ev);
    protected abstract void actionOfBtnConverter(ActionEvent ev);
    
    private void eventosConversor() {
            ConverterBtn.addActionListener(this::actionOfBtnConverter);
            LimparBtn.addActionListener(this::actionOfBtnLimpar);
        }

    public JPanel getPnlForm() {
        if(PnlForm == null){
            PnlForm = new JPanel(new GridLayout(4, 1));
            LblValor = new JLabel("Insira o valor");
            TxtValor = new JTextField(20);
            LblResult = new JLabel("Resultado da conversão");
            TxtResult = new JTextField(20);
            TxtResult.setEditable(false);
            
            
           
            PnlForm.add(LblValor);
            PnlForm.add(TxtValor);
            PnlForm.add(LblResult);
            PnlForm.add(TxtResult);
        }
        return PnlForm;
    }

    public JPanel getPnlButton() {
        if(PnlButton == null){
            PnlButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
            
            ConverterBtn = new JButton("Converter");
            LimparBtn = new JButton("Resetar");
            
            PnlButton.add(ConverterBtn);
            PnlButton.add(LimparBtn);
        } 
        return PnlButton;
    }
    
}
