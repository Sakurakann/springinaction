package com.sknn.chap0.springidol;

import java.util.Collection;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Project: springinaction.
 * Package: com.sknn.chap0.springidol.
 * User: Administrator.
 * Date: 2017-10-24 15:28.
 * Author: Haiyangp.
 */
public class Instrumentalist {

  private Map<String, Instrument> instrumentMap;
  private Collection<Instrument> instruments;

  public Map<String, Instrument> getInstrumentMap() {
    return instrumentMap;
  }

  public void setInstrumentMap(
      Map<String, Instrument> instrumentMap) {
    this.instrumentMap = instrumentMap;
  }

  public Collection<Instrument> getInstruments() {
    return instruments;
  }

  public void setInstruments(Collection<Instrument> instruments) {
    this.instruments = instruments;
  }

  private Instrument instrument;
  private String firstName;
  private String lastName;

  public Instrument getInstrument() {
    return instrument;
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Instrumentalist{"
        + "instrument=" + instrument
        + ", firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + '}';
  }
}
