import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class NodoC
{
    String ruta;
    ImageIcon ima;
    String pregunta;
    String op1;
    String op2;
    String op3;
    int correcta;
    NodoC sig;
    public NodoC(String ruta, String pregunta)
    {
        this.ruta=ruta;
        this.ima=new ImageIcon(ruta);
        this.pregunta=pregunta;
        op1=op2=op3="";
        correcta=0;
        sig=null;
    }
    public NodoC(String ruta, String o1, String o2, String o3, String cor, String pre)
    {
        this.ruta=ruta;
        this.ima=new ImageIcon(ruta);
        this.pregunta=pre;
        op1=o1;
        op2=o2;
        op3=o3;
        correcta=Integer.parseInt(cor);
        sig=null;
    }
    public String toString()
    {
        return ruta+" "+pregunta+" "+op1+" "+op2+" "+op3+" "+correcta;
    }
    public int mostrarImagen()
    {
        int seleccion = JOptionPane.showOptionDialog(null,
        pregunta, 
        "Titulo",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        ima,
        new String[]{ op1,op2,op3},   // null para YES, NO y CANCEL
        op1);
        return seleccion+1;
    }
}