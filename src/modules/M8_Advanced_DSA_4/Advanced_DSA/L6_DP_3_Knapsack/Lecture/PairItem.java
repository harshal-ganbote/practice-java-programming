package modules.M8_Advanced_DSA_4.Advanced_DSA.L6_DP_3_Knapsack.Lecture;

public class PairItem {
  public int weight;
  public int value;
  public double ratio;

  public PairItem(int weight, int value) {
    this.weight = weight;
    this.value = value;
    this.ratio = 1.0 * value / weight;

  }
}
