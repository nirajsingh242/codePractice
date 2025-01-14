package designPatternStructural;

public abstract class  Video {
	
	 VideoProcessor processor;
	 public Video(VideoProcessor processor){
	        this.processor = processor;
	    };
	
	 public abstract void play(String videoFile);
}
