package Domain;

import org.junit.Test;
import org.junit.Assert;
import program.Location;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by lszlawrence on 16/10/5.
 */
public class LocationTest {
    @Test
    public void ifLocationsOneOfFour(){
        Location mockLocation = mock(Location.class);

        Assert.assertEquals("The Point", mockLocation.locationGenerator(2, 1));
    }
}
