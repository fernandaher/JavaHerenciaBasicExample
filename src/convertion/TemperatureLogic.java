package convertion;

//se importan las constantes de la clase
import static constants.IntegreTemperature.NINE;
import static constants.IntegreTemperature.FIVE;
import static constants.IntegreTemperature.THIRTY_TWO;

//a la clase se le hereda los parametros de la clase Tempretature (convertion)
public class TemperatureLogic extends Temperature {

    //método
    public double TemperatureFarenheitCalculate (){
                return (this.getCelius() * NINE.getVal()/FIVE.getVal()) + THIRTY_TWO.getVal();
    }

}
