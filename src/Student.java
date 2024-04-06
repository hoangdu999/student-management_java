class Student {
    private String firstName;
    private String lastName;
    private int id;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ",lastName='" + lastName + '\'' +
                ",id=" + id +
                '}';
    }
}
