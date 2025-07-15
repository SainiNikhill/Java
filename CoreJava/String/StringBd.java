package String;

// string builder is not thread safe but its is faster;

public class StringBd {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" world");
        System.out.println(sbd);
    }
    
}
