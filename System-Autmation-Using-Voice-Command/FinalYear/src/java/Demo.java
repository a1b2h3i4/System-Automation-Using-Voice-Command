
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Demo 
{
public static void main(String[] args) throws IOException, URISyntaxException {
    String s="F:\\videos\\oldies";
    File f=new File(s);
File[] mf = f.listFiles(new FilenameFilter() 
{
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith("mp4");
    }
});
    String p[]=new String[mf.length];
    for(int i=0;i<p.length;i++){
    p[i]=mf[i].getAbsolutePath().toString();//System.out.println(p[i]);}
    }  // System.out.println(p.length);
   String pa="";
    for(int i=0;i<p.length;i++)
        pa+=p[i]+"  ";
    Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe "+pa);
}
static void ff()
{
try{
                Robot r=new Robot();
                  r.keyPress(com.sun.glass.events.KeyEvent.VK_ALT);
                r.keyPress(com.sun.glass.events.KeyEvent.VK_F4);
                r.keyRelease(com.sun.glass.events.KeyEvent.VK_F4);
                r.keyRelease(com.sun.glass.events.KeyEvent.VK_ALT);
}catch(Exception e){System.out.println(e);}}
}
