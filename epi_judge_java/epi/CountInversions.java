package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTestHandler;

import java.util.List;

public class CountInversions {
  @EpiTest(testfile = "count_inversions.tsv")

  public static int countInversions(List<Integer> A) {
    // Implement this placeholder.
    return 0;
  }

  public static void main(String[] args) {
    GenericTestHandler.executeTestsByAnnotation(
        new Object() {}.getClass().getEnclosingClass(), args);
  }
}
