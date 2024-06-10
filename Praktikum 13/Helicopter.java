// Yohanes Panjaitan
// 24060122140108
public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public Helicopter(){
        this.maxLoad = 0;
    }

    public double calcFuelEfficiency(){
        return super.calcFuelEfficiency() + maxLoad;
    }

    public double calcTripDistance(){
        return super.calcTripDistance() * calcFuelEfficiency() + 50;
    }

    public String toString(){
        return super.toString() + " hanya memerlukan landasan kecil";
    }
}