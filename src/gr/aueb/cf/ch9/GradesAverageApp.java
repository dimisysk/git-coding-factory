package gr.aueb.cf.ch9;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * a program that takes from an existing file
 * the grades of the students
 * and returns to another file the averages
 * and also prints in a separate folder errors if exist.
 */

public class GradesAverageApp {

    public static void main(String[] args) {

        /**
         * In the main method, we call
         * the gradesAvg method and
         * logThrow method to print the
         * average grades of the students
         * in a new file and to log any
         * errors into another file.
         */
        String line = "";
        String[] grades;
        File dir = new File("C:\\Users\\syska\\temp\\project"); // The creation of the folder in the chosen path.

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\syska\\temp\\f7.txt"))) {  // BufferedReader που διαβάζει από ένα ένα αρχείο κειμένου
            if (!dir.exists()) {                      // Check if the directory exists.
                if (!dir.mkdir()) {                   //  If it doesn't exist, create it.
                    System.err.println("Error in make dir");    //  If unable to create, print an error.
                    System.exit(1);
                }
            }
            while ((line = bf.readLine()) != null) {
                grades = line.split("\\s+|,");
                File file = new File(dir + "\\primOut.txt");
                File logFile = new File(dir + "\\log.txt");
                try (PrintStream ps = new PrintStream(new FileOutputStream(file, true), true, StandardCharsets.UTF_8);
                     PrintStream ps1 = new PrintStream(new FileOutputStream(logFile, true), true, StandardCharsets.UTF_8)) {
                    gradesAvg(ps, grades);
                    ps.println();
                    logThrow(ps1,grades);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param   ps  a PrintStream variable
     * @param   tokens an array of strings
     */
    public static void gradesAvg(PrintStream ps, String[] tokens) throws NumberFormatException {
        float average = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= 1; i++) {
            ps.print(tokens[i] + " ");
        }

        for (int i = 2; i < tokens.length; i++) {
            try {
                int grade = Integer.parseInt(tokens[i]); // Using Integer.parseInt, we check if the token can be converted to an integer..
                sum += grade;
                count++;
                average = ((float) sum / count);

            } catch (NumberFormatException e) {
                e.printStackTrace();
                throw e;
            }
        }
        ps.printf("     Average:     %.1f", average);  //The output produced by our method.
    }

    /**
     * @param       ps  a PrintStream variable
     * @param       tokens  an array of strings
     */
    public static void logThrow(PrintStream ps, String[] tokens) throws NumberFormatException {
        boolean hasInvalidGrades = false;
        for (int i = 2; i < tokens.length; i++) {
            try {
                int grade = Integer.parseInt(tokens[i]);  // Using Integer.parseInt, we check if the token can be converted to an integer..
                if (grade < 0 || grade > 10) {
                    hasInvalidGrades = true;
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                throw e;
            }
        }
        if (hasInvalidGrades) {
            ps.printf("Error     Σπουδαστής: %s %s  ", tokens[0], tokens[1]);
            ps.println();
            for (int i = 2; i < tokens.length; i++) {
                try {
                    int grade = Integer.parseInt(tokens[i]);
                    if (grade < 0 || grade > 10) {
                        ps.printf("Ο βαθμός %d στο %dο μάθημα δεν είναι έγκυρος.       ", grade, i-1);
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            ps.println();
            ps.println();
        }
    }

}
