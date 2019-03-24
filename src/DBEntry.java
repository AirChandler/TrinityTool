import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;

public class DBEntry {
    TextField text;
    public DBEntry(StackPane root, String label, String entry, int x, int y){
        Label npcName = new Label(label);
        text = new TextField(entry);
        npcName.setPrefSize(100, 30);
        npcName.setId("label");
        text.setTranslateY(y);
        npcName.setTranslateY(y);
        text.setTranslateX(x+10);
        npcName.setTranslateX(text.getTranslateX()-npcName.getPrefWidth());
        text.setMaxWidth(200);
        root.getChildren().addAll(text, npcName);
    }

    public String getID() {
        return text.getCharacters().toString();
    }
}
