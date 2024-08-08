class Rectangle {
    double length;
    double breadth;

 Rectangle(double len, double brd) //Constructor
 {
 length = len;
 breadth = brd;
 }

 void setLength(double len) {
     length = len;
 }

 void setBreadth(double brd) {
     breadth = brd;
 }

 double getLength() {
     return length;
 }

 double getBreadth() {
     return breadth;
 }

 // Method to calculate the area of the rectangle
double calculateArea()
 {
 return length*breadth;
 }

public static void main(String[]args)
 {
 //Create Rectangle object
 Rectangle rec = new Rectangle(99,67);

 //Display the length, breadth and area
 System.out.println("Length: " + rec.getLength());
 System.out.println("Breadth: " + rec.getBreadth());
 System.out.println("Area: " + rec.calculateArea());
}
}
