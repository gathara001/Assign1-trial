public class Locomotive {
    private String type;
    private String propulsion;

    public void Locomotive(String propulsion,String type){
        this.type=type;
        this.propulsion=propulsion;
    }
public void displayLocomotive(){
        System.out.println("Ship Propulsion System : "+ propulsion +",Ship Type: "+ type );
}

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
