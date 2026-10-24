package library;

public class Member extends Person {

    public Member(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Member ID: " + getId());
        System.out.println("Member Name: " + getName());
    }
}