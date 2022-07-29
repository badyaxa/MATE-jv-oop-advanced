package core.basesyntax;

import core.basesyntax.model.Drawable;
import core.basesyntax.model.Figure;
import core.basesyntax.service.FigureSupplier;

public class Main {
    public static final int NUMBER_FIGURES = 12;
    public static final int MAXIMUM_LENGTH = 100;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i % 2 == 0) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
