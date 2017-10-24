package com.sknn.chap0.knights;

import javax.annotation.Resource;
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
public class BraveKnightSpringTest extends BaseSpringJunitTest {

  @Resource(name = "quest")
  private Quest quest;
 /* @Autowired
  @Qualifier("knight")*/
  @Resource(name = "knight")
  private BraveKnight knight;

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
    //knight.embarkOnQuest();
    knight.embarkOnQuest();
  }

} 
