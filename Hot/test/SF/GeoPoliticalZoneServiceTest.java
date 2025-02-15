package SF;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneServiceTest {
    private final GeoPoliticalZoneService service = new GeoPoliticalZoneService();

    @Test
    public void TestThatThe_Stae_Entered_IsValid(){
        assertEquals("SOUTH_WEST", service.findGeoPoliticalZone("Lagos"));
        assertEquals("NORTH_EAST", service.findGeoPoliticalZone("Borno"));
    }
    @Test
    public void TestThatThe_State_Entered_IsInValid(){
        assertEquals("Invalid state entered.", service.findGeoPoliticalZone("ogolonto"));
        assertEquals("Invalid state entered.", service.findGeoPoliticalZone("abuja"));

    }
    @Test
    public void TestForCAseSensitive(){
        assertEquals("SOUTH_EAST", service.findGeoPoliticalZone("abia"));
        assertEquals("NORTH_CENTRAL", service.findGeoPoliticalZone("KOGI"));

    }
}
