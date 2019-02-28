package test.com.devssm;

import com.devssm.Analytics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAnalytics {

    @Test
    public void testMasLarga(){
        String [] res1 = {"casototota"};
        String [] res2 = {"casa","cosa"};

        String [] val1 = Analytics.masLargaOrdenada("casa casita casototota");
        String [] val2 = Analytics.masLargaOrdenada("casa,mia,cosa");

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
        String res1 = "casototota",res2 = "cosa";

        String val1 = Analytics.primeraMasLarga("casototota casototato"),val2 = Analytics.primeraMasLarga("cosa casa");

        assertEquals(res1,val1,"Should return casototota");
        assertEquals(res2,val2,"Should return cosa");
    }

}
