package Interfaces.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[]results = userValidator.validateEmails(null,"Java@hard.ee");
        System.out.println(results[0]);
        System.out.println(results[1]);

    }

    static class UserValidator {
        public String[] validateEmails(String email, String alternativeEmail) {

            class Email {
                private String email;

                public Email(String email) {
                    if (email == null || email.isEmpty()) {
                        this.email = "unknown e-mail";
                    } else {
                        this.email = email;
                    }
                }
            }
            Email email1 = new Email(email);
            Email email2 = new Email(alternativeEmail);
            return new String[]{email1.email, email2.email};
        }

        public static final Pattern emailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);

        public static boolean validate(String emailStr) {
            Matcher matcher = emailRegex.matcher(emailStr);
            return matcher.find();
        }

    }

}

