package Greedy;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

class meeting {
    int start;
    int end;
    int pos;

    meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }

}

class meetingComparator implements Comparator<meeting> {

    @Override
    public int compare(meeting o1, meeting o2) {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if (o1.pos < o2.pos)
            return -1;
        return 1;
    }

}

class n_meeting_problem {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        int N = 6;
        System.out.println(nmeeting(start, end, N));
    }

    private static int nmeeting(int[] start, int[] end, int n) {
        ArrayList<meeting> ar = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ar.add(new meeting(start[i], end[i], i + 1));
        meetingComparator mc = new meetingComparator();
        Collections.sort(ar, mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(ar.get(0).pos);
        int limit = ar.get(0).end;
        for (int i = 1; i < start.length; i++) {
            if (ar.get(i).start > limit) {
                limit = ar.get(i).end;
                answer.add(ar.get(i).pos);
            }
        }
        return answer.size();
    }
}