/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.Menu;
import View.StringView;
import Model.Algorithm;
import Model.inString;
import java.util.Scanner;
/**
 *
 * @author thaip
 */
public class Main extends Menu<String>{
    private static String[] mc={"Count Letter", "Count Word","Exit"};
    Algorithm tt = new Algorithm();
    Scanner sc = new Scanner(System.in);
    public Main() {
        super("Lab 2",mc);
        
    }
    
    public static void main(String[] args) {
        
        new Main().run();
    }
    
    @Override
    public void execute(int ch) {
        switch(ch) {
            case 1: countLetter();break;
            case 2: countWord(); break;
            case 3 : System.out.println("Exit programming!");
                System.exit(0);
        }
    }
        public void countLetter(){
            String str = Menu.getString("Enter your content : ");
            System.out.println(tt.rsLetter(str));
        }
        public void countWord(){
            String str = Menu.getString("Enter your content : ");
            System.out.println(tt.rsWord(str));
        }
    }
