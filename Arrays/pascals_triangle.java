import java.util.*;

class pascals_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0)
            return res;
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        res.add(first_row);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = res.get(i - 1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1);
            for (int j = 1; j < i; j++) {
                curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            curr_row.add(1);
            res.add(curr_row);
        }
        return res;
    }
}
