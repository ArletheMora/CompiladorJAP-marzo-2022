package compilador;

import java.util.ArrayList;
import java.util.Collections;

public class TablaSimbolos {

    public ArrayList<Identificador> ListaTokens;

    public TablaSimbolos() {
        this.ListaTokens = new ArrayList<Identificador>();
    }

    public void addToken(Identificador t) {
        if (!buscarToken(t)) {
            this.ListaTokens.add(t);
            sortTabla();
        }
    }

    public void updateToken(Identificador t) {
        if (buscarToken(t)) {
            this.ListaTokens.add(t);
            sortTabla();
        }
    }

    public void sortTabla() {
        Collections.sort(ListaTokens);
    }

    public void clear() {
        this.ListaTokens.clear();
    }

    public Boolean buscarToken(Identificador t) {
        if (this.ListaTokens.isEmpty()) {
            return false;
        }
        for (Identificador tokens : this.ListaTokens) {
            if (tokens.getLexema().equals(t.getLexema())) {
                return true;
            }
        }
        return false;
    }

    public Boolean buscarToken(String t) {
        if (this.ListaTokens.isEmpty()) {
            return false;
        }
        for (Identificador tokens : this.ListaTokens) {
            if (tokens.getLexema().equals(t)) {
                return true;
            }
        }
        return false;
    }

    public void ubicarToken(String t, String tipo) {
        if (this.ListaTokens.isEmpty()) {
            return;
        }
        for (int l = 0; l < ListaTokens.size(); l++) {
            if (ListaTokens.get(l).getLexema().equals(t)) {
                ListaTokens.get(l).setTipoDato(tipo);
            }
        }
    }

    public void ubicarToken(String t, String tipo, Object valor) {
        if (this.ListaTokens.isEmpty()) {
            return;
        }
        for (int l = 0; l < ListaTokens.size(); l++) {
            if (ListaTokens.get(l).getLexema().equals(t)) {
                ListaTokens.get(l).setTipoDato(tipo);
                ListaTokens.get(l).setValor(valor);
            }
        }
    }
    
    public void asignaValor(String t, Object valor) {
        if (this.ListaTokens.isEmpty()) {
            return;
        }
        for (int l = 0; l < ListaTokens.size(); l++) {
            if (ListaTokens.get(l).getLexema().equals(t)) {
                ListaTokens.get(l).setValor(valor);
            }
        }
    }
    /*
        Para ver si ya ha sido asignado el tipo del identificador
    */
    public String buscaTipo(String t){
        for (int i = 0; i < ListaTokens.size(); i++) {
            if (ListaTokens.get(i).getLexema().equals(t)) {
                if(ListaTokens.get(i).getTipoDato() != null){
                    return ListaTokens.get(i).getTipoDato();
                }
            }
        }
        return null;
    }

    public void ObtenDatos() {
        for (int i = 0; i < ListaTokens.size(); i++) {
            IDE.m.addRow(new Object[]{ListaTokens.get(i).getLinea(),ListaTokens.get(i).getLexema(),ListaTokens.get(i).getTipoDato(),ListaTokens.get(i).getValor()});
        }
    }

    public ArrayList<Identificador> verTablaSimbolos() {
        return this.ListaTokens;
    }

}
