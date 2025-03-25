
package Observer.eventsManagment;
public class Demo {
    public static void main(String[] args) {
     Editor editor = new Editor();
        editor.events.subscribe("save", new EmailNotificationListener("sara@gmail.com"));
        editor.events.subscribe("save", new SMSSupportListener("+1234567890", "Your file has been saved successfully."));
        try {
            editor.openFile("abc.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
    }
    

