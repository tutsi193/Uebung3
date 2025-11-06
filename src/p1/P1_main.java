package p1;

public class P1_main {

	public static void main(String[] args) {
		
		int wuerfel = 1;
	
		if (wuerfel == 1 || wuerfel == 4) {
			System.out.println("Gewonnen!");
		}else if (wuerfel == 2) {
			System.out.println("Verloren.");
		}else if (wuerfel == 5) {
			System.out.println("Unentschieden.");
		}else {
			
		}
	}
}
/*echo "# Uebung3" >> README.md
git init
git add .
git commit -m "first commit"
git branch -M main
git remote set-url origin https://github.com/tutsi193/Uebung3.git
git push -u origin main
*/