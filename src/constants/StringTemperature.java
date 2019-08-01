package constants;

public enum StringTemperature {

    MESSAGE_CELCIUS("Write the temperature for change to Farenheit "),
    MESSAGE_FARENHEIT(" Celcius of conversion "),
    MESSAGE_CONVERTED(" (°C) to Farenheit (F)is: ");

private String message;

    StringTemperature(String m) {
        this.message = m;

    }

    public String getMessage(){
        return message;
    }
}
