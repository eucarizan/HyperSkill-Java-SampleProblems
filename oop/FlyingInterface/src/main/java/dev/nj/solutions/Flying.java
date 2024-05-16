package dev.nj.solutions;

public interface Flying {
    int KM = 1000;

    int getHeight();

    default int getHeightInKm() {
        return getHeight() / KM;
    }
}
