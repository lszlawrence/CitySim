package Domain;

import org.junit.Assert;
import org.junit.Test;
import program.Visitor;

import static org.mockito.Mockito.mock;

/**
 * Created by lszlawrence on 16/10/5.
 */
public class VisitorTest {
    @Test
    public void ifVisitorOneOfFour(){
        Visitor visitor = mock(Visitor.class);
        Assert.assertEquals(visitor.vistorGenerator(2, 1), "Professor");
    }
}
