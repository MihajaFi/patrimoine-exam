package school.hei.patrimoine.visualisation.swing.ihm;

import static java.awt.EventQueue.invokeLater;

import java.util.List;
import school.hei.patrimoine.cas.example.EtudiantPireCas;
import school.hei.patrimoine.cas.example.PatrimoineCresusSupplier;
import school.hei.patrimoine.cas.example.PatrimoineRicheSupplier;
import school.hei.patrimoine.cas.example.PatrimoineBako31Décembre2025;
public class VisualiseurCas {

  public static void main(String[] args) {
    invokeLater(
        () ->
            new MainIHM(
                List.of(
                    new EtudiantPireCas().patrimoine(),
                    new PatrimoineRicheSupplier().get(),
                    new PatrimoineBako31Décembre2025().get(),
                    new PatrimoineCresusSupplier().get())));
  }
}
