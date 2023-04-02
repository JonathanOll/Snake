package Game;

import java.util.ArrayList;

import Visual.Grid;

public class Snake {
    public Case head;
    public int snakeSize = 1;
    public ArrayList<Case> body = new ArrayList<Case>();

    public Snake() {
        head = new Case(4, 4);
        head.isHead = true;
        body.add(head);
    }

    public void inheritDir() {
        if (head.direction != "null") {
            for (int i = 0; i < body.size() - 1; i++) {
                body.get(i + 1).direction = body.get(i).direction;
            }
        }
    }

    public void moveSnake() {
        for (Case c : body) {
            switch (c.direction) {
                case "UP":
                    c.y--;
                    break;
                case "DOWN":
                    c.y++;
                    break;
                case "LEFT":
                    c.x--;
                    break;
                case "RIGHT":
                    c.x++;
                    break;
                default:
                    return;
            }
        }

    }

    public void addTile() {
        switch (body.get(body.size() - 1).direction) {
            case "UP":
                body.add(new Case(body.get(body.size() - 1).x, body.get(body.size() - 1).y + 1));
                break;
            case "LEFT":
                body.add(new Case(body.get(body.size() - 1).x + 1, body.get(body.size() - 1).y));
                break;
            case "DOWN":
                body.add(new Case(body.get(body.size() - 1).x, body.get(body.size() - 1).y - 1));
                break;
            case "RIGHT":
                body.add(new Case(body.get(body.size() - 1).x - 1, body.get(body.size() - 1).y));
                break;
        }
    }
}
