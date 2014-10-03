package hu.dpc.observerpattern;

public class ObserverTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter Text >");
 
        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource();
 
        // create an observer
        final ResponseHandler responseHandler = new ResponseHandler();
 
        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler);
 
        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
        
        ResponseHandler2 handler2 = new ResponseHandler2();
        
        eventSource.addObserver(handler2);
        Thread.sleep(5000);
        System.out.println("Removing ResponseHandler2 ...");
        eventSource.removeObserver(handler2);
        
        
    }
    
}
