/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaxStringLength;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Casey
 */
public class MainTest {
    
    public MainTest() {
    }
    
      @Test
    public void tests() {
        String[] a = {"heya", "yolo", "YOOOOO", "super long", "ez"};
        assertEquals("super long", Main.maxLength(a));

        String[] b = {"gg", "ez", "no re", "whaddup"};
        assertEquals("whaddup", Main.maxLength(b));
    }

}
