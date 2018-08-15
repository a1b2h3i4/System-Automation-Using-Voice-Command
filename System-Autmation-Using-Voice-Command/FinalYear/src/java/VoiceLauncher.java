import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;
public class VoiceLauncher 
{
    public static void main(String[] args) throws Exception
    {
        new VoiceLauncher().innn();
    }
    public void innn() throws IOException
    {     
        Configuration configuration = new Configuration();
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("project.dic");
        configuration.setLanguageModelPath("project.lm");
        LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
        recognize.startRecognition(true);
        SpeechResult result;
        String work="",out="";
        while ((result = recognize.getResult()) != null) 
        {
            String command = result.getHypothesis();
            work ="";
            Process p;
            System.out.println(command);
            if(command.equalsIgnoreCase("open file manager")) 
                work = "google-chrome http://www.google.com";
           else if (command.equalsIgnoreCase("open notepad")) 
                work = "google-chrome \\c";
             else if (command.equalsIgnoreCase("open paint"))
                work = "google-chrome gmail.com";
             else if (command.equalsIgnoreCase("play song")) 
                work = "google-chrome linkedin.com";
           else if (command.equalsIgnoreCase("open chrome")) 
                work = "google-chrome procurity.wordpress.com";
             else if (command.equalsIgnoreCase("Give me time")) 
                work = "google-chrome github.com/Ex094";
              else if (command.equalsIgnoreCase("give me date")) 
                work = "google-chrome";
             else if (command.equalsIgnoreCase("open internet edge")) 
                work = "gnome-terminal";
             else if (command.equalsIgnoreCase("How are you"))
               work = "nautilus";
             else if (command.equalsIgnoreCase("List song"))
                work = "nautilus";
             else if (command.equalsIgnoreCase("play"))
                work = "nautilus";
             else if (command.equalsIgnoreCase("pause"))
                work = "nautilus";
             else if (command.equalsIgnoreCase("close"))
                work = "nautilus";
            else if (command.equalsIgnoreCase("previous"))
                work = "nautilus";
            else if (command.equalsIgnoreCase("list Files"))
                work = "nautilus";
            else if (command.equalsIgnoreCase("open calculator"))
                work = "nautilus";
            else if (command.equalsIgnoreCase("open mail"))
                work = "nautilus";
            else if (command.equalsIgnoreCase("task manager"))
                work = "nautilus";
        }
}
}