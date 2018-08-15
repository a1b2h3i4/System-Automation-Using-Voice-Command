import com.sun.glass.events.KeyEvent;
import java.awt.Desktop;
import java.awt.Robot;
import java.io.File;
import java.io.FilenameFilter;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
 class TaskPerformer 
{
     static HashMap<String, String> rtime;
          static HashMap<String, String> robo,browser;
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
public static void PlaySong() throws Exception
{
    File f = new File("E:\\videos\\hindi songs\\video song");
File[] matchingFiles = f.listFiles(new FilenameFilter() 
{
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith("mp4");
    }
});
    int n=(int)(Math.random()*(matchingFiles.length-1));
    System.out.println(n);   
  try{ Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe "+'"'+matchingFiles[n+1].getAbsolutePath().toString()+'"');}
  catch(Exception e){System.out.println(e);}
}    
public static void Openpaint() throws Exception
{
Runtime.getRuntime().exec("C:\\Windows\\System32\\mspaint.exe");
    System.out.println();
}
public static void OpenCodeBlocks() throws Exception
{
Runtime.getRuntime().exec(path+"\\CodeBlocks\\codeblocks.exe");
}
public static void OpenFacebook() throws Exception
{
 Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
}
public static void OpenChrome()
{}
public static void ShowTime()
{
    Date d=new Date();
    System.out.println(d.getHours()+" : "+d.getMinutes()+" : "+d.getSeconds());
}
public static void OpenNetbeans()
{}
public static void OpenVLC()
{}
public static void OpenSong()
{}
public static void close()
{try{
                Robot r=new Robot();
                  r.keyPress(KeyEvent.VK_ALT);
                r.keyPress(KeyEvent.VK_F4);
                r.keyRelease(KeyEvent.VK_F4);
                r.keyRelease(KeyEvent.VK_ALT);
}catch(Exception e){}
}

}
