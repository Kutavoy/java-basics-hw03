public class Student {
  int rating;
  private String name;

  // TODO implement Student class according to the instructions provided in the README.md file
  public static int studentsCount;
  public static double totalRating;
  public static double averageStaticRating;

  public Student(String name) {
    //TODO initialize name
    this.name = name;
    studentsCount++;
  }

  public static double getAvgRating() {
    // TODO return average rating of all students
    if (studentsCount != 0) {
      averageStaticRating = (totalRating / studentsCount);
    }
    return averageStaticRating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    // TODO set student's name
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public int setRating(int rating) {
    // TODO initialize rating;
    this.rating = rating;
    totalRating += this.rating;
    return rating;
  }

  public boolean betterStudent(Student student) {
    // TODO return the result of comparing this.student's rating with the student's rating
    if (this.rating > student.rating) {
      return true;
    } else {
      return false;
    }
  }

  public void changeRating(int rating) {
    // TODO change this student's rating and average rating of all students
    totalRating -= this.rating;
    this.rating = setRating(rating);
  }

  public static void removeStudent(Student student) {
    // TODO remove student
    studentsCount = 0;
    student.rating = 0;
    totalRating = 0;
    averageStaticRating = 0;
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return name + " " + rating;
  }
}
