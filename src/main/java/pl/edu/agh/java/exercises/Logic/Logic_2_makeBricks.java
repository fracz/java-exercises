package pl.edu.agh.java.exercises.Logic;

public class Logic_2_makeBricks {

//	public static void main(String[] args) {

//We want to make a row of bricks that is goal inches long. 
//We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
//Return true if it is possible to make the goal by choosing from the given bricks. 
//This is a little harder than it looks and can be done without any loops.
//		makeBricks(3, 1, 8) → true (small brick, big brick)
//		makeBricks(3, 1, 9) → false
//		makeBricks(3, 2, 10) → true

//		System.out.println(makeBricks(3, 1, 8));
//	}

	public boolean makeBricks(int small, int big, int goal) {
		int noBig = Math.floorDiv(goal, 5);

		if (goal > (big * 5 + small * 1)) {
			return false;
		} else if (goal - (noBig * 5) <= small) {
			return true;
		}
		return false;
	}
}
