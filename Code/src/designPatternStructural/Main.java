package designPatternStructural;
public class Main {
    public static void main(String[] args) {
        Video youtubeVideo = new YoutubeVideo(new HdVideoProcessor());
        youtubeVideo.play("abc.mp4");
        Video netflixVideo = new NetflixVideo(new Mp4Processor());
        netflixVideo.play("abc.mp4");
    }
}