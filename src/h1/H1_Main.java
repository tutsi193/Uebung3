package h1;

public class H1_Main {
	public static void main(String []args) {
		
		double guthaben = -100;
		double monEingang = 200;
		int rating =-2;
		boolean warnhinweis; 
		boolean negativ;
		
		if (guthaben < 0) {
			negativ = true;
		}else {
			if (guthaben > 0) {
				rating += 3;
			}
			if (guthaben == 0) {
				rating += 2;
			}
			negativ = false;
		}
		
		if (guthaben < 0 && monEingang >= guthaben) {
			rating++;
		}
		if (guthaben < 0 && monEingang < guthaben) {
			rating -= 1;
		}
		
		if (guthaben < 0 && monEingang < guthaben && rating < 0) {
			warnhinweis = true;
		}else {warnhinweis = false;}
		
		System.out.println(rating);
		System.out.println("warnhinweis: " +warnhinweis);
		System.out.println("negativ: " +negativ);
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
