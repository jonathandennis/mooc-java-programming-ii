
public class Result {
    
    private String country;
    private String sex;
    private int year;
    private double literacyPercent;
    
    public Result(String country, String sex, int year, double literacyPercent) {
        this.country = country;
        this.sex = sex;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
    
    public double getLiteracyPercent() {
        return this.literacyPercent;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
    }
}
