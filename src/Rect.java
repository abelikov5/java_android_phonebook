public class Rect {
    int width;
    int height;
    int square;

    Rect(int width, int height) {
        this.width = width;
        this.height = height;

        this.square = this.width * this.height;
    }

    int perimeter () {
        return (width + height) * 2;
    }

    String totalSquare (int totalRect) {
        return "Общая площадь " + totalRect + " = " + this.square * totalRect;
    }
}
