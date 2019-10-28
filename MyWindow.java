
/**
 * This will diplay the date and time on the the screen.
 * 
 * @author (Dan Weese) 
 * @version (Update 10/26/2019)
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

 

    @Override
    public void
    paint(Graphics g){

        super.paint(g);
        boolean stopLoop = false;
        
        while (!stopLoop){
        int day, month, year;
        int minute, hour;
        String aP = "PM";
        GregorianCalendar date = new GregorianCalendar();
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
                
        Font sanSerifLarge = new Font("Arial", Font.BOLD, 30);
        g.setFont(sanSerifLarge);
        g.drawString(month+"/"+day+"/"+year , 60,60);
        g.drawString(hour+":"+minute+ " " +aP, 60,100);
        Thread.sleep(1000);
    }

    }
}
