package model.Strategy;

public class Credito extends FormaPago implements PagoStrategy{

    private String modo;
    private int mesesDiferido;

    public Credito() {
    }        
    
    public Credito(int mesesDiferido) {      
        this.modo = null;
        this.mesesDiferido = mesesDiferido;
    }

    public String getModo() {
        if(this.mesesDiferido==0){
            this.setModo("Pago Corriente");
        }else if (mesesDiferido>0){
            this.setModo("Pago Diferido");
        }else{
            this.setModo(null);
        }
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public int getMesesDiferido() {
        return mesesDiferido;
    }

    public void setMesesDiferido(int mesesDiferido) {
        this.mesesDiferido = mesesDiferido;
    }

    @Override
    public void pagar(float total) {
        System.out.println("Pagando con tarjeta de crédito...");
    }
}
