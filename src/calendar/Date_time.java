/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author sirisha
 */
public class Date_time {
       JLabel datetime;

    Date_time(JLabel datetime) {
        this.datetime = datetime;
    }

    
    public void run() {
        while (true) {
            try {
                Date d = new Date();
                datetime.setText(d.toString());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
