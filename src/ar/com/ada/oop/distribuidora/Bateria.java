package src.ar.com.ada.oop.distribuidora;


public class Bateria extends Articulo implements Deposito {
    private byte volts;
    private int amps;

    public Bateria(String expo45, String s, String bateria_, String expoyer, int i, int i1) {
    }

    public Bateria(String originalCode, String code, String description, String proveedor, byte volts, int amps, int cant) {
        super(originalCode, code, description, proveedor, cant);
        this.volts = volts;
        this.amps = amps;
    }

    public byte getVolts() {
        return this.volts;
    }

    public void setVolts(byte volts) {
        this.volts = volts;
    }

    public int getAmps() {
        return this.amps;
    }

    public void setAmps(int amps) {
        this.amps = amps;
    }

    public String toString() {
        String var10000 = this.getOriginalCode();
        return "Bateria:  Codigo Original: " + var10000 + " Codigo: " + this.getCode() + " Descripción: " + this.getDescription() + " Proveedor: " + this.getproved() + ", volts: " + this.volts + ", amps: " + this.amps;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Bateria)) {
            return false;
        } else {
            Bateria bateria = (Bateria)o;
            return this.getOriginalCode().equals(bateria.getOriginalCode());
        }
    }

    @Override
    public void guardarEnDeposito() {
        System.out.println("La mercaderia se debe guardar en el" + DEPOSITOD);
    }

    @Override
    public void  consultarStock(){
        System.out.println("Las Consulta de stock se debe hacer al:" + CONSULTAUNO);
    }
}

