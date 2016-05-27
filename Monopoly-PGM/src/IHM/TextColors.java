/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

/**
 *
 * @author nourik
 */
public class TextColors {
    
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static String colorToCode(String s){
        switch(s){
            case "mauve": return PURPLE;
            case "bleuCiel" : return CYAN;
            //case "violet" : return FUCK:break;
            //case "orange" : return FUCK;break;
            case "rouge" : return RED;
            case "jaune" : return YELLOW;
            case "vert" : return GREEN;
            case "bleuFonce" : return BLUE;
            default : return BLACK;
        }
    }
    
}
