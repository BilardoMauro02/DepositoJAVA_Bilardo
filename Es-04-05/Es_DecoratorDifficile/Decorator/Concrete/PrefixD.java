package Es_DecoratorDifficile.Decorator.Concrete;

import Es_DecoratorDifficile.Decorator.UserDecorator;
import Es_DecoratorDifficile.Observer.Observer;

public class PrefixD extends UserDecorator {

    private String prefix;

    public PrefixD(Observer user, String prefix) {
        super(user);
        this.prefix = prefix;
    }

    @Override
    public void update(String message) {
        String newMessage = prefix + " " + message;
        super.update(newMessage);
    }
}
