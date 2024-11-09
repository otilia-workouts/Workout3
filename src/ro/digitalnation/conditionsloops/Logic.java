package ro.digitalnation.conditionsloops;

import static java.lang.Math.sqrt;

public class Logic {

    public static boolean ex1(int a, int b, int c) {
        //Exeritiul 1: Scrieti un program Java care citeste de la tastatura 3 numere si verifica daca minim doua dintre ele sunt pozitive (Ex: 2, -4, -7 -> false; 2, 5, 8 -> true)
        if ((a > 0 && b > 0) || (b > 0 && c > 0) || (c > 0 && a > 0))
            return true;
        return false;
    }

    public static int ex2(int a, int b, int c) {
        //Exeritiul 2: Scrieti un program Java ce determina numarul cel mai mare din trei numere citite de la tastatura fara a folosi if case (se vor folosi operatori ternari).
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static int ex3(int a, int b) {
        //Exercitiul 3: Scrieti un program Java ce afiseaza suma valorilor impare dintr-un interval dat (Ex: citit 2, 9 -> se aduna 3, 5, 7, 9, deci rezultatul returnat este 24)
        int sum = 0;
        if (a % 2 == 0)
            a++;
        for (int number = a; number <= b; number += 2) {
            sum += number;
        }
        return sum;
    }

    public static boolean ex4(int nr) {
        //Exercitiul 4: Scrieti un program Java ce verifica daca un numar este prim sau nu. (Numar Prim = se imparte doar la 1 si la el insusi - ex: 2, 3, 5, 7, 11, 13, 17...)

        if (nr < 2)
            return false;
        if (nr == 2)
            return true;
        if (nr % 2 == 0)
            return false;

        double number = sqrt(nr);
        for (int divisor = 3; divisor <= number; divisor += 2)
            if (nr % divisor == 0)
                return false;
        return true;
    }

    public static boolean ex5(String s) {
        //Exercitiul 5: Scrieti un program Java ce verifica daca un String este palindrom sau nu. (Palindrom = string ce arata la fel citit de la dreapta la stranga, ca si de la stanga la dreapta - ex: ana, cojoc, reper, 123321...)
        int length = s.length();
        for (int index = 0; index < length / 2; index++) {
            if (s.charAt(index) != s.charAt(length - 1 - index))
                return false;
        }
        return true;
    }

    public static int ex6(int n) {
        //Exercitiul 6: Afisati primele N numere din sirul lui Fibonacci (Sirul lui Fibonacci - fiecare numar este egal cu suma numerelor de dinainte - incepand cu 1, 1 -> 1, 1, 2, 3, 5, 8, 13, 21, 34...)
        //Returneaza al N-lea numar
        int a = 1, b = 1;
        System.out.print(a + ' ');
        if (n == 1) {
            return a;
        }
        System.out.print(b + ' ');
        if (n == 2) {
            return b;
        }

        for (int index = 3; index <= n; index++) {
            b = a + b;
            a = b - a;
            System.out.print(b + ' ');
        }
        return b;
    }

    /**
     * @param n a positive integer
     *          <br> a perfect number is a number that is half the sum of all of its positive divisors;
     *          <br> sum of divisors=2*n,
     *          <br> the first perfect number is 6
     * @return true if  n is a perfect number,
     * <br> false otherwise
     */
    public static boolean ex7(int n) {
        //Exercitiul 7: Scrieti un program ce verifica dacă un număr natural, introdus de la tastatură, este pefect (egal cu suma divizorilor mai mici ca el; ex: 6=1+2+3)
        if (n < 6)
            return false;
        int sum = 3;
        for (int divisor = 3; divisor <= n / 2; divisor++) {
            if (n % divisor == 0)
                sum += divisor;
        }
        return sum == n;
    }

    public static int ex8(int x) {
        //Exercitiul 8: Sa se determine valoarea functiei de mai jos pentru x (intreg) citit de la tastatura:
        //f(x) = x+10, pentru x <= -5;
        //x * 2, pentru -5 < x <= 10;
        //x^2 + 50, pentru x >10
        if (x <= -5)
            return x + 10;
        if (x <= 10)
            return x * 2;
        return x * x + 50;
    }

    public static double ex9(String valuta, int valoare) {
        //Exercitiul 9: Realizati un program ce simuleaza un calculator de schimb valutar. Alegeti 5 valute (EUR, USD, GBP, MDL, CAD), setati valoarea de schimb Valuta-RON pentru fiecare (hardcoded in variabile). De la tastatura se va introduce moneda dorita si suma in RON ce se doreste a fi schimbata si se afiseaza valoarea returnata in moneda respectiva (Ex: EUR-1000 -> afiseaza 204).
        //Constrangere: Se va folosi switch case.
        //Folositi drept valori hardcodate urmatoarele: 1 EUR = 4.9 RON; 1 USD = 4.6 RON; 1 GDP = 5.6 RON; 1 MDL = 0.25 RON; 1 CAD = 3.3 RON;
        final double EUR=4.9;
        final double USD=4.6;
        final double GDP=5.6;
        final double MDL=0.25;
        final double CAD=3.3;
        switch (valuta) {
            case "EUR":
                System.out.println(valoare / EUR);
                return valoare / EUR;
            case "USD":
                System.out.println(valoare / USD);
                return valoare / USD;
            case "GDP":
                System.out.println(valoare / GDP);
                return valoare / GDP;
            case "MDL":
                System.out.println(valoare / MDL);
                return valoare / MDL;
            case "CAD":
                System.out.println(valoare / CAD);
                return valoare / CAD;
            default:
                return 0;
        }
    }

    public static boolean ex10(String pass) {
        //Exercitiul 10: Se citeste de la tastatura un String. Sa se verifice daca acesta indeplineste constrangerile pentru a fi o parola sigura
        //Parola sigura are lungimea de minim 8, litere lowercase si uppercase, minim o cifra, minim un caracter special (ex: pass - false, XKs4yGC[Sm - true)
        String regex="(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-\\[\\]{}]).{8,}";
        return pass.matches(regex);
    }
}
