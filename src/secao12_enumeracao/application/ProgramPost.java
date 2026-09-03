package secao12_enumeracao.application;

import secao12_enumeracao.entities.Comment;
import secao12_enumeracao.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramPost {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(
                sdf.parse("27/08/2026 20:41:32"),
                "Traveling to Germany",
                "Visiting this great country",
                12);

        Post post2 = new Post(
                sdf.parse("27/08/2026 23:57:12"),
                "Good night guys",
                "See you tomorrow",
                5);

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");
        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");

        post1.addComment(comment1);
        post1.addComment(comment2);
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println(post2);
    }
}
