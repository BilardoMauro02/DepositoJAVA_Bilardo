package Es_DecoratorDifficile.Decorator.Concrete;

import java.time.format.DateTimeFormatter;

import Es_DecoratorDifficile.Decorator.UserDecorator;
import Es_DecoratorDifficile.Observer.Observer;

public class TimeStampD extends UserDecorator {

    public TimeStampD(Observer user) {
        super(user);
    }

    @Override
    public void update(String message) {
        String timeStamp = "[" + java.time.LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + "]";
        String newMessage = timeStamp + " " + message;
        super.update(newMessage);
    }
    
}
