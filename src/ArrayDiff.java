import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args){
        final int[] res = arrayDiff(new int [] {1,2,2}, new int[] {1});
        System.out.println(Arrays.toString(res));
    }

    public static int[] arrayDiff(final int[] a, final int[] b) throws NullPointerException{
        if (a == null || b == null) throw new NullPointerException("arrays cannot be null pointers");
        return Arrays.stream(a).filter(el -> Arrays.stream(b).noneMatch(e -> e == el)).toArray();
    }
}
