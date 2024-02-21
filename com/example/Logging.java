package com.example;

import java.util.Scanner;

/**
 * Program designed to calculate the amount of logs with a specific diameter that can be carried in
 * a truck.
 *
 * @author Spencer S.
 * @version 1.0
 * @since 2024-Feb-21
 */
public final class Logging {
  /** Stops random instantiation's from happening. */
  private Logging() {
    // Prevents instantiation.
  }

  /**
   * Main Code.
   *
   * @param args Command line arguments (not used).
   */
  public static void main(final String[] args) {
    // Constants needed later.
    final double lenQua = 0.25;
    final double lenHaf = 0.5;
    final double lenFul = 1.00;
    final int weightPrM = 20;
    final int truckMaxW = 1100;

    // Unchecked user input
    System.out.print("Hello and welcome to my logging company!");
    System.out.print("Enter the length of the logs below: ");
    final Scanner in = new Scanner(System.in);
    final String logLengthS = in.nextLine();
    // Try catch for anything other then numbers.
    try {
      // Casts from string to double.
      final Double logLen = Double.parseDouble(logLengthS);
      // Checks if it's valid number only.
      if (logLen == lenFul || logLen == lenHaf || logLen == lenQua) {
        // Calculation for 1m logs.
        if (logLen == 1.0) {
          final Double logWeight = logLen * weightPrM;
          final Integer numberLogs = (int) (truckMaxW / logWeight);
          System.out.println("You can fit: " + numberLogs + "1m logs.");
        } else {
          // Calculation for 0.5m logs.
          if (logLen == lenHaf) {
            final Double logWeight = logLen * weightPrM;
            final Integer numberLogs = (int) (truckMaxW / logWeight);
            System.out.println("You can only fit: " + numberLogs + "0.5 logs.");
          } else {
            // Calculation for 0.25m logs.
            if (logLen == lenQua) {
              final Double logWeight = logLen * weightPrM;
              final Integer numberLogs = (int) (truckMaxW / logWeight);
              System.out.println("You may fit:" + numberLogs + "0.25 logs.");
            }
          }
        }
      } else {
        // For inputs other then the accepted numbers
        System.out.println(logLen);
        System.out.println("Number must be 1.0, 0.5, and or 0.25!");
      }
      // For bad inputs.
    } catch (NumberFormatException error) {
      System.out.println("You must enter a number!");
    }
    // Closing Scanner.
    in.close();
  }
}
