/* Name: Michael Zbrozek
* Class: 1152:101
* Assignment: Semester project
* Purpose: Open a text file and
* perform some action on it. 
*/
/*
* --- Files associated with this
* assignment
* java_test.txt, east.txt, t.txt
*/

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Project_MZbrozek {
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Retrieves the file from command line
        System.out.println("Enter the file name or path:");
        String filePath = input.nextLine();

        // Read path, check to see if file exists
        Path path = Paths.get(filePath);
        boolean exists = Files.exists(path);

        if (exists) {
            processFile(path);
        } else {
            System.out.println("Cannot access this file, please check the path and try again!");
        }
        input.close();

        // if exists call the processFile method

    }

    /*
     * processFile method
     * 1. read contents of file X
     * 2. Print total # of words X
     * 2.5 Add each word to ArrayList X
     * 3. Print total # of UNIQUE words(case sensitive) in the file and call the X
     * createUniqueList method
     * 4. Print all words in ascending order without dups. Call sortList method
     * 5. call the search method
     */
    public static void processFile(Path path) {
        System.out.println("Running processFile method...");
        Scanner fileIn = null;
        int wordCount = 0;
        List<String> fileContent = new ArrayList<String>();

        // read contents of file
        try {
            fileIn = new Scanner(path);
        } catch (java.io.IOException e) {
            System.out.println("Input Output Exception");
            System.exit(2);
        }

        try {
            while (fileIn.hasNext()) {
                String text;
                text = fileIn.next();
                // System.out.print(text + " ");

                // Add each word to ArrayList
                fileContent.add(text);
                wordCount += 1;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input does not match");
            System.exit(3);
        }

        // Print total # of words
        System.out.println("\nTotal Number of Words in file = " + wordCount);
        // System.out.println(fileContent);
        fileIn.close();
        // Print total # of UNIQUE words
        ArrayList<String> uniqueList = createUniqueList(fileContent);

        // Sort the words in descending order and print
        sortList(uniqueList);
        search(path);

    }

    /*
     * createUniqueList method
     * Takes the full list of words
     * create a new array list by
     * adding only unique values
     * to the list
     */
    public static ArrayList<String> createUniqueList(List<String> fileContent) {
        int uniqueCount = 0;
        ArrayList<String> uniqueWords = new ArrayList<String>();
        Set<String> uniqueSet = new HashSet<>(fileContent);
        for (String string : uniqueSet) {
            string = string.replaceAll("[^a-zA-Z]", "");
            string = string.replaceAll("\\s", "");
            if (!(string.equals("") || string.equals(null))) {
                uniqueWords.add(string);
                uniqueCount += 1;
            }
        }
        System.out.println("Total number of UNIQUE words in file: " + uniqueCount);
        return uniqueWords;
    }

    /*
     * sortList method
     * Implement a sort algorithm (not a built in java method) to modify the
     * unsorted list into a sorted list.
     */
    public static ArrayList<String> sortList(ArrayList<String> uniqueList) {
        System.out.println("Sorted List");
        // https://javarevisited.blogspot.com/2023/09/how-to-sort-arraylist-in-java-without.html#:~:text=You%20can%20use%20any%20sorting,()%20method%20from%20Collection%20API.
        int size = uniqueList.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < size; i++) {
                if (uniqueList.get(i - 1).compareToIgnoreCase(uniqueList.get(i)) > 0) {
                    // Swap the elements
                    String placeHolder = uniqueList.get(i - 1);
                    uniqueList.set(i - 1, uniqueList.get(i));
                    uniqueList.set(i, placeHolder);
                    swapped = true;
                }
            }
        } while (swapped);
        for (String i : uniqueList) {
            System.out.println(i);
        }
        return uniqueList;
    }

    public static void search(Path path) {
        Scanner fileIn = null;
        int lineCount = 0;
        // https://www.geeksforgeeks.org/multidimensional-collections-in-java/
        ArrayList<ArrayList<String>> fileContentByLine = new ArrayList<ArrayList<String>>();

        // read contents of file
        try {
            fileIn = new Scanner(path);
        } catch (java.io.IOException e) {
            System.out.println("Input Output Exception");
            System.exit(2);
        }

        try {
            while (fileIn.hasNextLine()) {
                String text;
                text = fileIn.nextLine();
                // System.out.println(text + " ");

                // Add each word to Nested ArrayList
                fileContentByLine.add(new ArrayList<String>(Arrays.asList(text)));
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input does not match");
            System.exit(3);
        }

        // Do/While - keep searching while searchAgain = true
        boolean searchAgain;
        do {
            searchAgain = true;
            String searchST = searchString();
            if (searchST.equalsIgnoreCase("EInput")) {
                searchAgain = false;
            } else {
                // Loop through nested ArrayLists to find matches for 'searchST'
                for (ArrayList<String> arrayList : fileContentByLine) {
                    for (String item : arrayList) {
                        lineCount += 1;
                        String[] marker = new String[item.length()];
                        if (item.contains(searchST)) {
                            System.out.println("\nLine Number " + lineCount + ".");
                            System.out.println(item);
                            marker[item.indexOf(searchST)] = "^";
                            for (String i : marker) {
                                if (i == null) {
                                    i = "";
                                }
                                System.out.print(i + " ");
                            }

                        }
                    }
                }
            }
        } while (searchAgain);
        System.out.println("Thank you for using this program. (C)opyright - Mike Zbrozek: 2023");
    }

    public static String searchString() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a SEARCH pattern or 'EInput' to Quit: ");
        String searchSt = input.next();
        // input.close();
        return searchSt;
    }

}
