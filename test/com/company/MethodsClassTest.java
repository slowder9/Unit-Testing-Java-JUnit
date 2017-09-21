package com.company;

import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class MethodsClassTest {
//    @Test
//    public void containsOne() throws Exception {
//        System.out.println("Running basic test");
//        assertTrue(MethodsClass.containsOne(1));
//        assertFalse(MethodsClass.containsOne(2));
//    }

    @Rule //Another annotation directed to JUnit
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testLargeNumbers () throws Exception {
        System.out.println("Testing large numbers");
        assertTrue(MethodsClass.containsOne(10000002));
        assertFalse(MethodsClass.containsOne(986974958));
    }

    @Test
    public void testMediumNumbers () throws Exception {
        System.out.println("Testing medium numbers");
        assertTrue(MethodsClass.containsOne(10));
        assertFalse(MethodsClass.containsOne(92));
    }

    @Test
    public void testNegativeNumbers () throws Exception {
        System.out.println("Testing negative numbers");
        expected.expect((IllegalArgumentException.class));
        MethodsClass.containsOne(-1);
        MethodsClass.containsOne(-20000);
    }

}