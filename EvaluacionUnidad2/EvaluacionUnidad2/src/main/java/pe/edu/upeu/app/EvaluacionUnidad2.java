/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.app;

import pe.edu.upeu.gui.ControllerGame;
import pe.edu.upeu.gui.Juega3enRaya;
import pe.edu.upeu.gui.ModelGame;

/**
 *
 * @author HP
 */
public class EvaluacionUnidad2 {

    public static void main(String[] args) {
        ModelGame model = new ModelGame();
        Juega3enRaya view = new Juega3enRaya();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setVisible(true);
    }
}
