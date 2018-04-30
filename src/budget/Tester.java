/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karmi
 */
public class Tester {

    public static void main(String[] args) throws IOException {
        String fName = "Test.txt";
        File f = new File(fName);
        FileWriter fw = new FileWriter(fName);
        fw.write("Hello, how are you?");
        fw.close();
        
        Scanner s = new Scanner(f);
        String line = s.next();
        String[] words = line.split("");
        
        System.out.println(words.length);
        
        for(int i = 0;i < words.length; i++)
        {
            System.out.println(words[i]);
        }
        
    }

    public Tester() {
    }

}
