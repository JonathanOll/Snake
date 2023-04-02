package Game;

import java.awt.*;

public class Case {
    public int x, y;
    private boolean hasFood;
    public Color col;
    public String direction = "null";
    public boolean isHead;

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void changeCol(Color c) {
        this.col = c;
    }

    public boolean getFood() {
        return this.hasFood;
    }

    public void changeFood(boolean t) {
        if (t) {
            this.hasFood = true;
            return;
        }
        this.hasFood = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Case) {
            if (((Case) obj).x == this.x && ((Case) obj).y == this.y) {
                return true;
            }
        }
        return false;
    }
}
