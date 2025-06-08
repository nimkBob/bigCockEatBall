package bigCockEatBall;

import javax.swing.*;
import java.awt.*;

class BackPanel extends JPanel{

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawImage(ImageAdministration.imageArrayList.get(7),0,0,null);
    }
}

public interface SenceObject {
    void Init();
    void nextFrame();
}


class HomeSence implements SenceObject {
    @Override
    public void Init() {
        // Initialize home scene
    }

    @Override
    public void nextFrame() {
        // Update home scene for the next frame
    }
}


class GameSence implements SenceObject {
    @Override
    public void Init() {
        // Initialize game scene
    }

    @Override
    public void nextFrame() {
        // Update game scene for the next frame
    }
}

