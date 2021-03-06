import java.util.Scanner;

/**
 * Created by Joe on 11/14/15.
 */
public class Main {

    public static void main(String[] args){
        Grid grid = new Grid();
        grid.readFile("data/complexWorld.txt");
        grid.printWorld();
        char[][] world = grid.getWorld();
        System.out.println("Enter the X coordinate of the Start State:");
        Scanner sc = new Scanner(System.in);
        int xs = sc.nextInt();
        System.out.println("Enter the Y coordinate of the Start State");
        int ys = sc.nextInt();
        System.out.println("Enter the X coordinate of the Goal State");
        int gx = sc.nextInt();
        System.out.println("Enter the Y cooridnate of the Goal State");
        int gy = sc.nextInt();

        int[] start = new int[2];
        start[0] = xs;
        start[1] = ys;
        int[] goal = new int[2];
        goal[0] = gx;
        goal[1] = gy;

        Qlearning ql = new Qlearning(start, goal, world);

    }
}
