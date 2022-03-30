package compilador;

public class Identificador implements Comparable<Identificador> {

    private int linea;
    private String lexema;
    private String tipoDato;
    private Object valor;

    public Identificador(int linea, String lexema, String tipoDato, Object valor) {
        this.linea = linea;
        this.lexema = lexema;
        this.tipoDato = tipoDato;
        this.valor = valor;
    }

    public Identificador(int linea_declaracion, String lexema) {
        this.linea = linea_declaracion;
        this.lexema = lexema;
        this.tipoDato = null;
        this.valor = null;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Identificador o) {
        return this.getLexema().compareTo(o.getLexema());
    }

}
