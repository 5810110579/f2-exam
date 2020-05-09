import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main{
    public static void main(String[] args){
        try {
            File myfile = new File("test.txt");
            Scanner myReader = new Scanner(myfile);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();

              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        MyFrame frame = new MyFrame("My App");
        frame.setSize(700,400);
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

        GridLayout layout = new GridLayout(0,3);
        layout.setHgap(5);
        layout.setVgap(2);

        this.getContentPane().setLayout(layout);

        label = new JLabel("Add Key to ZoomFactor");
        label.setFont(label.getFont().deriveFont(18.0f));
        this.add(label, BorderLayout.PAGE_START);

        JButton button_1 = new JButton("Shape2D");
        button_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.pringln("Name :" + Circle.getName() + "Area :" + Circle.getArea());
                System.out.pringln("Name :" + Rectangle.getName() + "Area :" + Rectangle.getArea());
            }
        });

        JButton button_2 = new JButton("Shape3D");
        button_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.pringln("Name :" + Sphere.getName() + "Area :" + Sphere.getArea() + "Volume :" + Sphere.getVolume());
                System.out.pringln("Name :" + Cylinder.getName() + "Area :" + Cylinder.getArea() + "Volume :" + Cylinder.getVolume());
                System.out.pringln("Name :" + Cuboid.getName() + "Area :" + Cuboid.getArea() + "Volume :" + Cuboid.getVolume());
            }
        });

        JButton button_3 = new JButton("All Shape");
        button_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.pringln("Name :" + Circle.getName() + "Area :" + Circle.getArea());
                System.out.pringln("Name :" + Rectangle.getName() + "Area :" + Rectangle.getArea());
                System.out.pringln("Name :" + Sphere.getName() + "Area :" + Sphere.getArea() + "Volume :" + Sphere.getVolume());
                System.out.pringln("Name :" + Cylinder.getName() + "Area :" + Cylinder.getArea() + "Volume :" + Cylinder.getVolume());
                System.out.pringln("Name :" + Cuboid.getName() + "Area :" + Cuboid.getArea() + "Volume :" + Cuboid.getVolume());
            }
        });

        this.add(button_1);
        this.add(button_2);
        this.add(button_3);
        



    }
}
