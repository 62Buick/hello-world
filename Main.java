import java.util.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 

public class Main {
    
    public static void main(String[] args) {
        int lastMinute = 59;
        int thisMinute = 1;
        Calendar date = Calendar.getInstance();
        boolean keepLooping = true;
        MyWindow myWindow = new MyWindow("Clock");
        myWindow.setVisible(true);


        while (keepLooping){
            if (lastMinute != thisMinute){
//                MyWindow myWindow = new MyWindow("Clock");
//                myWindow.setVisible(true);
                myWindow.repaint();
            
            }
            
            lastMinute = thisMinute;
            date = Calendar.getInstance();
            thisMinute = date.get(Calendar.MINUTE); 
    
            
        }   
    }
}