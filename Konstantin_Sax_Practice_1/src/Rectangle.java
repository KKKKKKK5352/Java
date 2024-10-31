class Rectangle {
    double width, height;

    Rectangle() {
        width = 1; height = 1;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth; height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width + height) * 2;
    }
}