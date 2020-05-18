public class PasswordValidation {
  public static boolean validate(String password) {
    if (password.length() <= 7) {
      System.out.println("not long enough");
      return false;
    }

    if(!password.matches(".*\\d.*")){
      System.out.println("No number");
      return false;
    }

    return true;
  }
}
