package com.sknn.chap0.knights;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/** 
 * BraveKnight Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/23/2017</pre> 
 * @version 1.0 
 */ 
public class BraveKnightTest { 

  @Before
  public void before() throws Exception { 
  } 

  @After
  public void after() throws Exception { 
  } 

 /** 
  * MethodName: embarkOnQuest() 
  */ 
  @Test
  public void testEmbarkOnQuest() throws Exception {
    Quest mockQuest = mock(Quest.class);
    Knight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();

    when(mockQuest.count()).thenReturn(1);

    assertEquals(mockQuest.count(),1);

    verify(mockQuest,times(1)).embark();
  }
  

} 
