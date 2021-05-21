
public class Book implements Comparable<Book>{
    
    private String title;
    private int recommendedAge;
    
    public Book(String title, int recommendedAge) {
        this.title = title;
        this.recommendedAge = recommendedAge;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getRecommendedAge() {
        return this.recommendedAge;
    }
    
    @Override
    public String toString() {
        return this.title + " (recommended for " + this.recommendedAge + " year-olds or older)";
    }
    
    @Override
    public int compareTo(Book another) {
        if (this.recommendedAge == another.recommendedAge) {
            return this.title.compareTo(another.title);
        }
        return this.recommendedAge - another.recommendedAge;
    }
}
