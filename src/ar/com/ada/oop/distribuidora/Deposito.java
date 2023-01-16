package src.ar.com.ada.oop.distribuidora;

public interface Deposito {

    static final String CONSULTAUNO = "112234334544";
    static final String CONSULTADOS = "112234334545";
    static final String CONSULTATRES = "112234334546";
    static final String DEPOSITOA = " DEPOSITO A";
    static final String DEPOSITOB = " DEPOSITO B";
    static final String DEPOSITOC = " DEPOSITO C";
    static final String DEPOSITOD = " DEPOSITO D";
    void consultarStock();

    void guardarEnDeposito();

}
