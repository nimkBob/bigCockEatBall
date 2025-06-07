package bigCockEatBall;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class ImageAdministration {
    static  ArrayList<Image> imageArrayList=new ArrayList<>();

    static void Init() throws IOException {
        String[] string=new String[]{
                "cock_Left.png",
                "cock_Right.png",
                "PingPong,png",
                "Badminton.png",
                "Tenins.png",
                "soccer.png",
                "basketball.png",
        };
        File file;

        for(String str:string){
            file =new File(str);
            imageArrayList.add(ImageIO.read(file));
        }
    }
}
