
import java.awt.Dimension;
import Visual.Visual;

public class Main {
    public static void main(String args[]) {
        Visual v = new Visual();
        v.setPreferredSize(new Dimension(v.grid.size * v.grid.tileSize, v.grid.size * v.grid.tileSize));
        v.setVisible(true);
    }
}
