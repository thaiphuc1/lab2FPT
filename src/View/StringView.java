/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author thaip
 */
public class StringView {
    public void viewResult(int[] count){
        for (int i = 0; i < count.length; i++) {
            if(count[i] > 0)
                System.out.println((char)i + "=" + count[i]);
        }
    }
}
