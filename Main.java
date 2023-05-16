import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main{
    
    public static void main(String[] args) throws IOException{
        LaunchPage("Assets/Start.png");

        
    }

    public static void LaunchPage( String file ) throws IOException {
        

            
            //setting up variables
            JFrame frame  = new JFrame();
            JLabel label = new JLabel(new ImageIcon(file));
            JButton Tab1 = new JButton("how they started");
            JButton Tab2 = new JButton("Computers look similar");
            JButton Tab3 = new JButton("Computers today");
            
            //getting rid of old pages
            frame.dispose();

            //label settings
            label.setSize(10,10);

            //button settings
            Tab1.setSize(700, 50);
            Tab2.setSize(700, 50);
            Tab3.setSize(700, 50);
            Tab1.setBounds(0, 100, 720, 50);
            Tab2.setBounds(0, 150, 720, 50);
            Tab3.setBounds(0, 200, 720, 50);

             //How the page looks
            frame.setTitle("History");
            frame.add(label);
            frame.add(Tab1);
            frame.add(Tab2);
            frame.add(Tab3);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1020, 1220);
            frame.setLayout(new FlowLayout());
            frame.setVisible(true);



            //button click
            Tab1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {
                   try {
                    LaunchPage("Assets/page1.png");
                    frame.dispose();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                }
                
            });

            Tab2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {
                   try {
                    LaunchPage("Assets/page2.png");
                    frame.dispose();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                }
                
            });

            Tab3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {
                   
                    try {
                        LaunchPage("Assets/page3.png");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    frame.dispose();
                
                }
                
            });


        }

        
    }



