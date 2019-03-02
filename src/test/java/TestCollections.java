import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Kaylen Abrahams
 * Student Number: 216054664
 * Group: 3G
 *
 */

public class TestCollections {
    @Test
    public void canExploreList() {

        List list = new ArrayList();

        Assert.assertEquals(0, list.size());
    }

    @Test
    public void canExploreSet() {

        Set set = new HashSet();

        Assert.assertEquals(0, set.size());

    }
    @Test
    public void canExploreMap() {

        Map map = new HashMap();

        Assert.assertEquals(0, map.size());

    }




}
