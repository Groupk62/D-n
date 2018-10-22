package book;



import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class voice{
    VoiceManager freettsVM;
    Voice freettsVoice;

    
  
    public void sayWords(String words) {
         // Most important part!
        System.setProperty("mbrola.base", "C:/mbrola");
        freettsVM = VoiceManager.getInstance();

        // Simply change to MBROLA voice
        freettsVoice = freettsVM.getVoice("mbrola_us1");

        // Allocate your chosen voice
        freettsVoice.allocate();
       
        // Make her speak!
        freettsVoice.speak(words);
    }

   

 
   /* public void start(Stage stage) {
        try{
            sayWords(String words);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
*/