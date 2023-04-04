public class Main {
    public static void main(String[] args) {
        BasicStructure audi = new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="500cc";

        Engine x=new Engine();
        x.cylinders="8";
        x.size="1234cc";
        x.weight="6453k";


        color col=new color();
        col.colorLights="True";
        col.colorTyre="false";
        col.colorWindows="True";

        lights neon = new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";


    }
}