public class Membership {
    private Person person;
    private String membershipType;
    private double membershipCost;
    private String subscription;
    private boolean active;


    public Membership(Person person, String membershipType, double membershipCost, String subscription, boolean active){

        this.person = person;
        this.membershipType = membershipType;
        this.membershipCost = membershipCost;
        this.subscription = subscription;
        this.active = active;
    }

    //Setters
    public void setPerson(Person person){
        this.person = person;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setMembershipCost(double membershipCost) {
        this.membershipCost = membershipCost;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Person getPerson() {
        return person;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public double getMembershipCost() {
        return membershipCost;
    }

    public String getSubscription() {
        return subscription;
    }

    public boolean isActive() {
        return active;
    }
}
