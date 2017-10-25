package com.sknn.chap0.springidol;

import java.util.List;

/**
 * Created with IntelliJ IDEA. Project: springinaction. Package: com.sknn.chap0.springidol. User:
 * Administrator. Date: 2017-10-25 14:38. Author: Haiyangp.
 */
public class Stages {

  private List<Stage> stages;
  private Stage stage;

  public List<Stage> getStages() {
    return stages;
  }

  public void setStages(List<Stage> stages) {
    this.stages = stages;
  }

  public Stage getStage() {
    return stage;
  }

  public void setStage(Stage stage) {
    this.stage = stage;
  }

  @Override
  public String toString() {
    return "Stages{"
        + "stages=" + stages
        + ", stage=" + stage
        + '}';
  }
}
