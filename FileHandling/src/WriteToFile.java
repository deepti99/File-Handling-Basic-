
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("SampleFile3.txt");
      
      myWriter.write("An aircraft is a vehicle that is able to fly by gaining support from the air. "
      		+ "It counters the force of gravity by using either static lift or by using the dynamic lift of an "
      		+ "airfoil or in a few cases the downward thrust from jet engines. Common examples of aircraft "
      		+ "include airplanes, helicopters, airships (including blimps), gliders, "
      		+ "paramotors and hot air balloons.");
      
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}


