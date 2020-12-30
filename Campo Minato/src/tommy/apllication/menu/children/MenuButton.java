package tommy.apllication.menu.children;

import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class MenuButton extends StackPane {
    private Text text;
<<<<<<< HEAD

    public MenuButton(String text){
=======
    private double height;
    private double width;

    public MenuButton(String text){
        this(text, 250, 30);
    }

    public MenuButton(String text, double width, double height){
        this.width = width;
        this.height = height;

>>>>>>> 0091c6b... replaced all the files with the Tom's repo and added the Game Over menu.
        this.text = new Text(text);
        this.text.setFont(this.text.getFont().font(20));
        this.text.setFill(Color.WHITE);

<<<<<<< HEAD
        Rectangle bg = new Rectangle(250, 30);
=======
        Rectangle bg = new Rectangle(width, height);
>>>>>>> 0091c6b... replaced all the files with the Tom's repo and added the Game Over menu.
        bg.setOpacity(0.4);
        bg.setFill(Color.GREY);
        bg.setEffect(new GaussianBlur(3.5));

        setAlignment(Pos.CENTER_LEFT);
        getChildren().addAll(bg, this.text);

        setOnMouseEntered(event-> {
            bg.setFill(Color.DARKRED);
            this.text.setFill(Color.GHOSTWHITE);
        });

        setOnMouseExited(event->{
            bg.setFill(Color.GREY);
            this.text.setFill(Color.WHITE);
        });

        DropShadow ds = new DropShadow(50, Color.WHITESMOKE);
        ds.setInput(new Glow());

        setOnMousePressed(e-> setEffect(ds));
        setOnMouseReleased(e-> setEffect(null));
    }
<<<<<<< HEAD
=======

    public double getHeightMenuButton() {
        return height;
    }

    public double getWidthMenuButton() {
        return width;
    }
>>>>>>> 0091c6b... replaced all the files with the Tom's repo and added the Game Over menu.
}
