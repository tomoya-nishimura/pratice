public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Dancer d = new Dancer();
		d.name = "踊り子";
		Matango m = new Matango('m');
		h.name = "ともや";
		d.dance();

		while(m.hp > 0) {
			h.attack(m);
			if(m.hp > 0) {
				System.out.println("マタンゴの残りHP" + m.hp);
			}

		}
		System.out.println("マタンゴを倒した！");
	}

}
