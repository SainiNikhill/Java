package String;

// StringBuffer is a mutable string;


public class StringB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("nikhil bhaiji");
        // capacity 
        System.out.println(sb.capacity()); // we also have another method for capacity .ensureCapacity(minimumCapacity:100);
        // length 
        System.out.println(sb.length()); // we also have another method to setLength .newLength(newLength:20)
        sb.append("saini");
        sb.insert(3,"papa");
        sb.replace(0,5,"desiii");
        System.out.println(sb);

    }
    
    
    
}
