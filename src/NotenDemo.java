public class NotenDemo {
    public static void main(String[] args) {
        getNotentext(100);
        getNotentext(67);
        getNotentext(1);
        getNotentext(88);
        getNotentext(64);
    }
    public static int getNotentext(int punkte){
        if (punkte >= 90){
            System.out.println("Punkte " + punkte +" ist Note Sehr Gut");
        }else if (punkte > 77 && punkte <90){
            System.out.println("Punkte " + punkte +" ist Note Gut");
        }else if (punkte > 64 && punkte <78){
            System.out.println("Punkte " + punkte +" ist Note Befriedigend");
        }else if (punkte > 50 && punkte <65){
            System.out.println("Punkte " + punkte +" ist Note Genügend");
        }else if (punkte <= 50){
            System.out.println("Punkte " + punkte +" ist Note Ungenügend");
        }else {
            System.out.println("Punkte nicht bekannt");
        }
        return punkte;
    }
}
