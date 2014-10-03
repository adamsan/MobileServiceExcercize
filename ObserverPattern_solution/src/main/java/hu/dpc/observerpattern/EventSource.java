package hu.dpc.observerpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventSource implements Runnable {
    
    List<Observer>observerList = new CopyOnWriteArrayList<>();
    
    public boolean addObserver(Observer observer) {
        return observerList.add(observer);
    }
    
    public boolean removeObserver(Observer observer) {
        return observerList.remove(observer);
    }
    
    private void notifyObservers(String msg) {
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }
    
    @Override
    public void run() {
        try {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while (true) {
                String response = br.readLine();
                notifyObservers(response);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
