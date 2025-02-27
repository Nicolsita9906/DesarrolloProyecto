package excepciones;

public class StockBajo {
    public StockBajo(String mensaje) extends RuntimeException {
        super(mensaje);
    }
}
