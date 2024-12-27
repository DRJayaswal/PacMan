import javax.swing.JFrame;
class App{
    public static void main(String[] args){
        int row = 21;
        int col = 19;
        int tileSize = 32;
        int boardWidth = col * tileSize;
        int boardHeight = row * tileSize;
        JFrame frame = new JFrame("Pac Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan Game = new PacMan();

        frame.add(Game);
        frame.pack();
        frame.setVisible(true);
        
    }
}