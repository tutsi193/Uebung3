package p2;

public class P2_Main {
	public static void main (String []args) {
		
		int a = 25;
		int b = 25;
		int c = 50;
		int d = 0;
		
		/*boolean e1;
		boolean e2;
		boolean e3;
		boolean e4;
		
		e1 = (a == b);
		e2 = (a == b || a == c);
		e3 = (a + b >= c);
		e4 = (a + b + c >= 100);
		
		if Anweisungen...
		*/
		
		if (a == b) {
			d++;
		}
		if (a == b) {
			d++;
		}else if (a == c) {
			d++;
		}
		if (a + b >= c) {
			d++;
		}
		if (a + b + c >= 100) {
			d++;
		}
		System.out.println("Anzahl erfüllter Eigenschaften:" +d);
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