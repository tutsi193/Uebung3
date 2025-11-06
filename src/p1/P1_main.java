package p1;

public class P1_main {

	public static void main(String[] args) {
		
		int wuerfel = 5;
	
		if (wuerfel == 1 || wuerfel == 4) {
			System.out.println("Gewonnen!");
		}
		if (wuerfel == 2) {
			System.out.println("Verloren.");
		}
		if (wuerfel == 5) {
			System.out.println("Unentschieden.");
		}
		/*if (wuerfel == 3 || wuerfel == 6) {
			
		}*/
	}
}
/*echo "# Uebung3" >> README.md
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/tutsi193/Uebung3.git
git push -u origin main
*/
