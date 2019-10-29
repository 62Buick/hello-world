
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
        setSize(600,300);
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

        int day, month, year;
        int minute, hour;
        int isItAM;
        String aP = "PM";
        Calendar date = Calendar.getInstance();
        isItAM = date.get(Calendar.AM);
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH) + 1;
        year = date.get(Calendar.YEAR);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
        
        if (isItAM == 0){
            aP = "AM";
        }

        Font sanSerifLarge = new Font("Arial", Font.BOLD, 90);
        g.setFont(sanSerifLarge);
        g.drawString(month+"/"+day+"/"+year , 10,120);
        if (minute < 10){
            g.drawString(hour+":0"+minute+ " " +aP, 10,250);
        }else{
            g.drawString(hour+":"+minute+ " " +aP, 10,250);        
        }
    }
}
