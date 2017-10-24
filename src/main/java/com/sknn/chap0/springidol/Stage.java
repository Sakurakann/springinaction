package com.sknn.chap0.springidol;

/**
 * Created with IntelliJ IDEA.
 * Project: springinaction.
 * Package: com.sknn.chap0.springidol.
 * User: Administrator.
 * Date: 2017-10-24 13:24.
 * Author: Haiyangp.
 */
public class Stage {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private Stage() {
  }

  private static class StageSingletonHolder {

    /**
     * 延迟加载单实例.
     */
    static Stage instance = new Stage();
  }

  /**
   * 获取单实例.
   * @return single instance
   */
  public static Stage instance() {
    return StageSingletonHolder.instance;
  }
}
