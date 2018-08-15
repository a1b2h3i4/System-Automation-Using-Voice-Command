import java.awt.Desktop;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/First"})
public class First extends HttpServlet 
{
    static {

        System.setProperty("java.awt.headless", "false");
}
      HashMap<String, String> rtime;
     HashMap<String, String> robo,browser;
    String path="C:\\Program Files (x86)";

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
                  PrintWriter pw=response.getWriter();
           String s=request.getParameter("q");
           pw.println("<body><h1>"+s+"</h1></body>");
           new Demo().ff();
Runtime ri=Runtime.getRuntime();
boolean fa=true;        
if(s.equalsIgnoreCase("Notepad")||s.equalsIgnoreCase("Open Notepad"))
               ri.exec("C:\\Windows\\System32\\notepad.exe");
           else if(s.equalsIgnoreCase("paint")||s.equalsIgnoreCase("open paint"))
               ri.exec("mspaint.exe");
           else if(s.equalsIgnoreCase("vlc")||s.equalsIgnoreCase("open vlc"))
               ri.exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe");
                      else if(s.equalsIgnoreCase("explorer")||s.equalsIgnoreCase("open explorer"))
               ri.exec("explorer.exe");
           else if(s.equalsIgnoreCase("code blocks")||s.equalsIgnoreCase("open code blocks"))
               ri.exec("C:\\Program Files (x86)\\CodeBlocks\\codeblocks.exe");
                      else if(s.equalsIgnoreCase("Netbeans")||s.equalsIgnoreCase("open Netbeans"))
               ri.exec("C:\\Program Files\\NetBeans 8.2\\bin\\netbeans64.exe");
           else if(s.equalsIgnoreCase("chrome")||s.equalsIgnoreCase("open chrome"))
               ri.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
           else if(s.equalsIgnoreCase("google")||s.equalsIgnoreCase("open google"))
                      response.sendRedirect("https://www.google.co.in");
           else if(s.equalsIgnoreCase("facebook")||s.equalsIgnoreCase("open facebook")||s.equalsIgnoreCase("fb"))
                      response.sendRedirect("https://www.facebook.com");
                      else if(s.equalsIgnoreCase("linkedin")||s.equalsIgnoreCase("open linkedin")||s.equalsIgnoreCase("linkedin"))
                      response.sendRedirect("https://www.linkedin.com");
           else if(s.equalsIgnoreCase("facebook")||s.equalsIgnoreCase("open facebook")||s.equalsIgnoreCase("fb"))
                      response.sendRedirect("https://www.facebook.com");
           else if(s.equalsIgnoreCase("twitter")||s.equalsIgnoreCase("open twitter"))
                      response.sendRedirect("https://www.twitter.com");
           else if(s.equalsIgnoreCase("github")||s.equalsIgnoreCase("open github"))
                      response.sendRedirect("https://www.github.com");
           else if(s.equalsIgnoreCase("youtube")||s.equalsIgnoreCase("open youtube"))
                      response.sendRedirect("https://www.youtube.com");
           else if(s.equalsIgnoreCase("hello")||s.equalsIgnoreCase("How Are You")||s.equalsIgnoreCase("boring"))
           {
               TextToSpeech tts=new TextToSpeech();
                tts.setVoice("dfki-poppy-hsmm");
                tts.speak("Hello    Sir How May I help you", 0, true, true);
       }
              else if(s.equalsIgnoreCase("time")||s.equalsIgnoreCase("What is the time")||s.equalsIgnoreCase("give me time"))
           {
               TextToSpeech tts=new TextToSpeech();
                tts.setVoice("dfki-poppy-hsmm");
                Date d=new Date();
                String da=d.getDate()+"";
                String mo=d.getMonth()+"";
                String ye=d.getYear()+"";
                String hh=d.getHours()+"";
                String min=d.getMinutes()+"";
                String fo=d.getTimezoneOffset()==0?"AM":"PM";
                tts.speak("Hello    Sir  Today "+da+" slash "+mo+" slash "+ye+"  And the time is "+hh+" hour "+min+" minutes "+fo, 0, true, true);
       pw.println("Hello    Sir  Today "+da+" slash "+mo+" slash "+ye+"  And the time is "+hh+" hour "+min+" minutes "+fo);
           }
              else if(s.equalsIgnoreCase("song")||s.equalsIgnoreCase("play song")||s.equalsIgnoreCase("Play Video"))
              {
                      String sa="F:\\videos\\oldies";
              File f=new File(sa);
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
    fa=false;
              }
              else {
                  response.sendRedirect("https://www.google.co.in/search?q="+s);
              fa=false;}
if(fa) 
    response.sendRedirect("http://localhost:8080/FinalYear/index.html");
          }
   void fun(String s)
   {
       rtime.put("List Song", "song List");
       rtime.put("List Files", "Files  List");
   }
   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException 
   {

   }
}