
package Login;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Registro extends JFrame{
    private final JTextField textbox1;
    private final JTextField textbox2;
    private final  JButton boton1;
    private final  JButton boton2;
    private final JLabel label1;
    private final JLabel label2;
        
        public Registro(){
          
        super("Registro");
        
        setLayout(new FlowLayout());
        label1 = new JLabel("Usuario");
        
        add(label1);
        textbox1 = new JTextField(25);
        add(textbox1);
         
        label2 = new JLabel("Contraseña");
        add(label2);
        textbox2 = new JTextField(25);
        add(textbox2);
                
        boton1= new JButton("Registrarte");
        add(boton1);
          
        boton2 = new JButton("Volver");
        add(boton2);
        
        ButtonHandler handler = new ButtonHandler();
        boton1.addActionListener(handler);
                
        
        Button2Handler handler2 = new Button2Handler();
        boton2.addActionListener(handler2);
       
        }
        
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
           String strP,strU;

           strU = textbox1.getText();
           strP = textbox2.getText();
          
           Archivo a = new Archivo();
           Seguridad s = new Seguridad();
           
            try {
                a.crear();
                a.escribir(strU, s.encriptar(strP));
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
           
          
   JOptionPane.showMessageDialog(null,"Usuario Registrado");
      }
         
    }
    private class Button2Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            
       dispose();
           
        }
    }        
        
}
    
    
 

