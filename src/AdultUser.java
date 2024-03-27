class AdultUser implements LibraryUser{
    private int age;
    private String bookType;


    @Override
    public void registerAccount(int age) {
//        this.age = age;
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days");
        }else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
