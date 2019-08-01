package main;

import convertion.TemperatureLogic;
import static constants.StringTemperature.*;

import javax.swing.*;

public class Main {

    //método
    public static void main(String[] args){

    //instanciar clase de la lógica (se instancia a los hijos no a los padres)

        TemperatureLogic temperatureLogic = new TemperatureLogic();

        String TemperarureVal = JOptionPane.showInputDialog(null, MESSAGE_CELCIUS.getMessage());

        //Se convierte a doble porque el su clase está como double (temperatura lógica es el objeto de la clase TemperatureLogic)

        temperatureLogic.setCelius(Double.parseDouble(TemperarureVal));

        JOptionPane.showMessageDialog(null, MESSAGE_FARENHEIT.getMessage() + temperatureLogic.getCelius() + MESSAGE_CONVERTED.getMessage() + temperatureLogic.TemperatureFarenheitCalculate() );

    }
}
