import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShiritoriGame {

    String[] runGame;
    private List<String> alreadySaidWords;
    private boolean gameOver;

    //["word", "dowry", "yodel", "leader", "righteous", "serpent"]


    public ShiritoriGame() {
        this.alreadySaidWords = new ArrayList<>();
        this.gameOver = true;
    }




    public List runGame(List<String> words){

        for (int i = 0; i < words.size(); i++ ){
            if(play(words.get(i))){
                alreadySaidWords.add(words.get(i));
            }
        }
       // cyklus cez words a v každom kroku cyklu zavolať play(word) a ak to vráti true potom si poznač povedané slovo
       return words;
   }



   public boolean play(String word){
       // vezmi posledné poznačené slovo a urob checky
       if (alreadySaidWords.isEmpty()) return true;

       String lastSaidWord = alreadySaidWords.get(alreadySaidWords.size()-1);
       if (word.startsWith(String.valueOf(lastSaidWord.charAt(lastSaidWord.length() -1))))
           return true;

       if (alreadySaidWords.contains(lastSaidWord));
       return false;
   }


    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Obor");
        list.add("Rampa");
        list.add("Asiminister");

        System.out.println();
    }
}
