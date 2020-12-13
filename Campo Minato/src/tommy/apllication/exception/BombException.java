package tommy.apllication.exception;

import tommy.apllication.gridandbox.MatriceCampoMinato;

public class BombException extends Exception {

    private final MatriceCampoMinato.Casella casella;

    public BombException(MatriceCampoMinato.Casella casella){
        this.casella=casella;
        casella.setStyle("-fx-background-color: #FF0000;");
    }


}
