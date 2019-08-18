package model.Strategy;

public class FormaPago {

    private PagoStrategy strategy;
    
    public FormaPago() {        
    }
    
    public void pagar(String modo, float total){
        if(modo.equals("EFECTIVO")){
            strategy = new Efectivo();
        }else if(modo.equals("CREDITO")){
            strategy = new Credito();
        }
        strategy.pagar(total);
    }
}
