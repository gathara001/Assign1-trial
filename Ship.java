public class Ship extends Locomotive{
    private String VesselType;
}
public Ship(String type, String propulsion,String VesselType) {
    super( VesselType);
    this.VesselType=VesselType;
}

@Override
public void displayShipInfo(){
    super.displayShipInfo();{
        System.out.println("Vessel Type: "+VesselType);
    }
}
public int gethullLength() {
    return hullLength()
}
public void sethullLength(int hullLength) {
    this.hullLength.;
}