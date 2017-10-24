package com.sknn.chap0.knights;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA. Project: springinaction. Package: com.sknn.chap0.knights. User:
 * Administrator. Date: 2017-10-23 13:16. Author: Haiyangp.
 */
public class BraveKnight implements Knight {

  private Quest quest;
  public Minstrel minstrel = null;

  public void embarkOnQuest() {
    quest.embark();
  }

  public void embarkOnQuest1() {
    minstrel.singBeforeQuest();
    quest.embark();
    minstrel.singAfterQuest();
  }

  public BraveKnight(Quest quest) {
    super();
    this.quest = quest;
  }

  public BraveKnight(Quest quest, Minstrel minstrel) {
    super();
    this.quest = quest;
    this.minstrel = minstrel;
  }

  public BraveKnight() {
    super();
  }
}
