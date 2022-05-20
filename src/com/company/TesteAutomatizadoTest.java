package com.company;

import org.junit.jupiter.api.Test;

public class TesteAutomatizadoTest {


    @Test
    void somar() {
        TesteAutomatizado calc = new TesteAutomatizado();
        int soma = calc.somar(3, 7);

    }
}
