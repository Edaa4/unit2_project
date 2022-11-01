public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;


public LinearEquation(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
}

    public double distance() {

        return roundedToHundredth(Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0)));
    }


    public double yIntercept(){
        return y1 - roundedToHundredth((slope() * x1));
    }


    public double slope(){
        return roundedToHundredth((y2-y1))/roundedToHundredth((x2-x1));
    }


    public String equation(){
        if (yIntercept() < 0){
            return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x - " + Math.abs(yIntercept());
        }
        else {
            return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept();
        }
    }


    public String coordinateForX(double xValue){
        return "(" + xValue + ", " + roundedToHundredth(((slope()*xValue)+yIntercept())) + ")";
    }

    public double roundedToHundredth(double toRound) {
    if (toRound > 0) {
        return Math.round(toRound * 100.0) / 100.0;
    }
    else
        return Math.round(toRound * 100.0) + 0.5 / 100.0;
    }


    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                "The equation between the two lines is: " + equation() + "\n" +
                "The slope of this line is: " + slope() + "\n" +
                "The y-intercept of this line is: " + yIntercept() + "\n" +
                "The distance between the two points is: " + distance();
    }
}
