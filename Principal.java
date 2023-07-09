import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int ValInfo, ValLimp, ValPap, ValRef, ValAlug, ValAgua, ValLuz;
        double PercInfo, PercLimp, PercPap, PercRef, PercAlug, PercAgua, PercLuz, tot;
        DecimalFormat df = new DecimalFormat("##.##");
        String mens;

        ValInfo = Integer.parseInt
                (JOptionPane.showInputDialog("Valor gasto com materiais de informática:"));
        
        ValLimp = Integer.parseInt
                (JOptionPane.showInputDialog("Valor gasto com materiais de limpeza:"));
        
        ValPap = Integer.parseInt
                (JOptionPane.showInputDialog("Valor gasto com materiais de papelaria:"));
        
        ValRef = Integer.parseInt
                (JOptionPane.showInputDialog("Valor gasto com refeições:"));
        
        ValAlug = Integer.parseInt
                (JOptionPane.showInputDialog("Valor do aluguel:"));
        
        ValAgua = Integer.parseInt
                (JOptionPane.showInputDialog("Valor gasto com água:"));
        
        ValLuz = Integer.parseInt
                (JOptionPane.showInputDialog("Valor gasto com energia:"));
                
        tot = ValInfo+ValLimp+ValPap+ValRef+ValAlug+ValAgua+ValLuz;       
        PercInfo = ValInfo*100/tot;
        PercLimp = ValLimp*100/tot;
        PercPap = ValPap*100/tot;
        PercRef = ValRef*100/tot;
        PercAlug = ValAlug*100/tot;
        PercAgua = ValAgua*100/tot;
        PercLuz = ValLuz*100/tot;

        mens="Total de gastos mensais: "+tot+
                "\nSegmentos           Gastos mensais                  Percentual"
                +"\nInformática:        "+ValInfo+"                   "+df.format(PercInfo)+"%"
                +"\nLimpeza:            "+ValLimp+"                   "+df.format(PercLimp)+"%"
                +"\nPapelaria:          "+ValPap+"                    "+df.format(PercPap)+"%"
                +"\nRefeição:           "+ValRef+"                    "+df.format(PercRef)+"%"
                +"\nAluguel:            "+ValAlug+"                   "+df.format(PercAlug)+"%"
                +"\nÁgua:               "+ValAgua+"                   "+df.format(PercAgua)+"%"
                +"\nLuz:                "+ValLuz+"                    "+df.format(PercLuz)+"%";
                JOptionPane.showMessageDialog(null,mens);    
    }
    
}