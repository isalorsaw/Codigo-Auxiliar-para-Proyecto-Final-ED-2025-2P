import javax.swing.JOptionPane;
public class Test
{
    static Cola c=new Cola();
    public static void main(String args[])
    {
        //llenarCola();
        llenarColaDesdeArch();
        String salida=c.toString();
        mostrarMensaje(salida);
        mostrarImagenXImagen();
    }
    public static void mostrarImagenXImagen()
    {
        NodoC tmp=c.prim;
        while(tmp!=null)
        {
            int usuario=tmp.mostrarImagen();
            tmp=tmp.sig;
        }
    }
    public static void llenarColaDesdeArch()
    {
        //String salida="";
        Archivo arc=new Archivo("archivos/informacion.txt");
        String lineas[]=arc.traerLineas();
        for(int i=0;i<lineas.length;i++)
        {
            String s[]=lineas[i].split(";");
            String ruta="Imagenes/"+s[0]+".png";
            c.encolar(new NodoC(ruta,s[1],s[2],s[3],s[4],s[5]));
            //salida+=lineas[i]+"\n";
            //String ruta="Imagenes/"+i+".png";
            //c.encolar(new NodoC(ruta,"La Pregunta"));
        }
        //mostrarMensaje(salida);
    }
    public static void llenarCola()
    {
        for(int i=1;i<=6;i++)
        {
            String ruta="Imagenes/"+i+".png";
            c.encolar(new NodoC(ruta,"La Pregunta"));
        }
    }
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
}