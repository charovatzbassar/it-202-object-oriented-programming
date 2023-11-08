package week6.lab;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public void printLine() {
        this.starsInLastPrint = 0;
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }

    public void print() {
        int totalStars = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            totalStars += this.starsInLastPrint;
        }
        this.starsInLastPrint = totalStars;
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }

}
