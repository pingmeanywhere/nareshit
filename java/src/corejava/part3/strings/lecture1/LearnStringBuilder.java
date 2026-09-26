package corejava.part3.strings.lecture1;

public class LearnStringBuilder {


    static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("hellohello");

        System.out.println(sb.delete(0, 1));
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("hellohey");
        System.out.println(sb.capacity());
        System.out.println(sb);

    }
}
