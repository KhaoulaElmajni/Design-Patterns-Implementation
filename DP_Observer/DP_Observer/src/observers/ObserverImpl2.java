package observers;

import observable.Observable;
import observable.ObservableImpl1;
import observers.Observer;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(Observable o) {
        int nouvelEtat = ((ObservableImpl1)o).getEtat();

        System.out.println("observers.Observer 2 etat:"+nouvelEtat);
    }
}
