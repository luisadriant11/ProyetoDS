package model.Strategy;

import java.util.logging.Logger;

public class Efectivo extends FormaPago implements PagoStrategy {
    
    private static final Logger logger= Logger.getLogger(Efectivo.class.getName());

    public Efectivo() {
    }

    @Override
    public void pagar(float total) {        
        logger.info("Pagando en efectivo...");
    }
}
