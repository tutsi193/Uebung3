package h3;

public class H3_Main {
	public static void main(String[] args) {
		int max = 100;
		int fix = 50;
		int wartend = 80;
		boolean istVoll;
		
		istVoll = (fix == max);
		
		if (fix < max && wartend > 0) {
			fix = fix + wartend;
			if (fix > max) {
				wartend = fix - max;
				fix = max;
				istVoll = true;
			}else {
				wartend = 0;
				istVoll = false;
			}
		}
		
		System.out.println("max= "+max);
		System.out.println("fix= "+fix);
		System.out.println("wartend= "+wartend);
		System.out.println(istVoll);
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