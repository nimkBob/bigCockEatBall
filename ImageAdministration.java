package bigCockEatBall;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class ImageAdministration {
    static  ArrayList<Image> imageArrayList=new ArrayList<>();

    static void Init() throws IOException {
        String[] string=new String[]{
                "img/cock_Left.png",
                "img/cock_Right.png",
                "img/PingPong,png",
                "img/Badminton.png",
                "img/Tenins.png",
                "img/soccer.png",
                "img/basketball.png",
                "img/lanqiuchan.jpg"
        };
        File file;

        for(String str:string){
            file =new File(str);
            imageArrayList.add(ImageIO.read(file));
        }
    }
}
