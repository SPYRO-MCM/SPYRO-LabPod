public class Person {

    public String firstName;
    public String lastName;
    private int weight;
    private int memberId;
    private String[] goals;



    public Person(String firstName, String lastName, int weight, int memberId, String[] goals){

        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.memberId = memberId;
        this.goals = goals;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public void setGoals(String[] goals) {
        this.goals = goals;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getMemberId(){
        return this.memberId;
    }

    public String[] getGoals() {
        return goals;
    }
}
