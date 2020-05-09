import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main{
    public static void main(String[] args){

        // try {
        //     File myfile = new File("test.txt");
        //     Scanner myReader = new Scanner(myfile);

        //     // ArrayList<Sprite> sprites = new ArrayList<Sprite>();

        //     while (myReader.hasNextLine()) {
        //         String line = myReader.nextLine();
        //         String[] objects = line.split(" ");
        //         String Name_s = objects[1];
        //         String frist_dimen = objects[2];
        //         double input_1 = Double.parseDouble(objects[3]);
        //         String second_dimen = objects[4];
        //         double input_2 = Double.parseDouble(objects[5]);
        //         String thrid_dimen = objects[6];
        //         double input_3 = Double.parseDouble(objects[7]);

        //         // if( frist_dimen == 'R' &&  second_dimen == null){
        //         //     sprites.add(new Circle(Name_s, input_1));
        //         // }else if( frist_dimen == 'R' && second_dimen == 'R'){
        //         //     sprites.add(new Sphere(Name_s, input_1));
        //         // }else if( frist_dimen == 'W' && second_dimen == 'H' && thrid_dimen == 'D'){
        //         //     sprites.add(new Cuboid(Name_s, input_1, input_2, input_3));
        //         // }else if( frist_dimen == 'W' && second_dimen == 'H'){
        //         //     sprites.add(new Rectangle(Name_s, input_1, input_2));
        //         // }else if( frist_dimen == 'R' && second_dimen == 'H'){
        //         //     sprites.add(new Cylinder(Name_s, input_1, input_2));
        //         // }

        //         System.out.println("" + frist_dimen);
        //     }
        //     myReader.close();
        //   } catch (FileNotFoundException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //   }

        MyFrame frame = new MyFrame("My App");
        frame.setSize(700,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        

    }

        // public static void zoomAll(ArrayList<Sprite> Sprite, double factor){
        //     for(Sprite s : sprites){
        //         if(s instanceof ZoomFactor){
        //             ZoomFactor z = (ZoomFactor)s;
        //             z.zoom(factor);
        //         }
        //     }
        // }
}
class MyFrame extends JFrame{

    private JLabel label;

    public MyFrame(String title){
        super(title);

        this.getContentPane().setLayout(new BorderLayout());

        label = new JLabel("Add Key to ZoomFactor");
        label.setFont(label.getFont().deriveFont(18.0f));
        this.add(label, BorderLayout.PAGE_START);

        JTextField textField = new JTextField();
		textField.setFont(textField.getFont().deriveFont(24.0f));
		this.add(textField, BorderLayout.PAGE_START);

        JButton button_1 = new JButton("Shape2D");
        Dimension size = button_1.getPreferredSize();
        button_1.setBounds(300, 180, size.width, size.height);
        // button_1.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.pringln("Name :" + Circle.getName() + "Area :" + Circle.getArea());
        //         System.out.pringln("Name :" + Rectangle.getName() + "Area :" + Rectangle.getArea());
        //     }
        // });

        JButton button_2 = new JButton("Shape3D");
        Dimension size_2 = button_2.getPreferredSize();
        button_2.setBounds(300, 180, size_2.width, size_2.height);
        // button_2.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.pringln("Name :" + Sphere.getName() + "Area :" + Sphere.getArea() + "Volume :" + Sphere.getVolume());
        //         System.out.pringln("Name :" + Cylinder.getName() + "Area :" + Cylinder.getArea() + "Volume :" + Cylinder.getVolume());
        //         System.out.pringln("Name :" + Cuboid.getName() + "Area :" + Cuboid.getArea() + "Volume :" + Cuboid.getVolume());
        //     }
        // });

        JButton button_3 = new JButton("All Shape");
        Dimension size_3 = button_3.getPreferredSize();
        button_3.setBounds(300, 180, size_3.width, size_3.height);
        // button_3.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.pringln("Name :" + Circle.getName() + "Area :" + Circle.getArea());
        //         System.out.pringln("Name :" + Rectangle.getName() + "Area :" + Rectangle.getArea());
        //         System.out.pringln("Name :" + Sphere.getName() + "Area :" + Sphere.getArea() + "Volume :" + Sphere.getVolume());
        //         System.out.pringln("Name :" + Cylinder.getName() + "Area :" + Cylinder.getArea() + "Volume :" + Cylinder.getVolume());
        //         System.out.pringln("Name :" + Cuboid.getName() + "Area :" + Cuboid.getArea() + "Volume :" + Cuboid.getVolume());
        //     }
        // });

        this.add(button_1, BorderLayout.LINE_START);
        this.add(button_2, BorderLayout.CENTER);
        this.add(button_3, BorderLayout.LINE_END);
        



    }
}
