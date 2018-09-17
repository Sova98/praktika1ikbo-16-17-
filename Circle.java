import com.sun.prism.paint.Color;

import javax.xml.bind.annotation.XmlType;

public class Circle {
    private String color;
    private int diameter;
    private int DEFAULT_DIAMETER = 10;
    private String DEFAULT_COLOR = "Black";

    public Circle(String color, int diameter){
        this.color = color;
        this.diameter = diameter;
    }

    public Circle(String color){
        this.color = color;
        this.diameter = DEFAULT_DIAMETER;
    }

    public Circle(){
        this.color = DEFAULT_COLOR;
        this.diameter = DEFAULT_DIAMETER;
    }

    public Circle(int diameter){
        this.diameter = diameter;
        this.color = DEFAULT_COLOR;
    }

    public void SetColor(String color){
        this.color = color;
    }

    public void SetDiameter(int diameter){
        this.diameter = diameter;
    }

    public String GetColor(){
        return this.color;
    }

    public int GetDiameter(){
        return this.diameter;
    }

    public String toString(){
        return "Color " + this.color + ", diameter " + this.diameter;
    }
}
