package com.gru.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("score.txt"); //throws
            int data = fileReader.read();
        } catch (FileNotFoundException e){
            System.out.println("檔案讀取失敗");
        }catch(IOException e){
            System.out.println("檔案讀取失敗");
        }
        System.out.println("Testing");
    }
}
