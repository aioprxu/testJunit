

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* TestJunit Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 26, 2018</pre> 
* @version 1.0 
*/ 
public class TestJunitTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: max(int [] array) 
* 
*/ 
@Test
public void testMax() throws Exception {
    Assert.assertEquals(0,new TestJunit(new int [] {}).max());
//    Assert.assertEquals(0,new TestJunit(new int [] {-1}).max());
//    Assert.assertEquals(20,new TestJunit(new int [] {-2,11,-4,13,-5,-2}).max());
//    Assert.assertEquals(0,new TestJunit(new int [] {2,3,4,-1,2}).max());
//    Assert.assertEquals(0,new TestJunit(new int [] {2,-3,1,3,4}).max());
} 


} 
