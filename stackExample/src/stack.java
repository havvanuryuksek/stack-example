
class linkedList {

    public static class Eleman {

        Eleman next;
        Eleman back;
        char data;

        Eleman(char data) {
            next = null;
            back = null;
            this.data = data;

        }
    }
    private Eleman head;
    private Eleman last;

    void add(char data) {
        Eleman tmp = new Eleman(data);
        if (head == null) {
            head = tmp;
            last = tmp;

        } else {
            last.next = tmp;
            tmp.back = last;
            last = tmp;
        }

    }

    void print() {
        Eleman tmp = last;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.back;
        }
    }
}

public class stack {

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        String word = "Merhaba";
        for (int i = 0; i < word.length(); i++) {
            ll.add(word.charAt(i));
        }
        ll.print();
    }

}
