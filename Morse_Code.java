package com.kaustubhrakhade.MorseCode;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;
import android.content.Context;
import android.util.Log;

@DesignerComponent(version = 1,  description = "<b>Morse Code Extension</b><br>" + 
                   "Easily convert Text into Morse Code & Morse Code into Text with this e tension<br>Created by <b>Kaustubh Rakhade</b>",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "https://github.com/KaustubhRakhade/MorseCodeExtension/raw/main/Morse.png")
@SimpleObject(external = true)
public class Morse_Code extends AndroidNonvisibleComponent {
    private String dot = ".";
    private String dash = "-";
    private String wordSpace = "/";
    private ComponentContainer container;
    public Morse_Code(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }
  
    @DesignerProperty(editorType = "choices", defaultValue = ".", editorArgs = {".", "•"})
    @SimpleProperty(description = "Sets the character for Dot")
    public void CharForDot(String Dot) {
      dot = Dot;
    }
  
    @SimpleProperty(description = "Returns the character that is set as Dot")
    public Object CharForDot() {
      return dot;
    }
    
    @DesignerProperty(editorType = "choices", defaultValue = "-", editorArgs = {"-", "_"})
    @SimpleProperty(description = "Sets the character for Dash")
    public void CharForDash(String Dash) {
      dash = Dash;
    }
  
    @SimpleProperty(description = "Returns the character that is set as Dash")
    public Object CharForDash() {
      return dash;
    }
  
    @DesignerProperty(editorType = "choices", defaultValue = "/", editorArgs = {"/", "|", ":", ";"})
    @SimpleProperty(description = "Sets the character that will seperate words in the Morse Code")
    public void CharForWordSpace(String WordSpace) {
      wordSpace = WordSpace;
    }
  
    @SimpleProperty(description = "Returns the character that will seperate words in the Morse Code")
    public Object CharForWordSpace() {
      return wordSpace;
    }

    @SimpleFunction(description = "Convert English Text string into it's respective Morse Code string as per the set parameters")
    public Object TextToMorse(final String text) {
        String newtext = text.toUpperCase();
        newtext = newtext.replace(" ", "/ ");
        newtext = newtext.replace("A", ".- ");
        newtext = newtext.replace("B", "-... ");
        newtext = newtext.replace("C", "-.-. ");
        newtext = newtext.replace("D", "-.. ");
        newtext = newtext.replace("E", ". ");
        newtext = newtext.replace("F", "..-. ");
        newtext = newtext.replace("G", "--. ");
        newtext = newtext.replace("H", ".... ");
        newtext = newtext.replace("I", ".. ");
        newtext = newtext.replace("J", ".--- ");
        newtext = newtext.replace("K", "-.- ");
        newtext = newtext.replace("L", ".-.. ");
        newtext = newtext.replace("M", "-- ");
        newtext = newtext.replace("N", "-. ");
        newtext = newtext.replace("O", "--- ");
        newtext = newtext.replace("P", ".--. ");
        newtext = newtext.replace("Q", "--.- ");
        newtext = newtext.replace("R", ".-. ");
        newtext = newtext.replace("S", "... ");
        newtext = newtext.replace("T", "- ");
        newtext = newtext.replace("U", "..- ");
        newtext = newtext.replace("V", "...- ");
        newtext = newtext.replace("W", ".-- ");
        newtext = newtext.replace("X", "-..- ");
        newtext = newtext.replace("Y", "-.-- ");
        newtext = newtext.replace("Z", "--.. ");
        newtext = newtext.replace("1", ".---- ");
        newtext = newtext.replace("2", "..--- ");
        newtext = newtext.replace("3", "...-- ");
        newtext = newtext.replace("4", "....- ");
        newtext = newtext.replace("5", "..... ");
        newtext = newtext.replace("6", "-.... ");
        newtext = newtext.replace("7", "--... ");
        newtext = newtext.replace("8", "---.. ");
        newtext = newtext.replace("9", "----. ");
        newtext = newtext.replace("0", "----- ");
        newtext = newtext.replace("?", "..--.. ");
        newtext = newtext.replace(":", "---... ");
        newtext = newtext.replace("=", "-...- ");
        newtext = newtext.replace("'", ".----. ");
        newtext = newtext.replace("(", "-.--.- ");
        newtext = newtext.replace(")", "-.--.- ");
        newtext = newtext.replace("&", ".-... ");
        newtext = newtext.replace(";", "-.-.-. ");
        newtext = newtext.replace("$", "...-..- ");
        newtext = newtext.replace(".", dot);
        newtext = newtext.replace("-", dash);
        newtext = newtext.replace("/", wordSpace);
        return newtext.trim();
    } 
    
    @SimpleFunction(description = "Convert Morse Code string into it's respective English Text string as per the set parameters")
    public Object MorseToText(final String morseCode) {
        String newtext = " " + morseCode + " ";
        newtext = newtext.replace(dot, ".");
        newtext = newtext.replace(dash, "-");
        newtext = newtext.replace(wordSpace, "/");
        newtext = newtext.replace(" ", "  ");
        newtext = newtext.replace(" .- ", "A");
        newtext = newtext.replace(" -... ", "B");
        newtext = newtext.replace(" -.-. ", "C");
        newtext = newtext.replace(" -.. ", "D");
        newtext = newtext.replace(" . ", "E");
        newtext = newtext.replace(" ..-. ", "F");
        newtext = newtext.replace(" --. ", "G");
        newtext = newtext.replace(" .... ", "H");
        newtext = newtext.replace(" .. ", "I");
        newtext = newtext.replace(" .--- ", "J");
        newtext = newtext.replace(" -.- ", "K");
        newtext = newtext.replace(" .-.. ", "L");
        newtext = newtext.replace(" -- ", "M");
        newtext = newtext.replace(" -. ", "N");
        newtext = newtext.replace(" --- ", "O");
        newtext = newtext.replace(" .--. ", "P");
        newtext = newtext.replace(" --.- ", "Q");
        newtext = newtext.replace(" .-. ", "R");
        newtext = newtext.replace(" ... ", "S");
        newtext = newtext.replace(" - ", "T");
        newtext = newtext.replace(" ..- ", "U");
        newtext = newtext.replace(" ...- ", "V");
        newtext = newtext.replace(" .-- ", "W");
        newtext = newtext.replace(" -..- ", "X");
        newtext = newtext.replace(" -.-- ", "Y");
        newtext = newtext.replace(" --.. ", "Z");
        newtext = newtext.replace(" .---- ", "1");
        newtext = newtext.replace(" ..--- ", "2");
        newtext = newtext.replace(" ...-- ", "3");
        newtext = newtext.replace(" ....- ", "4");
        newtext = newtext.replace(" ..... ", "5");
        newtext = newtext.replace(" -.... ", "6");
        newtext = newtext.replace(" --... ", "7");
        newtext = newtext.replace(" ---.. ", "8");
        newtext = newtext.replace(" ----. ", "9");
        newtext = newtext.replace(" ----- ", "0");
        newtext = newtext.replace(" ..--.. ", "?");
        newtext = newtext.replace(" ---... ", ":");
        newtext = newtext.replace(" -...- ", "=");
        newtext = newtext.replace(" .----. ", "'");
        newtext = newtext.replace(" -.--.- ", "(");
        newtext = newtext.replace(" -.--.- ", ")");
        newtext = newtext.replace(" .-... ", "&");
        newtext = newtext.replace(" -.-.-. ", ";");
        newtext = newtext.replace(" ...-..- ", "$");
        newtext = newtext.replace(" -..-. ", "/");
        newtext = newtext.replace(" .-.-.- ", ".");
        return newtext.trim();
    }
}
