package convertion;

//cuando son más de tres atributos poner asterisco quitar static
import static constants.IntegreTemperature.CERO;
public class Temperature {
    // var declaration
    private double celius;

    //construct
    public Temperature(){
        this.celius = CERO.getVal();
    }
    //set and get
    public double getCelius(){
        return celius;
    }

    public void setCelius(double celius) {
        this.celius = celius;
    }

}
