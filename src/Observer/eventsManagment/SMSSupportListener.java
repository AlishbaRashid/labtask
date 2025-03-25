
package Observer.eventsManagment;

import java.io.File;
public class SMSSupportListener implements EventListener {
      private String phoneNumber;
    private static final int MAX_SMS_LENGTH = 160;
    private String defaultSms;

    public SMSSupportListener(String phoneNumber, String defaultSms) {
        this.phoneNumber = phoneNumber;
        this.defaultSms = defaultSms;
    }

    @Override
    public void update(String eventType, File file) {
        if (defaultSms.length() > MAX_SMS_LENGTH) {
            System.out.println("Warning: Default SMS length exceeds 160 characters. Please define a valid SMS.");
        } else {
            System.out.println("Sending SMS to " + phoneNumber + ": " + defaultSms);
        }
    }
}
