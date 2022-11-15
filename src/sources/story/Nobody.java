package sources.story;

import sources.abstracts.AbstractHuman;
import sources.enums.Place;
import sources.interfaces.Creatureable;

public class Nobody extends AbstractHuman implements Creatureable {

    public Nobody() {
        super("Никто");
        System.out.println("Объект НИКТО создан");
    }

    @Override
    public void act(Place place) {
        switch (place) {
            case VOKRUG -> System.out.println("Вокруг не было ни души. ");
            case KRUGOM -> System.out.println("Но кругом никого не было. ");
            default -> System.out.println("Действие НИКОГО для МЕСТА " + place.name() + " не определено");
        }
    }

    @Override
    public boolean canSee() {
        return true;
    }

    @Override
    public void watch() {

    }
}
