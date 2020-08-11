//Pegas ma konstruktor domyślny, który wykonuje (niejawnie) konstruktor z Bird. Konstruktor wywołuje sayName,
//        która jest przeciążona w Pegas, dlatego wypisuje "Pegas"
//        A przesłanianie ukrywa metody, które ma pegas, których nie ma w Bird, tylko że w tym przypadku nie ma takich metod, więc to nie ma znaczenia.


//Popatrz masz np. klasę Figura, która ma funkcję oblicz pole.
//        Tworzysz klasę Kwadrat która dziedziczy po Figura i ma funkcję obliczPole()
//        I drugą klasę Trojkat, która też dziedziczy po Figura i ma funkcję obliczPole() z tym, że ta funkcja działa inaczej,
//        bo inaczej liczysz pole dla kwadratu a inaczej dla trójkąta

//        I teraz popatrz, tworzysz dwa obiekty
//        Figura a = new Kwadrat()
//        Figura b = new Trójkąt()

//I teraz tak, zarówno a i b są Figurą,
//        Ale wywołanie obliczPole() da inny wynik
//        To jest właśnie polimorfizm
//        Ten sam typ, ale inaczej działa metoda
//        I jeszcze jedna rzecz
//        Nie pytasz czy a jest typu Figura czy Keadrat
//        Bo a jest jednym i drugim
//        Tylko, że Figura jest wyżej w hierarchii


class Bird{
    public Bird(){
        sayName();
    }

    public void sayName() {
        System.out.println("Bird");
    }
}

class Pegas extends Bird{

    @Override
    public void sayName(){
        System.out.println("Pegas");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bird pegas = new Pegas();
    }
}
