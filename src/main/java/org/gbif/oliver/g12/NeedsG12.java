package org.gbif.oliver.g12;

import org.gbif.oliver.subg12.SubNeedsG12;

import com.google.common.base.Stopwatch;

public class NeedsG12 {

  public void runMe() {
    Stopwatch stopwatch = new Stopwatch().start();
    SubNeedsG12 subNeedsG12 = new SubNeedsG12();
    subNeedsG12.runMe();
  }
}
