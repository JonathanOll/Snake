package Visual;

import javax.swing.*;

public class Visual extends JFrame {
    public Grid grid;

    public Visual() {

        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialisation();
        this.addKeyListener(grid);
    }

    private void initialisation() {
        grid = new Grid();
        grid.initGrid();
        this.add(grid);
        this.pack(); // redimensionnement de la fenêtre
    }
}
