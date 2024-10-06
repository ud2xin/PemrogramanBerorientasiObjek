package bingo;

public class Bingo {
    
    public Bingo() {
        lirik();
    }

    public void lirik() {
        String awal = "There was a farmer who had a dog,\nAnd Bingo was his name-o";
        String[] bingo = {"B", "I", "N", "G", "O"};

        awal(awal, bingo, 0);
        
        for (int i = 1; i <= bingo.length; i++) {
            awal(awal, bingo, i);
        }
    }

    private void awal(String awal, String[] bingo, int tepuk) {
        System.out.println(awal);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < bingo.length; j++) {
                if (j < tepuk) {
                    System.out.print("(clap)-");
                } else {
                    System.out.print(bingo[j] + "-");
                }
            }
            System.out.println();
        }
        System.out.println("And Bingo was his name-o.\n");
    }
}
