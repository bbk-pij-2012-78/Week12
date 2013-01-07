public class ComparatorLauncher {

	public static void main(String[] args) {
		ComparatorLauncher launcher = new ComparatorLauncher();
		launcher.launch();
	}

	public void launch() {
		Comparator comp = new Comparator();

		System.out.println(comp.getMax(1.1, 1.3));
	}
}