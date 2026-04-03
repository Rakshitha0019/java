class UserdefMethod{
    void hello() {
        System.out.println("This is a user-defined method.");
    }

    public static void main(String[] args) {
        UserdefMethod obj = new UserdefMethod(); // Create object
        obj.hello();             // Call method
    }
}
