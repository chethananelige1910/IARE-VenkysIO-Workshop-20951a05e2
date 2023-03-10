public class Reverse {

  public static void main(String[] args) {
    String sentence = "The next movement in paragraph development is an explanation of each example and its relevance to the topic sentence. The explanation should demonstrate the value of the example as evidence to support the major claim, or focus, in your paragraph.

Continue the pattern of giving examples and explaining them until all points/examples that the writer deems necessary have been made and explained. NONE of your examples should be left unexplained. You might be able to explain the relationship between the example and the topic sentence in the same sentence which introduced the example. More often, however, you will need to explain that relationship in a separate sentence."
    String reversed = reverse(sentence);
    System.out.println("The reversed sentence is: " + reversed);
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
