package ru.mirea.uibo1.kaburgan.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        Author a2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');

        System.out.println(a1);
        System.out.println(a2);

        a1.setEmail("newEmail@domain.com");
        System.out.println("Имя: " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Пол: " + a1.getGender());
        System.out.println(a1);
    }
}
