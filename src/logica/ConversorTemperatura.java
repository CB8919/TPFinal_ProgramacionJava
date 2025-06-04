package logica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class ConversorTemperatura {

    static void iniciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      JFrame ventana;
  JTextField gradosCelcius;
  JTextField gradosFarenheit;
  JLabel rotuloCelcius;
  JLabel rotuloFarenheit;
  JButton botonConvertir;
  JButton botonBorrar;

  public ConversorTemperatura() {
    

    ventana = new JFrame();
    ventana.setLayout(null); 
    ventana.setBounds(400, 250, 315, 160);
    ventana.setTitle("Convertir temperatura");
    ventana.setResizable(false);
    //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    rotuloCelcius = new JLabel("Grados Celcius:");
    rotuloCelcius.setBounds(20, 10, 100, 30);
    ventana.add(rotuloCelcius);
   
    rotuloFarenheit = new JLabel("Grados Farenheit:");
    rotuloFarenheit.setBounds(20, 40, 120, 30);
    ventana.add(rotuloFarenheit);
    
    gradosCelcius = new JTextField("");
    gradosCelcius.setBounds(130, 14, 150, 20);
    ventana.add(gradosCelcius);
   
    gradosFarenheit = new JTextField();
    gradosFarenheit.setBounds(130, 44, 150, 20);
    ventana.add(gradosFarenheit);
   
    botonBorrar = new JButton("Borrar");
    botonBorrar.setBounds(20, 80, 100, 30);
    ventana.add(botonBorrar);
    
    botonConvertir = new JButton("Convertir");
    botonConvertir.setBounds(180, 80, 100, 30);
    ventana.add(botonConvertir);
    
    botonConvertir.addActionListener((ActionListener) this);
    botonBorrar.addActionListener((ActionListener) this);
    
    ventana.setVisible(true);
  }

  public void actionPerformed(ActionEvent evento) {
    if (evento.getSource() == botonConvertir) {
      try {
        double celcius = Double.valueOf(gradosCelcius.getText());
        double farenheit = (celcius * 9 / 5) + 32;
        gradosFarenheit.setText("" + farenheit);
      }
      catch (Exception e) {
        JOptionPane.showMessageDialog(ventana, "Debe ingresar un valor numérico");
        gradosCelcius.setText("");
        gradosFarenheit.setText("");				
      }
    }
    if (evento.getSource() == botonBorrar) {
      gradosCelcius.setText("");
      gradosFarenheit.setText("");
    }
  }


 
}

