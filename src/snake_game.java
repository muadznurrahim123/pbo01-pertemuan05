public class snake_game {
    String username;
    int score;
    double length;

    void bigMeal(){
        System.out.println("nyam...nyam...");
    }

    void eatOther(snake_game snake){
        score += 300;
    }
}
