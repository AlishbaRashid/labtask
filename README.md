TASK1:
The detach method in the Subject class allows an observer to be removed from
the list, ensuring it no longer receives updates when the state changes.
This method takes an observer as a parameter and removes it from the list, 
so when notifyAllObservers is called, only the remaining observers get notified
This is useful for managing observers dynamically, preventing unnecessary
updates, and allowing more control over which observers receive notifications.
In ObserverPatternDemo, after notifying all observers once, BinaryObserver 
removed, and when the state changes again, only HexaObserver and OctalObserver
receive the update, demonstrating the method's impact.. 

TASK 2:
The code follows the observer pattern, where the editor class triggers events
like "open" and "save," notifying subscribed listeners. The log listener
records file openings, the email listener sends an email when a file is saved,
and the SMS listener sends a message but warns if it exceeds 160 characters.
The demo class sets up these listeners and performs file operations while 
handling exceptions if they occur.
