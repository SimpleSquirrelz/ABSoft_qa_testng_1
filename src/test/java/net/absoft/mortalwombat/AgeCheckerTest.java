package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    private AgeChecker ageChecker;

    @BeforeMethod
    public void init(){
        ageChecker = new AgeChecker();
    }

    @Test
    public void agedUserCanPlayTest(){
        Assert.assertTrue(ageChecker.canPlayGame(19),"Aged user can't play game");
    }

    @Test
    public void testThatTooYongUsersCanNotPlay(){
        Assert.assertFalse(ageChecker.canPlayGame(14),"Young user can play game");
    }

    @AfterMethod
    public void tearDown(){
        ageChecker = null;
    }
}
