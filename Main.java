import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main{
    public static void main(String[] args){
        // try {
        //     File myfile = new File("test.txt");
        //     Scanner myReader = new Scanner(myfile);
        //     while (myReader.hasNextLine()) {
        //       String data = myReader.nextLine();

        //       System.out.println(data);
        //     }
        //     myReader.close();
        //   } catch (FileNotFoundException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //   }

        MyFrame frame = new MyFrame("My App");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        

    }

    /*public static void zoomAll(ArrayList<Sprite> Sprite, double factor){
        for(Sprite s : sprites){
            if(s instanceof ZoomFactor){
                ZoomFactor z = (ZoomFactor)s;
                z.zoom(factor);
            }
        }
    }*/
}
class MyFrame extends JFrame{
    private JLabel label;

    public MyFrame(String title){
        super(title);

        this.getContentPane().setLayout(new BorderLayout());

        JButton button_1 = new JButton("Shape2D");
        JButton button_2 = new JButton("Shape3D");
        JButton button_3 = new JButton("All Shape");

        // button_1.addActionListener(new ActionListener(){
        
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
                
        //     }
        // })

        this.add(button_1, BorderLayout.LINE_START);
        this.add(button_2, BorderLayout.CENTER);
        this.add(button_3, BorderLayout.LINE_END);
    }
}
