package Webtech2023.icomify;

import Webtech2023.icomify.web.m2.TerminAnfrage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TerminAnfrageTest {

    @Test
    void testToStringTest(){

        String name = "Max";
        String nummer = "01729247005";

        TerminAnfrage terminAnfrage = new TerminAnfrage(name, "Mustermann", nummer, "max@mustermann.de", "Berlin", "Montag", "Ich freu mich!");
        terminAnfrage.setId(42L);

        String expected = "TerminAnfrage{id=42, name='Max', telNummer='01729247005'}";
        String actual = terminAnfrage.toStringTest();

        assertEquals(expected, actual);
    }
}
