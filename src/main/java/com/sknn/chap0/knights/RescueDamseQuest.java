package com.sknn.chap0.knights;

/**
 * Created with IntelliJ IDEA. Project: springinaction. Package: com.sknn.chap0.knights. User:
 * Administrator. Date: 2017-10-23 13:17. Author: Haiyangp.
 */
public class RescueDamseQuest implements Quest {

  public void embark() {
    System.out.println(RescueDamseQuest.class.getSimpleName() + " :embark" + count());
  }

  public int count() {
    return 0;
  }

}
