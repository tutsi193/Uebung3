package h2;

public class H2_Main {
	public static void main(String [] args) {
		int jahr = 2008;
		boolean schalt;
		
		if (jahr % 4 == 0 || jahr % 400 == 0) {
			schalt = true;
			System.out.println(jahr + " ist ein Schaltjahr.");
			if (jahr % 100 == 1) {
				schalt = false;
				System.out.println(jahr + " ist kein Schaltjahr.");
			}
		}else {
			schalt = false;
			System.out.println(jahr + " ist kein Schaltjahr.");
		}
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