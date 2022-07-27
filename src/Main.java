import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isPalindrom();                  //Ex.1

        getCharCount();                //Ex.2

        hobbies();                      //Ex.3

        if (isPasswordValid()) {        //Ex.4
            System.out.println("Parola introdusa este corect scrisa");
        } else System.out.println("Parola introdusa nu este corect scrisa");

        checkPassword();                //Ex.5


    }

    //Ex.1 Afiseaza daca un cuvant este palindrom sau nu
    public static void isPalindrom() {
        Scanner console = new Scanner(System.in);
        System.out.print("Introdu un cuvant: ");
        String word = console.nextLine();
        boolean isPalindrom = false;
        String reverseString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseString = reverseString + word.charAt(i);
        }
        if (word.equals(reverseString)) {
            isPalindrom = true;
            System.out.println("Cuvantul introdus este palindrom");
        } else {
            System.out.println("Cuvantul introdus nu este palindrom");
        }
    }

    //Ex.2 Afiseaza cate litere, numere, spatii si caractere sunt intr-un String
    public static void getCharCount() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = console.nextLine();
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int characters = 0;

        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            } else if (Character.isDigit(sentence.charAt(i))) {
                numbers++;
            } else if (Character.isWhitespace(sentence.charAt(i))) {
                spaces++;
            } else {
                characters++;
            }
        }

        System.out.println(letters + " letters, " + numbers + " numbers, " + spaces + " spaces and " + characters + " characters");
    }


    //Ex.3 Scrie un program prin care utilizatorul sa introduca de la tastatura hobby-uri ca String-uri,
    // pana cand introduce cuvantul “stop” sau “exit”. Utilizatorul poate introduce maxim 10 hobby-uri.
    // Fiecare hobby este adaugat intr-un array de string-uri. La sfarsit, cand utilizatorul a introdus
    // “stop” sau “exit” se vor afisa in consola toate hobby-urile din array

    public static void hobbies() {
        String[] hobbies = new String[10];
        int numberOfHobbies = 0;
        for (int j = 1; j <= 10; j++) {
            Scanner console = new Scanner(System.in);
            System.out.print("Introdu un hobby: ");
            String hobby = console.nextLine();
            if (hobby.equals("stop") || hobby.equals("exit")) {
                System.out.println("Lista de hobby-uri este urmatoarea: ");
                for (int i = 0; i < numberOfHobbies; i++) {
                    System.out.println(hobbies[i]);
                    break;
                }
            } else {
                numberOfHobbies++;
                hobbies[numberOfHobbies] = hobby;
            }
        }
    }

    //Ex.4 Dezvolti partea de creare a unui nou cont intr-un magazin online si trebuie sa validezi ca parola aleasa
    //de utilizator este corect scrisa. Scrie un program care sa verifice daca o parola este corecta.
    //Regulile pentru ca o parola sa fie corecta sunt:
    //1.parola trebuie sa aiba minim 10 caractere
    //2.parola trebuie sa aiba doar litere sau cifre
    //3.parola trebuie sa contina cel putin doua cifre
    //Daca parola introdusa nu este valida afiseaza un mesaj sugestiv si permite utilizatorul sa introduca o alta parola,
    //pana cand introduce o parola valida (respecta regulile)

    public static boolean isPasswordValid() {
        Scanner console = new Scanner(System.in);
        System.out.print("Introdu parola: ");
        String password = console.nextLine();
        int countDigits = 0;

        if (password.length() < 10) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i)))) {
                return false;
            }
            if (Character.isDigit(password.charAt(i))) {
                countDigits++;
            }
        }
        if (countDigits < 2) {
            return false;
        }
        return true;
    }


    //Ex.5 Scrie un program care sa citeasca parola utilizatorului de la tastatura, de maxim 3 ori.
    //Parola introdusa este verificata cu o parola existenta (se declara o variabila string care retine parola
    //existenta, corecta) si sa afiseaze un mesaj corespunzator:
    //a.“Cont blocat”, daca introduce gresit de 3 ori parola
    //b.“Te-ai logat”, daca introduce parola corect din maxim 3 incercari
    public static void checkPassword() {
        String existingPassword = "ABC";
        boolean isCorectPassword = false;
        int i = 1;
        while ((i <= 3) && (!isCorectPassword)) {
            Scanner console = new Scanner(System.in);
            System.out.print("Introdu parola: ");
            String providedPassword = console.nextLine();
            if (existingPassword.equals(providedPassword)) {
                System.out.println("Parola introdusa este corecta ");
                isCorectPassword = true;
            }
            i++;
        }
        if (isCorectPassword == false) {
            System.out.println("Parola introdusa nu este corecta ");
        }
    }

    //Ex.6 Afisarea String-urilor de lungime para dintr-un Array de String-uri
    public static void stringPar() {
        Scanner console = new Scanner(System.in);
        System.out.println("Introdu numarul de elemente: ");
        int length = console.nextInt();
        String[] input = new String[length];
        System.out.println("Introdu elementele din lista ");
        for (int i = 0; i < length; i++) {
            String userInser = console.next();
            input[i] = userInser;
        }
        System.out.println("String-urilor de lungime para din Array-ul de String-uri este ");
        for (int i = 0; i < length; i++) {
            if (input[i].length() % 2 == 0) {
                System.out.print(input[i] + " ");
            }
        }
    }
}
