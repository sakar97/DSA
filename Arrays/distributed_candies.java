import java.util.*;

class candies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candyType)
            kinds.add(candy);
        return kinds.size() >= candyType.length / 2 ? candyType.length / 2 : kinds.size();

    }
}
