import java.util.Scanner;
public class BillPrint{

public static void main(String args[]){
	System.out.println("==================================================================================");
	System.out.println();
	System.out.println("__          __  _                             _           _ __  __            _ ");
	System.out.println("\\ \\        / / | |                           | |         (_)  \\/  |          | |");
	System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___   | |_ ___     _| \\  / | __ _ _ __| |_");
	System.out.println("  \\ \\/  \\/ /  _ \\|/ __/ _ \\| '_ ' _  \\/ _ \\  | __/ _ \\   | | |\\/| |/ _` | '__| __|");
	System.out.println("   \\  /\\  /   __/| (_| (_) | | | | | |  __/  | || ( ) |  | | |  | | (_| | |  | |_");
	System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|   \\__\\___/   |_|_|  |_|\\__,_|_|   \\__|");
	System.out.println();
	System.out.println("==================================================================================");
	
	Scanner input = new Scanner(System.in);
	System. out.println("Enter Customer Phone Number -");
	String phonenumber= input.nextLine()
;

	System. out.println("Enter Customer Name -");
	String name= input.nextLine();

//Quantity inputs....................................................................

	System. out.println("Basmathi Qty(Kg) -");
	int BasmathiQty = input.nextInt();

	System. out.println("Dhal Qty(Kg) -");
	int DhalQty= input.nextInt();
	
	System. out.println("Sugar Qty(Kg) -");
	int SugarQty= input.nextInt();

	System. out.println("Higland Qty -");
	int higlndQty  = input.nextInt();

	System. out.println("Yoghurt Qty -");
	int yogurt = input.nextInt();

	System. out.println("Flour Qty(Kg) -");
	int flourQty = input.nextInt();

	System. out.println("Soap Qty -");
	int Soap = input.nextInt();

// prices...............................................................................

	double pricebasmathi = BasmathiQty * 250;
	double pricedhal = DhalQty * 180;
	double pricesuger = SugarQty * 150;
	double pricehighland = higlndQty * 1200;
	double priceyoghurt = yogurt * 50;
	double priceflour =flourQty * 120;
	double pricesoap = Soap * 160;
//total........................

	double total = pricebasmathi+pricedhal+pricesuger+pricehighland+priceyoghurt+priceflour+pricesoap;
	double discount = total * 0.1;
	double finalprice = total - discount;


//...........................................................
//.............................................
	System.out.println("+----------------------------------------------------------------------------------------------------+");
System.out.println("|                                _   __   __           _____ _______                                |");
System.out.println("|                               (_) |  \\/  |   /\\   |  __ \\__  __|                                   |");
System.out.println("|                                _  | \\  / |  /  \\  | |__) |  | |                                    |");
System.out.println("|                               | | | |\\/| | / /\\ \\ |  _  /  | |                                     |");
System.out.println("|                               | | | |  | |/ ____ \\| | \\ \\  | |                                     |");
System.out.println("|                               |_| |_|  |_/_/    \\_\\_|  \\_\\|_|                                    |");
System.out.println("|                                   225,Galle Road,Panadura.                                          |");
System.out.println("+----------------------------------------------------------------------------------------------------+");
System.out.println("|                                   # Tel   :    " + phonenumber + "                                            |");
System.out.println("|                                   # Name  :    " + name + "                                               |");
System.out.println("+---------------+---------------------+-----------------------+----------------------------------------------+");
System.out.println("|               |        Qty          |      Unit Price       |            Price                             |");
System.out.println("+---------------+---------------------+-----------------------+----------------------------------------------+");
System.out.println("| #Basmathi     |        " + BasmathiQty + "            |        250.00         |           " + pricebasmathi + "           |");
System.out.println("| #Dhal         |        " + DhalQty + "            |        180.00         |           " + pricedhal + "           |");
System.out.println("| #Sugar        |        " + SugarQty + "            |        150.00         |           " + pricesuger + "           |");
System.out.println("| #Highland     |        " + higlndQty + "            |       1200.00         |           " + pricehighland + "          |");
System.out.println("| #Yoghurt      |        " + yogurt + "            |         50.00         |           " + priceyoghurt + "           |");
System.out.println("| #Flour        |        " + flourQty + "            |        120.00         |           " + priceflour + "           |");
System.out.println("| #Soap         |        " + Soap + "            |        160.00         |           " + pricesoap + "           |");
System.out.println("+---------------+---------------------+-----------------------+-----------------------------+");
System.out.println("|                                     |  Total                |              " + total + "            |");
System.out.println("|                                     +-----------------------+-----------------------------+");
System.out.println("|                                     |  Discount (10%)       |              " + discount + "           |");
System.out.println("|                                     +-----------------------+-----------------------------+");
System.out.println("|                                     |  Final Price          |              " + finalprice + "           |");
System.out.println("+-------------------------------------+-----------------------+-----------------------------+");


//amount input..................................
	System.out.println("Enteer Amount-" );
	double amount = input.nextDouble();

	double change = amount - finalprice;

	
	System.out.println("+-----------------+-------------------+");
	System.out.println("| Net Amount      |" + finalprice +"             |");
	System.out.println("| Cash            |" + amount +"            |");
	System.out.println("| Change          |" + change +"            |"); 
     	System.out.println("+-----------------+-------------------+");


//print given currency notes and coins...............................................................................................
	int r5000 = (int)change/5000;
	    change = change % 5000;
	int r2000 = (int)change/2000;
 	    change = change % 2000;
	int r1000 = (int)change / 1000;
	    change = change % 1000;
	int r500 = (int)change /500;
	    change = change % 500;
	int r100 = (int)change/100;
	    change = change % 100;
	int r50 = (int)change /50;
	    change = change % 50;
	int r20 = (int)change/20;
	    change = change %20;
	int r10 = (int)change /10;
	    change = change % 10;
	int r5 = (int)change/5;
	    change = change%5;
	int r2 = (int)change/2;
	    change = change %2;
	int r1 = (int)change / 1;
	    change = change %1;
	int nonotes = r5000 + r2000 + r1000 + r500 + r100 + r50 + r20 ;
	int nocoins = r10 + r5 + r2 + r1;

	System.out.println("+-----------------+-------------+");
	System.out.println("|     Value       | "  + " No"+"         |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.5000       |" +r5000   +"            |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.2000       | " +r2000  +"          |");
 	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.1000       | " +r1000  +"          |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.500        | " +r500   +"           |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   RS.100        | " +r100   +"           |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.50         | " +r50    +"           |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.20         | " +r20    +"          |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.10         | " +r10    +"           |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.5          | " +r5     +"          |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.2          | " +r2     +"          |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   Rs.1          | " +r1     +"          |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|  No of Notes    | "+nonotes +"          |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|  No of Coins    | "+nocoins +"          |");
	System.out.println("+-----------------+-------------+");

	System.out.println("----------------------------------------------------");
	System.out.println("            THANK YOU FOR SHOPPING WITH US");
	System.out.println("----------------------------------------------------");
	

}
}