public class Cola
{
    NodoC prim;
    public Cola()
    {
        prim=null;
    }
    public void encolar(NodoC c)
    {
        if(prim==null)prim=c;
        else
        {
            NodoC tmp=prim;
            while(tmp.sig!=null)
            {
                tmp=tmp.sig;
            }
            tmp.sig=c;
        }
    }
    public String toString()
    {
        String salida="Info de Cola\n";
        NodoC tmp=prim;
            while(tmp!=null)
            {
                salida+=tmp.toString()+"\n";
                tmp=tmp.sig;
            }
            return salida;
    }
}