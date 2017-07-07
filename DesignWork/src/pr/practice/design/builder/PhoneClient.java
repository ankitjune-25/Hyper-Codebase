package pr.practice.design.builder;

public class PhoneClient {

	public static void main(String[] args) {

		PhoneBuilder phone = new PhoneBuilder.Builder()
								.setOs("Android")
								.setCamera("20 MP")
								.setProcessor("Snapdragon 625")
								.build();

		System.out.println(phone.toString());
	}
}
