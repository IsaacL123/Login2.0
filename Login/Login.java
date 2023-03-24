
package Login;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




public class Login extends JFrame {
        private final JTextField textbox1;
        private final  JButton boton1;
        private final  JButton boton2;
        private final JPasswordField passwordfield;
        private final JLabel label1;
        private final JLabel label2;
      

        
        
    
    public Login(){
        super("Login");
        
        setLayout(new FlowLayout());
        label1 = new JLabel("Usuario");
        
        add(label1);
        textbox1 = new JTextField(25);
        add(textbox1);
         
        label2 = new JLabel("Contraseña");
        add(label2);
        passwordfield = new JPasswordField(25);
        add(passwordfield);
         
        boton1= new JButton("Registrarte");
        add(boton1);
          
        boton2 = new JButton("Iniciar Sesion");
        add(boton2);
        
        buttonHandler handler = new buttonHandler();
        boton1.addActionListener(handler);
                
        Button2Handler handler2 = new Button2Handler();
        boton2.addActionListener(handler2);
                
    }
    
   private class buttonHandler implements ActionListener{
       @Override
      public void actionPerformed(ActionEvent event){
            Registro ventana = new Registro();
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400, 300);
            ventana.setVisible(true);
      }
     
   }
            
     private class Button2Handler implements ActionListener{
        @Override
     
        public void actionPerformed(ActionEvent event){
            String strU,strP;
            
            strU = textbox1.getText();
            strP = passwordfield.getText();
            
            Archivo a = new Archivo();
            Seguridad s = new Seguridad(); 
                        
            a.leer(strU, s.encriptar(strP));
               
        }   
    }
    
    public static void main(String[] args) {
        Login ventana1 = new Login();
        
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setSize(400, 300);
        ventana1.setVisible(true);
      
    }
}
