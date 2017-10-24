package com.sknn.chap0.springidol;

/**
 * Created with IntelliJ IDEA. Project: springinaction. Package: com.sknn.chap0.springidol. User:
 * Administrator. Date: 2017-10-24 13:44. Author: Haiyangp.
 */
public class Auditorium {

  private Stage stage;
  private Room room;

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public Auditorium(Stage stage) {
    super();
    this.stage = stage;
  }

  public Auditorium() {
    super();
  }

  public void turnOnLights() {
    System.out.println("Turn on the lights");
  }

  public void turnOffLights() {
    System.out.println("Turn off the lights");
  }

  /**
   * inner class
   */
  class Room {
    public Room() {
      super();
    }
  }

}
