package bigCockEatBall;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public interface FishObject {
    FishPanel fishPanel=new FishPanel();
    Image moveRight = null;
    Image moveLeft=null;
    ArrayList<Float> speed=new ArrayList<Float>();
    ArrayList<Float> position=new ArrayList<>();
    float size=0;
    void move();
    void growUp();
    void Die();
}



class FishPanel extends JPanel{
    Image image;
    boolean isHasRedPaint=false;
    boolean isVisible=false;
    float size=0;
    ArrayList<Float> position=new ArrayList<Float>();
    public void setSize(float size) {
        this.size = size;
    }

    public void setPosition(ArrayList<Float> arrayList){
        position=arrayList;
    }

    void setIsVistion(Boolean isVistion){
        this.isVisible=isVistion;
    }

    public void setImage(Image image){
        this.image=image;
    }


    @Override
    protected void printComponent(Graphics g) {
        if(isHasRedPaint) {
            g.setColor(Color.red);
        }
        this.setVisible(isVisible);

    }
}



class FishLevel_1 implements  FishObject{
    Image moveRight=ImageAdministration.imageArrayList.get(0);
    Image moveLeft=ImageAdministration.imageArrayList.get(1);

    public void Init(){
        Random   random=new Random();
    }
    @Override
    public void move() {

    }

    @Override
    public void growUp() {

    }

    @Override
    public void Die() {

    }
}


class FishLevel_2 extends FishLevel_1{
    Image moveRight=ImageAdministration.imageArrayList.get(2);
    Image moveLeft=ImageAdministration.imageArrayList.get(3);
}

class FishLevel_3 extends FishLevel_1{
    Image moveRight =ImageAdministration.imageArrayList.get(4);
    Image moveLeft = ImageAdministration.imageArrayList.get(5);
}

class FishLevel_Boss extends  FishLevel_1{//要重写 die move
    Image moveRight =ImageAdministration.imageArrayList.get(6);
}

class MyFish extends FishLevel_1{

}