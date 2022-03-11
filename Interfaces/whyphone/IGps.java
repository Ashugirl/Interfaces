package be.intecbrussel.whyphone;

public interface IGps {
    String locate(double lat, double lon);

    void navigate();
}
