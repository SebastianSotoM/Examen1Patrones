package test.com.devssm;

import com.devssm.Analytics;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAnalytics {

    @Test
    public void testMasLarga(){
        String [] res1 = {"casototota"};
        String [] res2 = {"casa","cosa"};

        String [] val1 = Analytics.masLarga("casa casita casototota");
        String [] val2 = Analytics.masLarga("casa,mia,cosa");

        assertEquals(res1[0], val1[0],"Should return casototota");

        assertEquals(res2[0], val2[0],"Should return casa");
        assertEquals(res2[1], val2[1],"Should return cosa");
    }

    @Test
    public void testMasCorta(){
        String [] res1 = {"casa"};
        String [] res2 = {"ala","mia"};

        String [] val1 = Analytics.masCorta("casa casita casototota");
        String [] val2 = Analytics.masCorta("casa mia cosa ala");

        assertEquals(res1[0], val1[0],"Should return casa");

        assertEquals(res2[0], val2[0],"Should return ala");

        assertEquals(res2[1], val2[1],"Should return mia");
    }

    @Test
    public void testPrimeraMasLarga(){

    }

}
