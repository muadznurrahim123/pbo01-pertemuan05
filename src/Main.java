public class Main {
    public static void main(String[] args) {
        snake_game player1 = new snake_game();
        snake_game player2 = new snake_game();

        player1.username = "Amat";
        player1.score = 300;
        player1.length = 2.5;

        player2.username = "Udin";
        player2.score = 200;
        player2.length = 0.5;

        player1.bigMeal();

        System.out.println(player1.score);
        player1.eatOther(player2);
        System.out.println(player1.score);
    }
}
