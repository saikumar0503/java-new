package com.iaspvt.project_s;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testIsTrue() {
        App app = new App();
        // Check that the isTrue method returns true
        assertTrue("The isTrue method should return true", app.isTrue());
    }
}
