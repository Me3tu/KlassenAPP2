import android.widget.ArrayAdapter;

public class User   {

    private String mon;
    private String die;
    private String mit;
    private String don;
    private String fri;

    public User() {
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getDie() {
        return die;
    }

    public void setDie(String die) {
        this.die = die;
    }

    public String getMit() {
        return mit;
    }

    public void setMit(String mit) {
        this.mit = mit;
    }

    public String getDon() {
        return don;
    }

    public void setDon(String don) {
        this.don = don;
    }

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    public User(String mon, String die, String mit, String don, String fri) {
        this.mon = mon;
        this.die = die;
        this.mit = mit;
        this.don = don;
        this.fri = fri;




    }



}
