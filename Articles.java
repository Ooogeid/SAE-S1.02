import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Articles {

	private List<Fromage> lesFromages;
	
	public Articles() {
		this.lesFromages = new LinkedList<Fromage>();
	}
	
	public void addFromages(List<Fromage> fromages) {
		this.lesFromages.addAll(fromages);
	}
	
	public String toStringFromagesEtArticles() {
		StringBuffer enForme = new StringBuffer();
		for (Fromage f : this.lesFromages) {
			enForme.append(f.toString() + '\n');
			if (f.nombreArticles() > 0) {
				for (Article article : f.getArticles()) {
					enForme.append(article.toString() + '\n');
				}
			}
		}
		return enForme.toString();
	}
	
	public String toStringArticlesEtStock() {
		StringBuffer enForme = new StringBuffer();
		for (Fromage f : this.lesFromages) {
			if (f.nombreArticles() > 0) {
				for (Article article : f.getArticles()) {
					enForme.append(article.toStringAvecStock() + '\n');
				}
			}
		}
		return enForme.toString();
	}
	
	public void regénérationDuStock() {
		for (Fromage f : this.lesFromages) {
			if (f.nombreArticles() > 0) {
				for (Article article : f.getArticles()) {
					article.setQuantitéEnStock((int) Math.round(Math.random()*100));
				}
			}
		}
	}
	
	public String vérificationSaisie( ) {
		StringBuffer enForme = new StringBuffer();
		for (Fromage f : this.lesFromages) {
			if (f.nombreArticles() == 0) {
				enForme.append("Pas d'articles pour " + f.toString() + '\n');
			}
		}
		return enForme.toString();
	}
	
	public List<Fromage> getLesFromages() {
		return this.lesFromages;
	}
	
	public Fromage getFromage(String désignation) {
		for (Fromage i : this.lesFromages) {
			if (i.getDésignation().equals(désignation)) {
				return i;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public Article getArticle(String désignation, String clé) {
		Fromage i = this.getFromage(désignation);
				for (Article j : i.getArticles()) {
					if (j.getClé().equals(clé)) {
						return j;
					}
		}
		throw new IllegalArgumentException();
	}
	
	public List<Fromage> fromagesAuLaitDe(TypeLait lait){
		List<Fromage> res = new LinkedList<Fromage>();
		for (Fromage i : this.lesFromages){
			if (i.getTypeFromage() == lait) {
				res.add(i);
			}
		}
		return res;
	}
	
	public int getPrix() {
		int res = 0;
		for (Fromage i : this.lesFromages) {
			for (Article j : i.getArticles()) {
				res+= j.getPrixTTC();
			}
		}
		return res;
	}
	
	public void resetPanier() {
		this.lesFromages = new LinkedList<Fromage>();
	}
	
	public void trierArticles() {
		List<Fromage> liste = new LinkedList<Fromage>();
		liste.add(this.lesFromages.get(0));
		for (Fromage i : this.lesFromages){
			for (Fromage j : liste) {
				if (i.getDésignation().compareTo(j.getDésignation()) < 0){
					liste.add(i);
					break;
				}
			}
		}
		this.lesFromages = liste;
	}
	
}
