import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteMakingAnagrams {

    @Test
    public void TesteMakingAnagrams1() {

        String entrada = "cde";
        String entrada2 = "abc";
        int experado = 4;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);

    }

    @Test
    public void TesteMakingAnagrams2() {

        String entrada = "fcrxzwscanmligyxyvym";
        String entrada2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int experado = 30;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);

    }

    @Test
    public void TesteMakingAnagrams3() {

        String entrada = "bugexikjevtubidpulaelsbcqlupwetzyzdvjphn";
        String entrada2 = "lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk";
        int experado = 40;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);

    }

    @Test
    public void TesteMakingAnagrams4() {

        String entrada = "fsqoiaidfaukvngpsugszsnseskicpejjvytviya";
        String entrada2 = "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget";
        int experado = 42;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);

    }

    @Test
    public void TesteMakingAnagrams5() {

        String entrada = "imkhnpqnhlvaxlmrsskbyyrhwfvgteubrelgubvdmrdmesfxkpykprunzpustowmvhupkqsyjxmnptkcilmzcinbzjwvxshubeln";
        String entrada2 = "wfnfdassvfugqjfuruwrdumdmvxpbjcxorettxmpcivurcolxmeagsdundjronoehtyaskpwumqmpgzmtdmbvsykxhblxspgnpgfzydukvizbhlwmaajuytrhxeepvmcltjmroibjsdkbqjnqjwmhsfopjvehhiuctgthrxqjaclqnyjwxxfpdueorkvaspdnywupvmy";
        int experado = 102;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);

    }

    @Test
    public void TesteMakingAnagrams6() {

        String entrada = "abcd";
        String entrada2 = "dcba";
        int experado = 0;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);

    }

    @Test
    public void TesteMakingAnagrams7() {

        String entrada = "abc";
        String entrada2 = "def";
        int experado = 6;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);
    }

    @Test
    public void TesteMakingAnagrams8() {

        String entrada = "amor";
        String entrada2 = "roma";
        int experado = 0;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);
    }

    @Test
    public void TesteMakingAnagrams9() {

        String entrada = "aab";
        String entrada2 = "bbd";
        int experado = 4;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);
    }

    @Test
    public void TesteMakingAnagrams10() {

        String entrada = "corrida";
        String entrada2 = "radar";
        int experado = 4;

        int resultado = Resultado.makingAnagrams(entrada, entrada2);

        assertEquals(experado, resultado);
    }
}
