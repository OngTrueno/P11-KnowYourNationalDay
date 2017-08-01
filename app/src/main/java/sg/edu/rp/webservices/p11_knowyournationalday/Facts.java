package sg.edu.rp.webservices.p11_knowyournationalday;

/**
 * Created by 15017470 on 1/8/2017.
 */

public class Facts {
    private int id;
    private String factsContent;

    public Facts(int id, String factsContent){
        this.id=id;
        this.factsContent=factsContent;
    }

    public int getId() {
        return id;
    }

    public String getFactsContent() {
        return factsContent;
    }

    public void setFactsContent(String factsContent) {
        this.factsContent = factsContent;
    }
}
