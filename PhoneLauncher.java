
public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		//launcher.launch();
		launcher.upcasting();
	}

	public void launch() {
		SmartPhone sp = new SmartPhone();

		//OldPhone methods
		sp.call("07786246207");

		//MobilePhone methods
		sp.ringAlarm("07:30");
		sp.playGame("Snake.exe");
		sp.printLastNumbers();

		//SmartPhone methods
		sp.browseWeb("http://www.google.co.uk");
		System.out.println(sp.findPosition().toString());
	}

	public void upcasting() {
		MobilePhone sp = new SmartPhone();
		testPhone(sp);
	}

	public void downcasting() {

	}

	public void testPhone(Phone phone) {

		SmartPhone sp = (SmartPhone) phone;

		sp.call("123456");
		sp.ringAlarm("07:30");
	}
}