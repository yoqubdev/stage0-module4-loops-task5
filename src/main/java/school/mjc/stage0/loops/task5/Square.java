package school.mjc.stage0.loops.task5;

public class Square {
    public static void main(String[] args) {
        Square square=new Square();
        square.printSquareFrom8s(5);
    }
    public void printSquareFrom8s(int sideLength){

        for (int i = 0; i <= sideLength; i++) {
            for (int j = 0; j <= sideLength ; j++) {
                if (i==0 || j==0 || i==sideLength || j==sideLength){
                    System.out.print("8");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
