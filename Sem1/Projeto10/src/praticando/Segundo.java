package praticando;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Segundo {
    public static void main(String[] args) {
        LocalDate datatual = LocalDate.now();

        String dataI = JOptionPane.showInputDialog("Digite uma data inicial. (DD/MM/YYYY)");
        String dataF = JOptionPane.showInputDialog("Digite uma data Final. (DD/MM/YYYY)");

        // FORMA DIFERENTE DE Fazer
//        String YYYY= dataI.substring(6,10);
//        String MM= dataI.substring(3,5);
//        String DD= dataI.substring(0,2);

//        String yyyy= dataF.substring(6,10);
//        String mm= dataF.substring(3,5);
//        String dd= dataF.substring(0,2);

//        LocalDate dataI2 = LocalDate.parse(String.format("%s-%s-%s",YYYY,MM,DD));
//        LocalDate dataF2 = LocalDate.parse(String.format("%s-%s-%s",YYYY,MM,DD));
        DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataI2 = LocalDate.parse(dataI, dtm);
        LocalDate dataF2 = LocalDate.parse(dataF, dtm);

        Period periodo = Period.between(dataI2, dataF2);

        JOptionPane.showMessageDialog(null,String.format("Data Inicial: %s\n Data Final: %s\nEntre as datas fornecidas existem %d ano(s), %d mês(es) e %d dia(s) de diferdença", dataI,dataF,periodo.getYears(),periodo.getMonths(),periodo.getDays()));



    }
}
