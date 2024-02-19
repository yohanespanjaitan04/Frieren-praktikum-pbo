class Titik {
    //altribut
    double absis, ordinat;
    static double counter;
    
    //constructor
    Titik() {
        absis = 0;
        ordinat = 0;
        counter ++;
    }
    Titik (double a, double b){
        absis = a;
        ordinat = b;
        counter ++;
    }
    double getAbsis(){
        return absis;
    }
    
    double getOrdinat(){
        return ordinat;
    }
    
    static double getCounter(){
        return counter;
    }
    
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double b){
        ordinat = b;
    }
}
