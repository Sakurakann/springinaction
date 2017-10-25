package com.sknn.chap0.springidol; 

import javax.annotation.Resource;
import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * Stages Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/25/2017</pre> 
 * @version 1.0 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springidol.xml"})
public class StagesTest { 

  @Resource(name="stages")
  private Stages stage;

  @Before
  public void before() throws Exception { 
  } 

  @After
  public void after() throws Exception { 
  } 

  @Test(timeout = 1000L)
 public void testPare() throws Exception {
   String name = stage.getStage().getName();
   System.out.println(name);
 }
  

} 
