package SF;

import java.util.Optional;

public class GeoPoliticalZoneService {
    public String findGeoPoliticalZone(String state) {
        Optional<GeoPoliticalZone> zone = GeoPoliticalZone.getZoneByState(state);
        return zone.map(Enum::name).orElse("Invalid state entered.");
    }
}
