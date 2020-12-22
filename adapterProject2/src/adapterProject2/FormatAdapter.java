package adapterProject2;

public class FormatAdapter implements MediaPackage {
	
	MediaPackage mediaPackage;
	public FormatAdapter(MediaPackage media) {
		// TODO Auto-generated constructor stub
		this.mediaPackage = media;
	}

	@Override
	public void play(String filename) {
		mediaPackage.play(filename);
	}

}
