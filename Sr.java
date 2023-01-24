import java.util.*;
class SeatReservation {
	static int row = 0, column=0;
	static int chz;
	static int chz2;
	static boolean contains = false;
	static char[][] busseat = {
            {'*','*','*','*'},
            {'*','*','*','*'},
            {'*','*','*','*'},
            {'*','*','*','*'}
        };
	static char[][] eco1seat = {
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'},
                {'*','*','*','*','*','*','*'}
            };
	static char[][] eco2seat = {
			{'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'},
            {'*','*','*','*','*','*','*'}
        };
	static void delay() {
		try
	      {
	        Thread.sleep(1500);
	        System.out.println("");
	      }
	      catch(InterruptedException ex)
	      {
	          ex.printStackTrace();
	      }  
	}	
	static void delay2() {
		try
	      {
			System.out.print(".");
	        Thread.sleep(500);
	        System.out.print(".");
	        Thread.sleep(500);
	        System.out.print(".");
	        Thread.sleep(500);
	        System.out.println("\r       ");
	      }
	      catch(InterruptedException ex)
	      {
	          ex.printStackTrace();
	      }  
	}
	static void delay3() {
		try
	      {
			System.out.print("Processing");
			System.out.print(".");
	        Thread.sleep(500);
	        System.out.print(".");
	        Thread.sleep(500);
	        System.out.print(".");
	        Thread.sleep(500);
	        System.out.println("\r              ");
	      }
	      catch(InterruptedException ex)
	      {
	          ex.printStackTrace();
	      }  
	}
	static void dspseat() {
		System.out.println("Bussiness Class Seat Reserveation:");
		delay();
        System.out.println("          Col 1    Col 2     Isle    Col 3   Col 4");
        System.out.println("             -----      -----              -----      -----");
        System.out.println("Row 1        | "+busseat[0][0]+" |      | "+busseat[0][1]+" |              | "+busseat[0][2]+" |      | "+busseat[0][3]+" |");
        System.out.println("             -----      -----              -----      -----");
        System.out.println("Row 2        | "+busseat[1][0]+" |      | "+busseat[1][1]+" |              | "+busseat[1][2]+" |      | "+busseat[1][3]+" |");
        System.out.println("             -----      -----              -----      -----");
        System.out.println("Row 3        | "+busseat[2][0]+" |      | "+busseat[2][1]+" |              | "+busseat[2][2]+" |      | "+busseat[2][3]+" |");
        System.out.println("             -----      -----              -----      -----");
        System.out.println("Row 4        | "+busseat[3][0]+" |      | "+busseat[3][1]+" |              | "+busseat[3][2]+" |      | "+busseat[3][3]+" |");
        System.out.println("             -----      -----              -----      -----");
       	}
	static void dspseate1() {
		System.out.println("Economy Class 1 Seat Reserveation:");
		delay();
        System.out.println("             Col 1      Col 2      Col 3     Isle        Col 4    Col 5    Col 6");
        System.out.println("Row 1        | "+eco1seat[0][0]+" |      | "+eco1seat[0][1]+" |      | "+eco1seat[0][2]+" |              | "+eco1seat[0][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 2        | "+eco1seat[1][0]+" |      | "+eco1seat[1][1]+" |      | "+eco1seat[1][2]+" |              | "+eco1seat[1][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 3        | "+eco1seat[2][0]+" |      | "+eco1seat[2][1]+" |      | "+eco1seat[2][2]+" |              | "+eco1seat[2][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 4        | "+eco1seat[3][0]+" |      | "+eco1seat[3][1]+" |      | "+eco1seat[3][2]+" |              | "+eco1seat[3][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 5        | "+eco1seat[4][0]+" |      | "+eco1seat[4][1]+" |      | "+eco1seat[4][2]+" |              | "+eco1seat[4][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 6        | "+eco1seat[5][0]+" |      | "+eco1seat[5][1]+" |      | "+eco1seat[5][2]+" |              | "+eco1seat[5][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 7        | "+eco1seat[6][0]+" |      | "+eco1seat[6][1]+" |      | "+eco1seat[6][2]+" |              | "+eco1seat[6][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 8        | "+eco1seat[7][0]+" |      | "+eco1seat[7][1]+" |      | "+eco1seat[7][2]+" |              | "+eco1seat[7][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 9        | "+eco1seat[8][0]+" |      | "+eco1seat[8][1]+" |      | "+eco1seat[8][2]+" |              | "+eco1seat[8][3]+" |      | "+eco1seat[0][4]+" |      | "+eco1seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
	}
	static void dspseate2() {
		System.out.println("Economy Class 2 Seat Reserveation:");
		delay();
        System.out.println("             Col 1      Col 2      Col 3     Isle        Col 4    Col 5    Col 6");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
        System.out.println("Row 1        | "+eco2seat[0][0]+" |      | "+eco2seat[0][1]+" |      | "+eco2seat[0][2]+"        |        "+eco2seat[0][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("Row 2        | "+eco2seat[1][0]+" |      | "+eco2seat[1][1]+" |      | "+eco2seat[1][2]+"        |        "+eco2seat[1][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("Row 3        | "+eco2seat[2][0]+" |      | "+eco2seat[2][1]+" |      | "+eco2seat[2][2]+"        |        "+eco2seat[2][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("Row 4        | "+eco2seat[3][0]+" |      | "+eco2seat[3][1]+" |      | "+eco2seat[3][2]+"        |        "+eco2seat[3][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("Row 5        | "+eco2seat[4][0]+" |      | "+eco2seat[4][1]+" |      | "+eco2seat[4][2]+"        |        "+eco2seat[4][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("Row 6        | "+eco2seat[5][0]+" |      | "+eco2seat[5][1]+" |      | "+eco2seat[5][2]+"        |        "+eco2seat[5][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("Row 7        | "+eco2seat[6][0]+" |      | "+eco2seat[6][1]+" |      | "+eco2seat[6][2]+"        |        "+eco2seat[6][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("Row 8        | "+eco2seat[7][0]+" |      | "+eco2seat[7][1]+" |      | "+eco2seat[7][2]+"        |        "+eco2seat[7][3]+" |      | "+eco2seat[0][4]+" |      | "+eco2seat[0][5]+" |");
        System.out.println("             -----      -----      -----              -----      -----      -----     ");
	}
	static void wc() {
		delay();
		System.out.println("Welcome to Plane Seat Reservation!");
		delay();
		System.out.println("        __|__\n*--o--o--(_)--o--o--*");
	}
	
	
	
	//BusinessClass2
	
	static void rsrvst() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to reserve:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(busseat[row][column]=='*') {
            	busseat[row][column] = 'X';
            	delay3();
            	dspseat();
            	System.out.println("You Have Succesfully Reserved Your Seat");
            	System.out.println("\n\n________________________________________\n");
            	System.out.println(new Date()+"\n");
            	System.out.println("Your new reserved seat is(row, column) : "+input.charAt(0)+" "+input.charAt(2)+"\n");
            	System.out.println("________________________________________\n");
            }else {
            	System.out.print("Seat already taken");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
	}
	static void rmvsrvst() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to remove:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(busseat[row][column]=='X') {
            	busseat[row][column] = '*';
            	delay3();
            	dspseat();
            	System.out.println("\n\n________________________________________\n");
            	System.out.println(new Date()+"\n");
            	System.out.println("Your new reserved seat is(row, column) : "+input.charAt(0)+" "+input.charAt(2)+"\n");
            	System.out.println("________________________________________\n");
            }else {
            	System.out.print("Seat already empty");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
	}
	static void chngseat() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to remove:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(busseat[row][column]=='X') {
            	busseat[row][column] = '*';
            }else {
            	System.out.print("Seat already empty");
            }
        }catch(Exception e){
                System.out.println("Error");
        }
		try{
            System.out.print("Enter Row and Column Number to reserve:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(busseat[row][column]=='*') {
            	busseat[row][column] = 'X';
            	delay3();
            	dspseat();
            	System.out.println("You Have Succesfully Changed Your Seat");
            	System.out.println("\n\n________________________________________\n");
            	System.out.println(new Date()+"\n");
            	System.out.println("Your new reserved seat is(row, column) : "+input.charAt(0)+" "+input.charAt(2)+"\n");
            	System.out.println("________________________________________\n");
            }else {
            	System.out.print("Seat already taken");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
		
	}
	
	//EconomyClass1
	
	static void rsrvste1() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to reserve:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco1seat[row][column]=='*') {
            	eco1seat[row][column] = 'X';
            	delay3();
            	dspseate1();
            	System.out.println("You Have Succesfully Reserved Your Seat");
            	System.out.println("\n\n________________________________________\n");
            	System.out.println(new Date()+"\n");
            	System.out.println("Your new reserved seat is(row, column) : "+input.charAt(0)+" "+input.charAt(2)+"\n");
            	System.out.println("________________________________________\n");
            }else {
            	System.out.print("Seat already taken");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
	}
	static void rmvsrvste1() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to remove:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco1seat[row][column]=='X') {
            	eco1seat[row][column] = '*';
            	delay3();
            	dspseate1();
            	System.out.println("You Have Succesfully Remove Your Seat(row,column): "+input);
            }else {
            	System.out.print("Seat already empty");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
	}
	static void chngseate1() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to remove:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco1seat[row][column]=='X') {
            	eco1seat[row][column] = '*';
            }else {
            	System.out.print("Seat already empty");
            }
        }catch(Exception e){
                System.out.println("Error");
        }
		try{
            System.out.print("Enter Row and Column Number to reserve:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco1seat[row][column]=='*') {
            	eco1seat[row][column] = 'X';
            	delay3();
            	dspseate1();
            	System.out.println("You Have Succesfully Changed Your Seat");
            	System.out.println("\n\n________________________________________\n");
            	System.out.println(new Date()+"\n");
            	System.out.println("Your new reserved seat is(row, column) : "+input.charAt(0)+" "+input.charAt(2)+"\n");
            	System.out.println("________________________________________\n");
            }else {
            	System.out.print("Seat already taken");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
		
	}
	
	
	
	//EconomyClass2
	
	static void rsrvste2() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to reserve:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco2seat[row][column]=='*') {
            	eco2seat[row][column] = 'X';
            	delay3();
            	dspseate2();
            	System.out.println("You Have Succesfully Reserved Your Seat");
            	System.out.println("\n\n________________________________________\n");
            	System.out.println(new Date()+"\n");
            	System.out.println("Your new reserved seat is(row, column) : "+input.charAt(0)+" "+input.charAt(2)+"\n");
            	System.out.println("________________________________________\n");
            }else {
            	System.out.print("Seat already taken");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
	}
	static void rmvsrvste2() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to remove:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco2seat[row][column]=='X') {
            	eco2seat[row][column] = '*';
            	delay3();
            	dspseate2();
            	System.out.println("You Have Succesfully Remove Your Seat(row,column): "+input);
            }else {
            	System.out.print("Seat already empty");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
	}
	static void chngseate2() {
		Scanner sc = new Scanner(System.in);
		try{
            System.out.print("Enter Row and Column Number to remove:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco2seat[row][column]=='X') {
            	eco2seat[row][column] = '*';
            }else {
            	System.out.print("Seat already empty");
            }
        }catch(Exception e){
                System.out.println("Error");
        }
		try{
            System.out.print("Enter Row and Column Number to reserve:");
            String input = sc.nextLine();
            String ninput = input.replaceAll("\\s","");
            row = (Character.digit(ninput.charAt(0), 10)-1);
            column = (Character.digit(ninput.charAt(1), 10)-1);
            if(eco2seat[row][column]=='*') {
            	eco2seat[row][column] = 'X';
            	delay3();
            	dspseate2();
            	System.out.println("You Have Succesfully Changed Your Seat");
            	System.out.println("\n\n________________________________________\n");
            	System.out.println(new Date()+"\n");
            	System.out.println("Your new reserved seat is(row, column) : "+input.charAt(0)+" "+input.charAt(2)+"\n");
            	System.out.println("________________________________________\n");
            }else {
            	System.out.print("Seat already taken");
            }
            
            }catch(Exception e){
                System.out.println("Error");
            }
		
	}
	
	
	
	static void askfclass() {
		System.out.println("Choose Flight Class:\n1 = Business Class\n2 = Economy Class 1\n3 = Economy Class 2");
	}
	
	
	public static void main (String []args) {
		wc();
		for(int x=0;;x++) {
			delay();
			
			System.out.println("What Action Would you like to perform:\n1 = Reserve Seat\n2 = Remove Reserved Seat\n3 = Change Reserved Seat");
			
			System.out.println("");
			Scanner sc = new Scanner(System.in);
			chz = sc.nextInt();
			
			if(chz == 1) {
				
				delay();
				askfclass();
				chz2 = sc.nextInt();
				if(chz2 == 1) {
					delay();
					dspseat();
					delay();
					rsrvst();
					delay();
				}else if(chz2 == 2) {
					delay();
					dspseate1();
					delay();
					rsrvste1();
					delay();
				}else if(chz2 == 3) {
					delay();
					dspseate2();
					delay();
					rsrvste2();
					delay();
				}
			}else if(chz == 2) {
				delay();
				askfclass();
				chz2 = sc.nextInt();
				if(chz2 == 1) {
					delay();
					dspseat();
					delay();
					rmvsrvst();
					delay();
				}else if(chz2 == 2) {
					delay();
					dspseate1();
					delay();
					rmvsrvste1();
					delay();
				}else if(chz2 == 3) {
					delay();
					dspseate2();
					delay();
					rmvsrvste2();
					delay();
				}
				
			}else if(chz == 3) {
				delay();
				askfclass();
				chz2 = sc.nextInt();
				if(chz2 == 1) {
					delay();
					dspseat();
					delay();
					chngseat();
					delay();
				}else if(chz2 == 2) {
					delay();
					dspseat();
					delay();
					chngseate1();
					delay();
				}else if(chz2 == 3) {
					delay();
					dspseat();
					delay();
					chngseate2();
					delay();
				}
			}else {
				continue;
			}
		}
		
	}
}
