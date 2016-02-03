
import java.util.Scanner;
import java.util.Arrays;

/**
 * Write a description of class funalphabet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class funalphabet
{
    // instance variables - replace the example below with your own
    private Scanner word;
   
    public funalphabet()
    {
        word = new Scanner (System.in);
    }
    
    
    public void sort (String x)
    {
        x = x.toLowerCase();
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
        String alphabetized = new String(chars);
        System.out.println(alphabetized);
    }    
}
