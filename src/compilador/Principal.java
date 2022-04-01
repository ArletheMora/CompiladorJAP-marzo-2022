package compilador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

//    public static void main(String[] args) throws Exception {
//        String ruta1 = "C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/src/compilador/Lexer.flex";
//        String ruta2 = "C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/src/compilador/LexerCup.flex";
//        String[] rutaS = {"-parser", "Sintax",
//            "C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/src/compilador/Sintax.cup"};
//        generar(ruta1, ruta2, rutaS);
//    }
    public static void main(String[] args) throws Exception {
        String ruta1 = "D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/Lexer.flex";
        String ruta2 = "D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax",
            "D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }

    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo;

        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);

        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);

        java_cup.Main.main(rutaS);

        //Path rutaSym = Paths.get("C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/src/compilador/sym.java");
        Path rutaSym = Paths.get("D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
//                Paths.get("C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/sym.java"),
//                Paths.get("C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/src/compilador/sym.java")
                Paths.get("D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/sym.java"),
                Paths.get("D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/sym.java")
        );
//        Path rutaSin = Path rutaSin = Paths.get("C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/src/compilador/Sintax.java");
        Path rutaSin = Paths.get("D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
//                Paths.get("C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/Sintax.java"),
//                Paths.get("C:/Users/Juan Pablo/OneDrive/Documentos/8vo_Semestre/Autómatas II/CompiladorJAP_2022/src/compilador/Sintax.java")
                Paths.get("D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/Sintax.java"),
                Paths.get("D:/Principales/Documentos/ITTEPIC/8 Octavo/Autómatas II/Compilador 2/CompiladorJAP-marzo-2022/src/compilador/Sintax.java")
        );

    }

}
