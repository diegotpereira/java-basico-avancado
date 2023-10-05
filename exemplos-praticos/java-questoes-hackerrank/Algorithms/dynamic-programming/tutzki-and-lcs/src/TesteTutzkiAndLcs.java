import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteTutzkiAndLcs {

    @Test
    public void TesteCaso1() {

        String a = "aa";
        String b = "baaa";
        int esperado = 4;
        int resultado = Resultado.tutzkiAndLcs(a, b);

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void TesteCaso2() {

        String a = "zswcgnrhjroxzlsbkufcnarsyyntvlmefsvbmvoxahqkeasofnqsrmywytzjjamaipisgfgccelgdzbznaynnrrcmrpdwprstwtc";
        String b = "uxtmfimpzvhmarltpkzcjtdituvmtbpypwsjyqzkhiqsxetpdgwuobvijndfntzarrrrrtrtinhlqqknehbiakjnglfiudgokzymevjkttpvocifknkddffddvexvvtydazqehjqpswbpzryxthgwyjjaiigvkogjuirghctzmrhurpsfyxrlcfavesxelorgqcoqqee";
        int esperado = 513;
        int resultado = Resultado.tutzkiAndLcs(a, b);

        assertEquals(esperado, resultado);
    }
}
