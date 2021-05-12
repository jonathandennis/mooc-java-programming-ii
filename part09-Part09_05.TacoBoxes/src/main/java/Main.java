
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox jd = new TripleTacoBox();
        CustomTacoBox lj = new CustomTacoBox(5);
        
        jd.eat();
        lj.eat();
        jd.eat();
        lj.eat();
        lj.eat();
        System.out.println(jd.tacosRemaining());
        System.out.println(lj.tacosRemaining());
        jd.eat();
        jd.eat();
        lj.eat();
        lj.eat();
        lj.eat();
        System.out.println(jd.tacosRemaining());
        System.out.println(lj.tacosRemaining());
    }
}
