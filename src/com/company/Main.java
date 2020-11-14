package com.company;

public class Main {
    enum Planets{Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune}
    Planets planet;
    double radius, mass;
    Main(Planets planet)
    {
        this.planet = planet;
        switch (planet){
            case Mercury:
                radius=2420;
                mass=3.33*Math.pow(10, 23);
                break;
            case Mars:
                radius=3396;
                mass=6.42*Math.pow(10, 23);
                break;
            case Earth:
                radius=6.37*Math.pow(10, 23);
                mass=5.97*Math.pow(10, 24);
                break;
            case Venus:
                radius=6052;
                mass=4.87*Math.pow(10, 24);
                break;
            case Saturn:
                radius=60268;
                mass=5.68*Math.pow(10, 26);
                break;
            case Uranus:
                radius=25362;
                mass=8.68*Math.pow(10, 25);
                break;
            case Jupiter:
                radius=69911;
                mass=1.9*Math.pow(10, 27);
                break;
            case Neptune:
                radius=24622;
                mass=1.02*Math.pow(10, 26);
                break;
        }
        System.out.println(radius+" "+mass);
    }
    public static void main(String[] args) {
        Main planet = new Main(Planets.Mercury);
    }
}
