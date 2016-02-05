//Reed Pinterich
//5 February 2016
//Brian Chen CSE 002
// Cyclometer to calculate distance traveled, given the rotation count
// and the time.
public class Cyclometer {
    public static void main(String[] args) {
        //given variables declared as doubles instead of ints to avoid converting later
        double timeOne = 480;
        double timeTwo = 3220;
        double countOne = 1561;
        double countTwo = 9037;
        // constants 
        double diameter = 27.0;
        double pi = 3.14159265;
        double feetPerMile = 5280;
        double inchesPerFoot = 12;
        double secondsPerMinute = 60;
        //variables declared to store what we want to know
        double distOne;
        double distTwo;
        double totalDistance;
        // print out what we know
        System.out.println("Trip 1 took " 
        + timeOne/secondsPerMinute + " minutes and " + countOne + " rotations");
        System.out.println("Trip 2 took " 
        + timeTwo/secondsPerMinute + " minutes and " + countTwo + " rotations");
        //calculations in inches, and then miles
        distOne = countOne * pi * diameter;
        distTwo = countTwo * pi * diameter;
        double inMilesOne = (distOne/inchesPerFoot)/feetPerMile;
        double inMilesTwo = (distTwo/inchesPerFoot)/feetPerMile;
        double totalDistanceMiles = inMilesOne + inMilesTwo;
        //Print out our calculations to find the distance traveled
        System.out.println("Trip one was " + inMilesOne + " miles");
        System.out.println("Trip two was " + inMilesTwo + " miles");
        System.out.println("The total distance was " + totalDistanceMiles + " miles");
    }
}