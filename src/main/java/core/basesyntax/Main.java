package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FIGURES_QUANTITY = 8;
        Figure[] figure = new Figure[FIGURES_QUANTITY];

        for (int i = 0; i < FIGURES_QUANTITY; i++) {
            if (i < FIGURES_QUANTITY / 2) {
                figure[i] = new FigureSupplier().getRandomFigure();
                figure[i].drawInfo();
            } else {
                figure[i] = new FigureSupplier().getDefaultFigure();
                figure[i].drawInfo();
            }
        }
    }
}