import java.util.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 

public class Main {
    
    public static void main(String[] args) {
        int lastMinute = 59;
        int thisMinute = 1;
        GregorianCalendar date = new GregorianCalendar();
        boolean keepLooping = true;


        while (keepLooping){
            if (lastMinute != thisMinute){
                MyWindow myWindow = new MyWindow("Clock");
                myWindow.setVisible(true);
            
            }
            
            lastMinute = thisMinute;
            thisMinute = date.get(Calendar.MINUTE); 
            
        }   
    }
}