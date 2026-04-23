package Java_Design_Patterns_Demo.src;

class UserProfile {
    private String name;
    private int age;
    private String city;

    private UserProfile(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    public void showProfile() {
        System.out.println("Name = " + name + ", Age = " + age + ", City = " + city);
    }

    // Builder helps create complex objects step by step.
    static class Builder {
        private String name;
        private int age;
        private String city;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }
}

public class BuilderPatternDemo {

    public static void main(String[] args) {
        UserProfile user = new UserProfile.Builder()
                .setName("Akash")
                .setAge(25)
                .setCity("Colombo")
                .build();

        user.showProfile();
    }
}
