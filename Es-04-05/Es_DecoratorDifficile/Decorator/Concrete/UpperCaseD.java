package Es_DecoratorDifficile.Decorator.Concrete;

import Es_DecoratorDifficile.Decorator.UserDecorator;
import Es_DecoratorDifficile.Observer.Observer;

public class UpperCaseD extends UserDecorator {

    public UpperCaseD(Observer user) {
        super(user);
    }

    @Override
    public void update(String message) {
        String newMessage = message.toUpperCase();
        super.update(newMessage);
    }
    
}
