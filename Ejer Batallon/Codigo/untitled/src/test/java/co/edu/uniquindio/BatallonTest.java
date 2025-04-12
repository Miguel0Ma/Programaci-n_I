package co.edu.uniquindio;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class BatallonTest {
    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    @Test
    public void registrarMisionesTest(){
        //Batallon batallonTest = new Batallon("8 Brigada")


    }

    @Test
    void buscarSoldadoId() {
    }
    @Test void asignarSoldadoMision() {
        Soldado soldado = new Soldado("1","jhan","cadete",Especialidad.MEDICO,18,true);
        Batallon batallon= new Batallon();

        boolean resultadoTest= batallon.asignarSoldadoMision(soldado);
        assertTrue(resultadoTest);

    }
}