package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Logger{

    private File file;
    //string is going to be the name of the file and we instantiate it

    public Logger(String nameOfFile) {

        this.file = new File(nameOfFile);
    }

    //when someone create the logwriter class they will give us a file...aka instantiate

    // then later on in the program they can call on the method below to allow us to continuously add things.

    //1-17 lecture the last two slides for optional technique of appending
    public void writeToFile(String lineOfText) {

        PrintWriter printWriter = null;

        if (this.file.exists()) {

            //might need this for the capstone
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);// collaborator to append
                printWriter = new PrintWriter(fileOutputStream);
                printWriter.println(lineOfText);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } else {

            try {
                printWriter = new PrintWriter(this.file);
                printWriter.println("Transactions Log:"); //similar to replacement assignment?
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        printWriter.flush();
        printWriter.close();

    }

}