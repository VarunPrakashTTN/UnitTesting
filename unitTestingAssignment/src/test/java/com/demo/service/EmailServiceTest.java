package com.demo.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.domain.Order;


public class EmailServiceTest {
    Order o = new Order(10, "Apple", 100);
    OrderService o1 = new OrderService();
    EmailService e1 = new EmailService();
    @BeforeClass
    public static void xyz (){

        OrderService.getInstance();
        System.out.println("Creating Instances for Test Cases ");
        System.out.println("Initializing Tests");
    }
    @Before
    public void startingtest(){
        System.out.println("Initializing Test");
    }
    @After
    public void finishingTest(){
        System.out.println("Test Completed");
    }
//    @Test(expected = RuntimeException.class)
//    public void testplaceOrder(){
//        assertTrue("", o1.placeOrder(o, "xyz@you.me"));
//        assertSame(150,o1.placeOrder(o));
//    }

    @Test
    public void testplaceordernew1() {
        assertNotNull("To check if object order is not null and storing values", o1);
    }

    @Test
    public void testplaceordernew2() {
        System.out.println("Place Order ");
    }

    @Test
    public void testsentEmail(){
        assertTrue("To check if method return true value ", e1.sendEmail(o, "xyz@you.me"));
    }

    @Test
    public void testEmail1(){
        assertTrue(e1.sendEmail(o, "xyz@you.me"));
    }

    @Test
    public void testEmailNew(){
        assertNotNull("", e1);
    }

    @Test
    public void testEmailNew1() {
        System.out.println("Sent Email ");
    }
}