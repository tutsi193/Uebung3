package p3;

public class P3_Main {
	public static void main (String[] args) {
		
		int i = -15;
		
		if (i < 0) {
			i *= -1;
		}
		System.out.println("Betrag von i:" +i);
		System.out.println(i*i);
		
		if (i % 2 == 0) {
			System.out.println("i ist gerade");
		}else {
			System.out.println("i ist ungerade");
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