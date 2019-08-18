package model.Observer;

import java.util.*;

public class NotificacionPeticion implements Subject {

    private ArrayList<PeticionPermiso> observadores = new ArrayList<>();

    public NotificacionPeticion() {
    }

    @Override
    public void attach(PeticionPermiso observador) {
        observadores.add(observador);        
    }

    @Override
    public void dettach(PeticionPermiso observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObservers() {        
        for(int i=0;i<observadores.size(); i++){
            observadores.get(i).update();
        }
    }
}
