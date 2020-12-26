package contest;

import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> st = new ArrayList<Integer>();
        ArrayList<Integer> sa = new ArrayList<Integer>();
        for (int i : students)
            st.add(i);
        for (int i : sandwiches)
            sa.add(i);
        int c = 0;
        while (sa.size() > 0) {
            if (st.get(0) == sa.get(0)) {
                sa.remove(0);
                st.remove(0);
                c = 0;
            } else {
                st.add(st.get(0));
                st.remove(0);
                c++;
                if (c == st.size())
                    return c;
            }
        }
        return 0;
    }
}