import java.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class GameTetris {
    final String TITLE = "Tetris";
    final int BLOCK_SIZE = 25;
    final int ARC_RADIUS = 6;
    final int FIELD_WIDTH = 10;
    final int FIELD_HEIGHT = 18;
    final int START_LOCATION = 180;
    final int FIELD_DX = 7;
    final int FIELD_DY = 26;
    final int LEFT = 37;
    final int RIGHT = 39;
    final int UP = 38;
    final int DOWN = 40;
    final int SHOW_DELAY = 350;

    public static void main(String[] args) {
        new GameTetris().go();
    }
    private void go() {

    }
}
