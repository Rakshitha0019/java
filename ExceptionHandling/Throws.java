class Throws {

    static void checkNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Negative number not allowed");
        }
        System.out.println("Valid number");
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}