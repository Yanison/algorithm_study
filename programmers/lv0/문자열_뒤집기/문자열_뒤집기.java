package programmers.lv0.문자열_뒤집기;

public class 문자열_뒤집기 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        append();
        sb.deleteCharAt(3);
        sb.delete(3, 5);
        String str = sb.toString();
        System.out.println(str);

        sb.reverse();
        sb.setCharAt(0, 'A');
        sb.setLength(5);
        sb.trimToSize();
        System.out.println(sb);
    }


    public static void append(){
        /**
         * append() 메소드는 문자열을 뒤에 추가한다.
         * 메소드 체이닝으로 계속해서 추가할 수 있다.
         * 파라미터로 들어올 수 있는 타입은 char, int, long, float, double, boolean, char[], CharSequence 등이 있다.
         */
        StringBuilder sb = new StringBuilder("abc");
        sb.append(4).append("string");
        System.out.println(sb);


        /**
         * 1. append(CharSequence s, int start, int end)
         */

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello").append(" World", 1, 5).append("!");
        System.out.println(sb2);
        // Hello World!

        /**
         * 2. append(char[] str, int offset, int len)
         */
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        StringBuilder sb3 = new StringBuilder("Greeting: ");
        sb3.append(charArray, 6, 5); // charArray[6]부터 5개 문자를 추가
        System.out.println(sb3);
        // Greeting: World
    }

    public static void insert(){
        StringBuilder sb = new StringBuilder("abc");
        sb.insert(2, "ccc");
        System.out.println(sb);
    }

    public static void replace(){
        StringBuilder sb = new StringBuilder("abc");
        sb.replace(3, 6, "hi");
        System.out.println(sb);
    }

    public static void substring(){
        StringBuilder sb = new StringBuilder("abc");
        sb.substring(3);
        System.out.println(sb);
    }

    public static void charAt(){
        StringBuilder sb = new StringBuilder("abc");
        sb.charAt(1);
        System.out.println(sb);
    }

    public static void deleteCharAt(){
        StringBuilder sb = new StringBuilder("abc");
        sb.deleteCharAt(1);
        System.out.println(sb);
    }

    public static void delete(){
        StringBuilder sb = new StringBuilder("abc");
        sb.delete(1, 2);
        System.out.println(sb);
    }

    public static void reverse(){
        StringBuilder sb = new StringBuilder("abc");
        sb.reverse();
        System.out.println(sb);
    }

    public static void setCharAt(){
        StringBuilder sb = new StringBuilder("abc");
        sb.setCharAt(1, 'd');
        System.out.println(sb);
    }

    public static void setLength(){
        StringBuilder sb = new StringBuilder("abc");
        sb.setLength(5);
        System.out.println(sb);
    }

    public static void trimToSize(){
        StringBuilder sb = new StringBuilder("abc");
        sb.trimToSize();
        System.out.println(sb);
    }
}
