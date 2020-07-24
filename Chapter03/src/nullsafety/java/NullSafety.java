package nullsafety.java;

import com.sun.istack.internal.Nullable;

public class NullSafety {
    public static void main(String[] args) {
        System.out.println(new NullSafety().getCountForCharacter("Hardik", 'a'));

    }

    private int getCountForCharacter(@Nullable final String data, final char characterToSearch) {
        int count = 0;
        if (data != null) {
            for (char c : data.toCharArray()) {
                if (c == characterToSearch) {
                    count++;
                }
            }
        }
        return count;
    }
}
