public class User {
    private String name;
    private String mobileNumber;
    private String address;
    private String email;

    public User(String name, String mobileNumber, String address, String email) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.email = email;
    }

    public boolean validateInput() {
        // Validate mobile number
        if (name.length() > 20) {
            System.out.println("Invalid name: name should not be more than 20 characters");
            return false;
        }
        if (mobileNumber.length() != 10) {
            System.out.println("Invalid mobile number: mobile number should be 10 digits");
            return false;
        }

        // Validate email
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email: email should contain @ and .");
            return false;
        }

        return true;
    }
}
