package pl.mirekgab.test_backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyServiceTest {

    @Test
    void sum() {
        MyService myService = new MyService();
        assertEquals(5, myService.sum(2,3));
    }
}