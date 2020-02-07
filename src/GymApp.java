import java.util.Arrays;

public class GymApp {

    private Membership[] memberships;
    private static int totalMembers = 3;

    public GymApp(Membership[] memberships){
        this.memberships = memberships;
    }

    public static int getTotalMembers(){
        return totalMembers;
    }


    public static void main(String[] args){

        // initial persons //
        Person miguel = new Person("Miguel","Vera",285, 1,new String[]{"lose 50lbs"," get stronger"});
//        System.out.println(miguel.firstName);
        Person ashley = new Person("Ashely","Gomez",110, 2,new String[]{"lose 5lbs"," get stronger"});
//        System.out.println(miguel.firstName);
        Person heather = new Person("Heather","Gibson",105, 3,new String[]{"lose 5lbs"," get stronger"});
//        System.out.println(miguel.firstName);
//
//        miguel.setWeight(110);
//        System.out.println(miguel.getWeight());

        Membership member1 = new Membership(miguel, "elite", 40.00, "monthly", true);
        Membership member2 = new Membership(ashley,"basic", 20.00, "monthly", true );
        Membership member3 = new Membership(heather, "gold", 10.00, "monthly", true);

        Membership[] currentMembers = new Membership[]{member1,member2,member3};

        GymApp app = new GymApp(currentMembers);

        System.out.println("Total members: " + GymApp.getTotalMembers());
        app.addMember(app.memberships, new Membership(
                new Person("rachel", "castaneda", 110,57, new String[]{"get muscle", "do 2 push-ups"}), "elite", 400.00, "annual", true)

        );

        for(Membership member : currentMembers){
//            System.out.println(member.getPerson().firstName);
            printPersonInfo(member.getPerson());
        }

    }
    // Add a member, add membership to array, increase total members
    public static Membership[] addMember(Membership[] oldMembershipArray, Membership newMembership){
        Membership[] returnArray;
        returnArray = Arrays.copyOf(oldMembershipArray, oldMembershipArray.length+1);
        returnArray[returnArray.length - 1] = newMembership;
        GymApp.totalMembers++;
        return returnArray;
    }


    // Delete a member
    // Print Person Info
    public static void printPersonInfo(Person personObj){

        System.out.println("Person's information below:\n");
        System.out.printf("First Name: %s\n" +
                "Last Name: %s\n" +
                "Weight: %d\n" +
                "Member ID: %d\n", personObj.firstName,personObj.lastName,personObj.getWeight(),personObj.getMemberId());
        System.out.println("Gym Goals: ");
        for(String goals : personObj.getGoals()){
            System.out.printf("%s ", goals);
        }
        System.out.println();

    }

    // Edit Person Info
}
