package br.com.ifsp.relogio;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AtualizadorHorario 
{
    public static void start(final JLabel textFieldHorario)
    {
        Thread atualizaHora = new Thread(new Runnable() 
        {
            @Override
            public void run() 
            {
                try 
                {
                    while (true) 
                    {
                        Date date = new Date();
                        StringBuffer data = new StringBuffer();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
                        textFieldHorario.setText(data.toString() + sdf.format(date));
                        Thread.sleep(1000);
                        textFieldHorario.revalidate();
                    }
                } 
                catch (InterruptedException ex) 
                {
                    ex.printStackTrace();
                }
            }
        });
        atualizaHora.start();
    }
}