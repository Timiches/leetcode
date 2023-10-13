import java.util.LinkedList;

public class t735_AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        boolean collide;
        LinkedList<Integer> asteroidsList = toLL(asteroids);
        do {
            collide = false;
            for (int i = 0; i < asteroidsList.size(); i++) {
                if (i < 0)
                    i = 0;
                if (i + 1 >= asteroidsList.size())
                    break;
                if (asteroidsList.get(i) > 0 && asteroidsList.get(i + 1) < 0) {
                    if (asteroidsList.get(i) > Math.abs(asteroidsList.get(i + 1))) {
                        asteroidsList.remove(i + 1);
                        i--;
                    } else if (asteroidsList.get(i) < Math.abs(asteroidsList.get(i + 1))) {
                        asteroidsList.remove(i);
                        i -= 2;
                    } else {
                        asteroidsList.remove(i + 1);
                        asteroidsList.remove(i);
                        i -= 2;
                    }
                    collide = true;
                }
            }
        } while (collide);

        return toArray(asteroidsList);
    }

    private LinkedList<Integer> toLL(int[] in) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int j : in) {
            result.add(j);
        }
        return result;
    }

    private int[] toArray(LinkedList<Integer> in) {
        int[] result = new int[in.size()];
        for (int i = 0; i < in.size(); i++) {
            result[i] = in.get(i);
        }
        return result;
    }
}
