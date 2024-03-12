public interface Shape {
    void draw();
}
class Circle implements Shape{


    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square");
    }
}

class Romb implements Shape{

    @Override
    public void draw() {
        System.out.println("Romb");
    }
}

class ShapeFactory{
    public static Shape createShape(String type){
        if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        } else if("Square".equalsIgnoreCase(type)){
            return new Square();
        } else if("Romb".equalsIgnoreCase(type)) {
            return new Romb();
        }

        else{
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

class MainEx2{
    public static void main(String[] args){
        Shape Circle=ShapeFactory.createShape("Circle");
        Circle.draw();

        Shape Square=ShapeFactory.createShape("Square");
        Square.draw();
        Shape Romb=ShapeFactory.createShape("Romb");
        Romb.draw();
    }
}
