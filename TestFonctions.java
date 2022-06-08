import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestFonctions {

	@Test
	public void testGetArticles() {
		Fromage fromage1 = new Fromage("Abondance");
		Fromage fromage2 = new Fromage("Brebis");
		Articles articles = new Articles();
		fromage1.addArticle("Clé1",6);
		fromage2.addArticle("Clé2",4);
		fromage1.addArticle("Clé3",8);
		List<Fromage> listeFromages = new LinkedList<Fromage>();
		listeFromages.add(fromage1);
		listeFromages.add(fromage2);
		articles.addFromages(listeFromages);
		assertEquals(articles.getArticle("Abondance", "Clé3"),new Article(fromage1,"Clé3",8));
	}
	
}
