package sources.interfaces;

import sources.enums.Place;

public interface Creatureable {
    void act(Place place);
    boolean canSee();
    void watch();
}
