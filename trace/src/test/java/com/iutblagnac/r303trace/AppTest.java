package com.iutblagnac.r303trace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




class AppTest {

    /**
     * Test la méthode hello
     */
    @Test
    void testHello() {
        assertEquals("Hello World!", App.hello());
    }

    /**
     * Test la méthode hello avec paramètre
     */
    @Test
    void testHelloParam(){
        assertEquals("Hello Jean!", App.hello("Hello Jean!"));
    }
}