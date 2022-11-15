package sources.story;

import sources.enums.Place;

public class Story {
    private final Neznaika neznaika;
    private final MayBeetle mayBeetle;
    private final Nobody nobody;

    public Story() {
        System.out.println("ИСТОРИЯ создается...");
        this.neznaika = new Neznaika();
        this.mayBeetle = new MayBeetle();
        this.nobody = new Nobody();
        System.out.println("ИСТОРИЯ готова");
    }

    public void tell() {
        System.out.println();
        System.out.println("----------");
        System.out.println();
        neznaika.getFamous(1);
        neznaika.act(Place.CITY);
        neznaika.act(Place.FIELD);
        nobody.act(Place.VOKRUG);
        mayBeetle.act(Place.FIELD);
        mayBeetle.setAbleToSee(false);
        mayBeetle.flyOver(neznaika);
        mayBeetle.flyAway();
        mayBeetle.act(Place.FAR_AWAY);
        neznaika.act(Place.GROUND);
        nobody.act(Place.KRUGOM);
    }
}
