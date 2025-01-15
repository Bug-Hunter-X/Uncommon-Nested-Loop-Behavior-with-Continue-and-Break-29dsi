public class UncommonBug {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 7;

        while (x < 5) {
            x++;
            if (x == 3) {
                continue;
            }
            y++;
            if (y == 2) {
                break;
            }
            z--;
        }
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}