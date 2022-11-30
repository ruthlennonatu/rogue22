package ie.atu.rogue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserNameTest {

    @Before
    public void setUp() {
        UserName sampleName = new UserName("Lydan", "Adrian", "Healy");
    }

    private UserName sampleName;
    @Test
    public void testFullNameLength() {
        int nameLength = sampleName.getFullNameLength();

        Assert.assertEquals(20, nameLength);
    }
    @Test
    public void testGetMiddleInitial(){
        String middleInitial = sampleName.getMiddleInitial();

        Assert.assertEquals("A", middleInitial);
     }

     @Test
    public void testToString(){
        String fullUsername = sampleName.toString();

        Assert.assertEquals("Lydan A. Walsh", fullUsername);
      }
}
