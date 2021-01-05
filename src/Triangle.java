public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if(sideA<=0 || sideB <=0 || sideC<=0){
            throw new IllegalTriangleException("Canh la so am");
        }
        if(sideA+sideB<= sideC || sideA+sideC<=sideB || sideB+sideC<=sideA){
            throw new IllegalTriangleException("Day khong phai 3 canh cua tam giac");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
