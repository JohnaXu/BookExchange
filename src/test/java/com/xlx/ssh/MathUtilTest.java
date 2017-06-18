package com.xlx.ssh;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* MathUtil Tester. 
* 
* @author <JohnaXu>
* @since <pre>
* @version 1.0 
*/ 
public class MathUtilTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(double x, double y) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here...
    double sum = MathUtil.add(1.0, 5.0);
    assertEquals(6, sum, 0.1);
} 


} 
