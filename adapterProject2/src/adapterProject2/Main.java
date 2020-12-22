package adapterProject2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main.main()");
		
		FormatAdapter adapter = new FormatAdapter(new Mp4());
		adapter.play("Some file..");
	}
}
