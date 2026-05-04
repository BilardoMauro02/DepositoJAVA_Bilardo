package Es_DecoratorDifficile.Decorator;

import Es_DecoratorDifficile.Observer.Observer;

public abstract class UserDecorator implements Observer {
    protected Observer user;

    public UserDecorator(Observer user) {
        this.user = user;
    }

    @Override
    public void update(String message) {
        user.update(message);
    }

    @Override
    public String toString() {
        return user.toString();
    }
    
}
