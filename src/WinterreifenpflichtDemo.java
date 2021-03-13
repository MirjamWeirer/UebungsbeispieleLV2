public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        isWinterreifenPflicht(11,true);
        isWinterreifenPflicht(10,true);
        isWinterreifenPflicht(7,true);
        isWinterreifenPflicht(12,false);
        isWinterreifenPflicht(3, false);
    }
    public static int isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
        if (temperatur < 10 && rutschigeFahrbahn == true){
            System.out.println("Bitte Winterreifen verwenden.");
        } else if(temperatur < 4 && rutschigeFahrbahn == false){
            System.out.println("Winterreifen sind nicht erforderlich");
        } else {
            System.out.println("Winterreifen sind nicht erfoderlich, da Temperatur hoch genug und Fahrbahn nicht nass");
        }
        return temperatur;
    }
}
