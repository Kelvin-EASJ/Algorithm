package søgeAlgoritme;

public class SøgeAlgoritme {

    public static void main(String[] args) {
        int[] data = {3, 5, 20, 7, 10, 8, 12}; //Arraylisten hvor index for 8 findes
        int find8 = 8; //funktionen der specificere index

        for(int i = 0; i<data.length; i++) {
            if (find8 == data[i]) {
                System.out.println("Tallet 8 er fundet på index " +i);
                break;
            } else System.out.println("Tallet 8 er ikke fundet på dette index");
        }
    }
}
