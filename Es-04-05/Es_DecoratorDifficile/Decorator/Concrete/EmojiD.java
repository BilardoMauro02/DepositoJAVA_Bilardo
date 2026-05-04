package Es_DecoratorDifficile.Decorator.Concrete;

import Es_DecoratorDifficile.Decorator.UserDecorator;
import Es_DecoratorDifficile.Observer.Observer;

public class EmojiD extends UserDecorator {

    private String emoji;

    public EmojiD(Observer user, String emoji) {
        super(user);
        this.emoji = emoji;
    }

    @Override
    public void update(String message) {
        String newMessage = emoji + " " + message;
        super.update(newMessage);
    }
    
}
