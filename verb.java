package innlevering3; 

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class oppgave2 {
	public static void main(String[] args) throws Exception {
		//Catharina B. Holm //
		
		//scanner for å få inn filen//
		Scanner input = new Scanner(System.in);
		//hente ut det man skal //
		System.out.print("Oppgi navn på verbfil: ");
		String navnFil = input.nextLine();
			
		System.out.println();
		System.out.println();
		System.out.println();
		
		//deklarert array, med plasser bortover og nedover//
		File verb = new File(navnFil);
		String[][] bokstaver = new String[3][88];
		Random tilF = new Random();
		//ferdig med hele innlesningsdelen fra File//
		
		System.out.println("Velkommen til programmet som tester deg i bøyning av engelske verb.");
		System.out.println("Du kan velge å bli testet i opp til 88 verb.");
		System.out.println("Du vil få en karakter når testen er ferdig.");
		
		System.out.println();
		
		System.out.print("Ønsker du å prøve dette? (ja/nei) ");
		String spille = input.next();
		System.out.println();
		
		//en while for å lese inn alt du skal ha i en loop, eller om igjen da//
		while (spille.equals("ja")){
			
			
			Scanner leser = new Scanner(verb); 
			//if/else for å spørre enten eller her og andre steder//
			if(spille.equals("ja")){
			
			}else{
				System.exit(0);
			}
		
			for(int k = 0; k <= 87; k++){
				for (int i = 0; i <= 2; i++){
					bokstaver[i][k] = leser.next();
				}
			}
		
			System.out.print("Oppgi antall ønsket verb: ");
			int antSpm = input.nextInt();
		
		
		
			int poeng = 0;
		
			
			for(int i = 0; i < antSpm; i++){
					int tilFtall = tilF.nextInt(3);
		
				String sparOrd = bokstaver[tilFtall][i];
				bokstaver[tilFtall][i] = "...";
		
		
				
				System.out.print(bokstaver[0][i] + " - ");
				System.out.print(bokstaver[1][i] + " - ");
				System.out.println(bokstaver[2][i]);
		
				System.out.print("Skriv inn ordet som mangler: ");
		
				String svaret = input.next();
		
				if(sparOrd.equals(svaret)){
					poeng++;
				}else{
					System.out.println("Feil: " + sparOrd);
				
				}
			
			
			}
			System.out.println();
			System.out.print("Oppgi navnet ditt: ");
			input.nextLine();
			String navn = input.nextLine();
			System.out.println();
			//for å finne karakteren ut ifra det som blir svart er double, poeng og antspm det som utgjør svaret del på 100//
			double antallet = ((double)poeng/antSpm) * 100;
			char karakter ='F';
			//oppsett av karaktervalg//
			if(antallet >= 90){
				karakter = 'A';
			}else if (antallet >= 80 && antallet < 90){
				karakter = 'B';
			}else if (antallet >= 70 && antallet < 80){
				karakter = 'C';
			}else if (antallet >= 60 && antallet < 70){
				karakter = 'D';
			}else if (antallet >= 50 && antallet < 60){
				karakter = 'E';
			}else if (antallet >= 40 && antallet < 50){
				karakter = 'F';
			}
		
		
			System.out.println();
			System.out.println(navn);
		
			//utskriften av navn,karakteren og score man har klart//
			System.out.printf("Score: %.0f%% \n", antallet);
			System.out.println("Karakter: " + karakter );
			
			System.out.println();
			System.out.print("Vil du prøve en gang til? ");
			spille = input.next(); 
			System.out.println();
		}
		System.out.println();
		System.out.println("Spillet er er ferdig ");
	}
	

 } 
 	
