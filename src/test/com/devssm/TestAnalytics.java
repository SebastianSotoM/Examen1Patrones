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

        assertEquals(true, Arrays.equals(res1,val1),"Should return {casototota}");
        assertEquals(true,Arrays.equals(res2,val2),"Should return {casa,cosa}");
    }

    @Test
    public void testMasCorta(){
        String [] res1 = {"casa"};
        String [] res2 = {"mia","ala"};

        String [] val1 = Analytics.masLarga("casa casita casototota");
        String [] val2 = Analytics.masLarga("casa mia cosa ala");

        assertEquals(true, Arrays.equals(res1,val1),"Should return {casa}");
        assertEquals(true,Arrays.equals(res2,val2),"Should return {mia,ala}");
    }

    @Test
    public void testOrdenAlfabetico(){

    }

    @Test
    public void testPrimeraMasLarga(){

    }

}
