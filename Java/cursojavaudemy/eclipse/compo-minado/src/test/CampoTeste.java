//package test;
//
//import br.com.rodGames.campoMinados.model.Campo;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class CampoTeste {
//    Campo campo = new Campo(0,0);
//
//    @Test
//    void ResultadoEsquerdaSuperior(){
//        boolean resultadoES =
//                campo.isVizinho(new Campo(campo.getX()-1,campo.getY()-1));
//        Assertions.assertTrue(resultadoES);
//    }
//
//    @Test
//    void ResultadoEsquerdaMeio(){
//        boolean resultadoEM =
//                campo.isVizinho(new Campo(campo.getX(),campo.getY()-1));
//        Assertions.assertTrue(resultadoEM);
//    }
//
//    @Test
//    void ResultadoEsquerdaInferior(){
//        boolean resultadoEI =
//                campo.isVizinho(new Campo(campo.getX(),campo.getY()-1));
//        Assertions.assertTrue(resultadoEI);
//    }
//
//    @Test
//    void ResultadoMeioSuperior(){
//        boolean resultadoES =
//                campo.isVizinho(new Campo(campo.getX()-1,campo.getY()));
//        Assertions.assertTrue(resultadoES);
//    }
//
//    @Test
//    void ResultadoMeio(){
//        boolean resultadoMS =
//                campo.isVizinho(new Campo(campo.getX(),campo.getY()));
//        Assertions.assertFalse(resultadoMS); // !False
////        Resultado deve ser falso pois se trata do proprio resultado
//    }
//
//    @Test
//    void ResultadoMeioInfeior(){
//        boolean resultadoMI =
//                campo.isVizinho(new Campo(campo.getX()-1,campo.getY()));
//        Assertions.assertTrue(resultadoMI);
//    }
//
//    @Test
//    void ResultadoDireitaSuperior(){
//        boolean resultadoDS =
//                campo.isVizinho(new Campo(campo.getX()-1,campo.getY()+1));
//        Assertions.assertTrue(resultadoDS);
//    }
//
//    @Test
//    void ResultadoDireitaMeio(){
//        boolean resultadoDM =
//                campo.isVizinho(new Campo(campo.getX(),campo.getY()+1));
//        Assertions.assertTrue(resultadoDM);
//    }
//
//    @Test
//    void ResultadoDireitaInferior(){
//        boolean resultadoDI =
//                campo.isVizinho(new Campo(campo.getX()+1,campo.getY()+1));
//        Assertions.assertTrue(resultadoDI);
//    }
//}
