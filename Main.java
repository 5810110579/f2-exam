import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.io.File;

import java.awt.BorderLayout;
public class Main{

    // private JTextField tf;

    // public MainFrame(){

    //     JPanel number_Panel new JPanel()




        
    }





    public static void main(String[] args){
        MyFrame frame = new MyFrame("My App");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void zoomAll(ArrayList<Sprite> Sprite, double factor){
        for(Sprite s : sprites){
            if(s instanceof ZoomFactor){
                ZoomFactor z = (ZoomFactor)s;
                z.zoom(factor);
            }
        }
    }
}
