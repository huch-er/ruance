package com.mycompany.app;

import org.junit.*;

public class App2Test {
    private App2 app2;

    @Before
    public void setUp() {
        app2 = new App2();
    }

    @Test
//    @Ignore
    public void testAdd() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = app2.add(a, b);
        Assert.assertEquals(a + b, result);
    }

    @Test()
//    @Ignore
    public void testSubtract() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = app2.subtract(a, b);
        Assert.assertEquals(a - b, result);
    }

    @After
    public void tearDown() throws Exception {
    }
}