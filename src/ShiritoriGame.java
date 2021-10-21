import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ShiritoriGame {

    String[] runGame;
    private List<String> alreadySaidWords;
    private boolean gameOver;

    //["word", "dowry", "yodel", "leader", "righteous", "serpent"]


    public ShiritoriGame() {
        this.alreadySaidWords = new ArrayList<>();
        this.gameOver = true;
    }

   boolean over = true;


    public void runGame(List<String> words){

        for (int i = 0; i < words.size(); i++ ){
            if(play(words.get(i))){
                alreadySaidWords.add(words.get(i));
            System.out.println(alreadySaidWords);
            }
           else{
               System.out.println("Game Over");
               break;

            }
        }
       // cyklus cez words a v každom kroku cyklu zavolať play(word) a ak to vráti true potom si poznač povedané slovo


   }

    public boolean play(String word){
       // vezmi posledné poznačené slovo a urob checky
       if (alreadySaidWords.isEmpty()) return true;

       String lastSaidWord = alreadySaidWords.get(alreadySaidWords.size()-1);
       if (word.toLowerCase(Locale.ROOT).startsWith(String.valueOf(lastSaidWord.charAt(lastSaidWord.length() -1)).toLowerCase(Locale.ROOT)) && !alreadySaidWords.contains(word)) {
           return true;
       }
       return false;
   }


    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Obor");
        list.add("Rampa");
        list.add("nigga");

        new ShiritoriGame().runGame(list);
    }
}
