import java.util.*;
public class MyDesign {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		drawLanterns(); // This statement calls to the method below which combines all of the lantern designs, and actually prints them out since it is in the main method

	}
	public static void lanternHandle(){ // This static method produces a lantern handle which is used for traditionally styled lanterns
		System.out.println(" ______________");
		System.out.println("|              | "); // 16 spaces for lantern plus one for spacing
		System.out.println("|              | ");
	}
	public static void lanternMetal(){ // This static method produces a basic metal lantern commonly seen in use centuries ago
		lanternHandle();
        System.out.println(" ______________");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|    Flame     |");
        System.out.println("|    Flame     |");
        System.out.println("|              |");
        System.out.println(" ______________");
        
}
	public static void lanternPaper(){
		System.out.println("    ________________");
		System.out.println("   |                | "); // This static method produces a traditional paper lantern
		System.out.println("   |                | ");
		System.out.println("   __________________");
		System.out.println("   *                * ");
		System.out.println("  *  --------------  *");
		System.out.println(" *    Flame Flame     *");
		System.out.println("  *   Flame Flame    *");
		System.out.println("   * -------------- * ");
		System.out.println("   __________________ ");

	}
	public static void lanternFloating(){
		System.out.println(" ______________________"); // This static method produces a floating paper lantern, seen in mass floating in skies after a tragedy
		System.out.println("*                      *");
		System.out.println(" *                    *" );
		System.out.println("  *                  *"  );
		System.out.println("   *                *"   );
		System.out.println("    *              *"    );
		System.out.println("     *            *"     );
		System.out.println("      *          *"      );
		System.out.println("       *  flame *"       );
		System.out.println("        *      *"        );
		System.out.println("         *    *"         );
	}
	public static void lanternCamping(){ // This static method consists of print statements which produce the likeness of a camping lantern
		lanternHandle();
		System.out.println(" ______________");
		System.out.println("|              | "); // The most intricate lantern
		System.out.println("|              | "); // This reminds me of boy scout camping trips, modeled after a coleman lantern
		System.out.println("|    glow      |  ");
		System.out.println("|    glow      |  ");
		System.out.println("|    glow      |  ");
		System.out.println("|              |  ");
		System.out.println("|              |  ");
		System.out.println(" ______________   ");
		System.out.println("   |        |  ");
		System.out.println("   |  knob  |  ");
		System.out.println("   |        |  ");
		System.out.println("   |        |  ");
		System.out.println("  /         \\ ");
		System.out.println(" /  propane  \\ "); // "I sell propane and propane accessories"
		System.out.println("/             \\ ");
		System.out.println("_______________ ");

	}
	public static void drawLanterns() { // This static method combines all of the methods created above, calling to all of them and printing out statements above each of them
		System.out.println(" This is the esteemed Metal Lantern!");
		lanternMetal();
		System.out.println(" This is the esteemed Paper Lantern!");
		lanternPaper();
		System.out.println(" This is the esteemed Floating Lantern!");
		lanternFloating();
		System.out.println(" This is the esteemed Camping Lantern!");
		lanternCamping();
		
}
}
