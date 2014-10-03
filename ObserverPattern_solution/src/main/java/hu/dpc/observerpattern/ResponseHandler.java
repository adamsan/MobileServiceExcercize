package hu.dpc.observerpattern;


public class ResponseHandler implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("Handler1: " + msg);
    }
}
