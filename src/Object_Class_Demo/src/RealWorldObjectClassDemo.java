package Object_Class_Demo.src;

class UserAccount {
    private int id;
    private String userName;

    public UserAccount(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserAccount{id=" + id + ", userName='" + userName + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        UserAccount other = (UserAccount) obj;
        return id == other.id && userName.equals(other.userName);
    }

    @Override
    public int hashCode() {
        return id + userName.hashCode();
    }
}

public class RealWorldObjectClassDemo {

    public static void main(String[] args) {
        UserAccount user1 = new UserAccount(1, "Akash");
        UserAccount user2 = new UserAccount(1, "Akash");

        System.out.println(user1.toString());
        System.out.println("Are equal? " + user1.equals(user2));
        System.out.println("Class type: " + user1.getClass().getSimpleName());
    }
}
