package Aggregation_

class Course {
    // Independent object for aggregation example.
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}

class Student {
    // Student uses Course through aggregation.
    String studentName;
    Course course;

    public Student(String studentName, Course course) {
        this.studentName = studentName;
        this.course = course;
    }

    public void displayStudentCourse() {
        System.out.println(studentName + " follows " + course.courseName);
    }
}

class Room {
    // A room object used inside a house.
    int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}

class House {
    // House strongly owns its rooms.
    private Room[] rooms;

    public House() {
        // Rooms are created inside the House constructor.
        rooms = new Room[2];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println("Room number: " + room.roomNumber);
        }
    }
}

public class AggregationCompositionComparisonDemo {

    public static void main(String[] args) {
        // Aggregation example
        Course javaCourse = new Course("Java Programming");
        Student student = new Student("Saman", javaCourse);
        student.displayStudentCourse();

        System.out.println();

        // Composition example
        House house = new House();
        house.showRooms();
    }
}
