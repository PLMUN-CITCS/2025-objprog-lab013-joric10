public class ParametersAndArguments {
    public static void main(String[] args) {
        // Declare width and height
        int roomWidth = 10;
        int roomHeight = 15;

        // Call the method to calculate area
        int area = calculateArea(roomWidth, roomHeight);

        // Print the result
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate the area of a rectangle
    public static int calculateArea(int width, int height) {
        return width * height;
    }
}
