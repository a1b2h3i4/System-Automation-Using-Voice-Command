
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskRun 
{
                   static HashMap<String, String> robo,browser, rtime;
        static String path="C:\\Program Files (x86)";
        public static void main(String[] args) throws Exception 
    {
               rtime.put("paint","mspaint.exe");
       rtime.put("vlc","C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe");
       rtime.put("codeblocks", "C:\\Program Files (x86)\\CodeBlocks\\codeblocks.exe");
       browser.put("facebook","https://www.facebook.com");
       browser.put("linkedin","https://www.linkedin.com");
       rtime.put("Netbeans","C:\\Program Files\\NetBeans 8.2\\bin\\netbeans64.exe");
       browser.put("github","https://github.com");
       browser.put("twitter","https://twitter.com");
       rtime.put("fileexplorer","explorer.exe");
       rtime.put("notepad","C:\\Windows\\System32\\notepad.exe");
       rtime.put("chrome","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
       rtime.put("time","Calender");
       rtime.put("Date","Calender");
       browser.put("google","http:\\www.google.com");
       browser.put("Internet Edge", "");
       rtime.put("How Are you","Fine sir, How may I help you");
       rtime.put("List Song", "song List");
       rtime.put("List Files", "Files  List");
       robo.put("Volume Up","1");
       robo.put("Volume Down","2");
       robo.put("Brightness Up", "3");
       robo.put("Brightness Down", "4");
       robo.put("Mute", "5");
       robo.put("play","6");
       robo.put("pause","7");
       robo.put("next", "8");
       robo.put("previous","9");
       robo.put("caps lock","10");
       robo.put("exit", "11");
       
    }
        static void fun(String args) throws IOException
        {
            
                       try {
                          Desktop.getDesktop().browse(new URI("https://www.linkedin.com"));
                       } catch (URISyntaxException ex) {
                           Logger.getLogger(TaskRun.class.getName()).log(Level.SEVERE, null, ex);
                       }
        }
}
