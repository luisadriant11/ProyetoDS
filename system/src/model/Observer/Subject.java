package model.Observer;

public interface Subject {
    
    public void attach(PeticionPermiso observador);
    public void dettach(PeticionPermiso observador);
    public void notifyObservers();
}