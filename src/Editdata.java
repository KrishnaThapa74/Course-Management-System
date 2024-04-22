
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;


public class Editdata {
    public void changeData(String toBeChangedText, String changingTextTo, String pathOfDataFile) throws IOException //throws IOException
    {
        Scanner inputOfUser = new Scanner(new File(pathOfDataFile));//gets the path of Data file.
        while (inputOfUser.hasNextLine()) { //looping  through the users
            new StringBuffer().append(inputOfUser.nextLine()+System.lineSeparator());
        }
        //gets the  string buffered.
        String textLine = new StringBuffer().toString();//
        textLine = textLine.replaceAll( changingTextTo,toBeChangedText); //replacing of  the  text lines to be changed.
        FileWriter editingWriter = new FileWriter(pathOfDataFile);//writing  the path of Data file.
        editingWriter.flush(); //flush of editing writer that are remaining.
        editingWriter.append(textLine); //appending of  the line to the text by editing.
        inputOfUser.close();//closing of input
    }
}
