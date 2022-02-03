package day21;

import java.io.IOException;
import java.util.logging.Logger;

public class ExceptionPractice {

    public static void main(String[] args) {

        MyImage myImage = new MyImage();

//        try {
//
//        }catch (IOException e){
//            e.printStackTrace();
//            Logger.getGlobal().info(e.getMessage());
//        }


        try{
            myImage.getImageURL();
//            myImage.downloadImage("http://facebook.com/123451.png");
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            Logger.getGlobal().info(e.getMessage());
        }finally {
            Logger.getGlobal().info("Finally Called");
        }
    }
}