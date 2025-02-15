package SF;

import java.util.Optional;

public enum GeoPoliticalZone {
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST(new String[]{"Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    private final String[] states;

    GeoPoliticalZone(String[] states) {
        this.states = states;
    }

    public static Optional<GeoPoliticalZone> getZoneByState(String state) {
        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            for (String s : zone.states) {
                if (s.equalsIgnoreCase(state)) {
                    return Optional.of(zone);
                }
            }
        }
        return Optional.empty();
    }
}
